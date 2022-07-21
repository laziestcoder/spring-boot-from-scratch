package com.spring.third.party.cookie.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.time.Instant;

@Service
public class GlencoreApiService {

    @Autowired
    CookieService cookieService;

    @Value("${third.party.requestUrl}")
    private String requestUrl;

    @Value("${third.party.siteId}")
    private String siteId;

    @Value("${third.party.baggingStationId}")
    private String baggingStationId;

    public void callSiteCarrier(String cookie) {
        Instant start = Instant.now();
        Instant end = Instant.now();

        System.err.println(".....Started callSiteCarrier.....");


        cookie = "connect.sid=" + cookie;
        System.out.println("Cookie: " + cookie);

        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("cookie", cookie);

        JSONObject map = new JSONObject();
        map.put("companyId", "application");
        map.put("resourceId", "00" + System.currentTimeMillis());
        map.put("baggingStationId", baggingStationId);

        System.out.println("Request Header: " + headers);
        System.out.println("Request Body: " + map);

        HttpEntity<String> request = new HttpEntity<>(map.toString(), headers);

        requestUrl = requestUrl + siteId + "/carrier/";
        System.err.println("requestUrl : " + requestUrl);
        ResponseEntity<String> response = restTemplate.exchange(requestUrl,
                HttpMethod.POST,
                request,
                String.class);

        System.out.println("Response Header: " + response.getHeaders());
        System.out.println("Response Body: " + response.getBody());

        end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.err.println(".....The END.....");
        System.err.println("Time taken: " + timeElapsed.toMillis() + " milliseconds");
    }

}