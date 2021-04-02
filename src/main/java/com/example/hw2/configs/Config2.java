package com.example.hw2.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import(Config1.class)
@ComponentScan("com.example.hw2.beans")
@PropertySource("app.properties")
public class Config2 {

    private Config1 config1;

    @Autowired
    public Config2(Config1 config1) {
        this.config1 = config1;
    }
}
