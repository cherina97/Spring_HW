package com.example.configs;

import com.example.beans3.BeanD;
import com.example.beans3.BeanE;
import com.example.beans3.BeanF;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScans({
        @ComponentScan(basePackages = "com.example.beans2"),
        @ComponentScan(basePackageClasses = {BeanD.class, BeanF.class},
                excludeFilters = {
                        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = BeanE.class)})

})
public class AppConfig2 {
}

