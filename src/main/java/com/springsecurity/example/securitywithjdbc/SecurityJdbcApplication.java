package com.springsecurity.example.securitywithjdbc;

import com.springsecurity.example.securitybasic.SecurityBasicApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityJdbcApplication {

    public static void main(String args[]) {
        SpringApplication.run(SecurityJdbcApplication.class, args);
    }
}
