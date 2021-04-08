package com.example.hw1.configs;

import com.example.hw1.beans3.BeanD;
import com.example.hw1.beans3.BeanE;
import com.example.hw1.beans3.BeanF;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScans({
        @ComponentScan(basePackages = "com.example.hw1.beans2"),
        @ComponentScan(basePackageClasses = {BeanD.class, BeanF.class},
                excludeFilters = {
                        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = BeanE.class)})

})
public class AppConfig2 {
}

