package com.springsecurity.example.securitybasic;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        // set configuration on auth object
        auth.inMemoryAuthentication().withUser("user").
                password("password").roles("USER");
    }
}
