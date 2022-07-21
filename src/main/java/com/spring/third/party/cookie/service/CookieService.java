package com.spring.third.party.cookie.service;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.proxy.CaptureType;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

@Service
public class CookieService {
    private final List<JSONArray> cookies = new ArrayList<>();
    private int emptyCookie = 0;

    public String getCookie(String loginUrl, String username, String password, String cookieName) {
        emptyCookie = 0;
        Instant start = Instant.now();
        Instant end = Instant.now();

        System.err.println(".....Started getCookie.....");
        System.err.println("received : ");
        System.err.println("loginUrl : " + loginUrl);
        System.err.println("username : " + username);
        System.err.println("password : " + password);
        System.err.println("cookieName : " + cookieName);

        BrowserMobProxy myProxy = new BrowserMobProxyServer();

        myProxy.start(0);

        Proxy seleniumProxy = new Proxy();
        seleniumProxy.setHttpProxy("localhost:" + myProxy.getPort());
        seleniumProxy.setSslProxy("localhost:" + myProxy.getPort());

        EnumSet<CaptureType> captureTypes = CaptureType.getAllContentCaptureTypes();
        captureTypes.addAll(CaptureType.getCookieCaptureTypes());
        captureTypes.addAll(CaptureType.getHeaderCaptureTypes());
        captureTypes.addAll(CaptureType.getRequestCaptureTypes());
        captureTypes.addAll(CaptureType.getResponseCaptureTypes());

        myProxy.setHarCaptureTypes(captureTypes);

        myProxy.newHar("MyHAR");

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability(CapabilityType.PROXY, seleniumProxy);
        capability.acceptInsecureCerts();
        capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        capability.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capability);
        WebDriver driver = new ChromeDriver(options);

        driver.get(loginUrl);

        driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        WebElement clickButton = driver.findElement(By.xpath("//button[@id='login-button']"));
        clickButton.click();

        end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.err.println("Time taken upto login button clicked : " + timeElapsed.toSeconds() + " seconds");

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }

        end = Instant.now();
        timeElapsed = Duration.between(start, end);
        System.err.println("Time taken before generating HAR : " + timeElapsed.toSeconds() + " seconds");

        Har har = myProxy.getHar();

        end = Instant.now();
        timeElapsed = Duration.between(start, end);
        System.err.println("Time taken after generating HAR : " + timeElapsed.toSeconds() + " seconds");

        String getHarString = getHarString(har);
        String cookie = extractCookie(getHarString, cookieName);
        System.err.println("==> Cookie : connect.sid=" + cookie);

        driver.close();

        end = Instant.now();
        timeElapsed = Duration.between(start, end);
        System.err.println(".....The END.....");
        System.err.println("Time taken: " + timeElapsed.toSeconds() + " seconds");
        return cookie;
    }

    private void writeHarFile(Har har) {
        File myHARFile = new File("network_history.json");
        try {
            har.writeTo(myHARFile);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private String getHarString(Har har) {
        StringWriter writer = new StringWriter();
        try {
            har.writeTo(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return writer.toString();
    }

    private String extractCookie(String jsonString, String cookieName) {
        String cookie = StringUtils.EMPTY;
        JSONObject jsonObject = getJsonObject(jsonString);
        getValueByKey(jsonObject, "cookies");
        System.out.println("======================================");
        System.out.println("Total Empty Cookie : " + emptyCookie);
        System.out.println("Total Cookie : " + cookies.size());
        System.out.println("======================================");
        for (JSONArray cookieArray : cookies) {
            for (Object cookieObject : cookieArray) {
                JSONObject cookieJson = getJsonObject(cookieObject.toString());
                if (cookieJson.has("name")) {
                    if (cookieJson.get("name").toString().equals(cookieName)) {
                        cookie = cookieJson.get("value").toString();
                    }
                }
            }
        }
        return cookie;
    }

    private JSONObject getJsonObject(String cookies) {
        return new JSONObject(cookies);
    }

    private JSONArray getJsonArray(String cookies) {
        return new JSONArray(cookies);
    }

    private void getValueByKey(JSONObject json, String key) {
        boolean exists = json.has(key);
        Iterator<?> keys;
        String nextKeys;
        if (!exists) {
            keys = json.keys();
            while (keys.hasNext()) {
                nextKeys = (String) keys.next();
                try {
                    if (json.get(nextKeys) instanceof JSONObject) {
                        getValueByKey(json.getJSONObject(nextKeys), key);
                    } else if (json.get(nextKeys) instanceof JSONArray) {
                        JSONArray jsonarray = json.getJSONArray(nextKeys);
                        for (int i = 0; i < jsonarray.length(); i++) {
                            String jsonArrayString = jsonarray.get(i).toString();
                            JSONObject innerJSOn = new JSONObject(jsonArrayString);
                            getValueByKey(innerJSOn, key);
                        }
                    }
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        } else {
            parseObject(json, key);
        }
    }

    private void parseObject(JSONObject json, String key) {
        if (!json.get(key).toString().equals("[]")) {
            String value = json.get(key).toString();
            cookies.add(getJsonArray(value));
        } else {
            emptyCookie++;
        }
    }
}