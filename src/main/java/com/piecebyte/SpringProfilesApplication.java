package com.piecebyte;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringProfilesApplication {
    private final Environment environment;
    public static void main(String[] args) {
        SpringApplication.run(SpringProfilesApplication.class, args);
    }
    @PostConstruct
    public void logProfile() {
        System.out.println("Active Profiles: " + Arrays.toString(environment.getActiveProfiles()));
    }
}