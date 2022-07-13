package com.spring.udemy.services.security;

/***
 Created by IntelliJ IDEA.
 User: towfiq
 Date: ১১/৪/২০
 Time: ৮:৫৮ PM
 ***/
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/14/15.
 */
@Service
public class EncryptionServiceImpl implements EncryptionService {

    private StrongPasswordEncryptor strongEncryptors;

    @Autowired
    public void setStrongEncryptors(StrongPasswordEncryptor strongEncryptors) {
        this.strongEncryptors = strongEncryptors;
    }

    public String encryptString(String input){
        return strongEncryptors.encryptPassword(input);
    }

    public boolean checkPassword(String plainPassword, String encryptedPassword){
        return strongEncryptors.checkPassword(plainPassword, encryptedPassword);
    }
}