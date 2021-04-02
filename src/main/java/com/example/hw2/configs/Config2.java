package com.example.hw2.configs;

import com.example.hw2.beans.BeanB;
import com.example.hw2.beans.BeanC;
import com.example.hw2.beans.BeanD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

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

    @Bean(initMethod = "initBeanD",
            destroyMethod = "destroyBeanD")
    public BeanD getBeanD() {
        return new BeanD();
    }

    @Bean(initMethod = "initBeanB",
            destroyMethod = "destroyBeanB")
    public BeanB getBeanB() {
        return new BeanB();
    }

    @Bean(initMethod = "initBeanC",
            destroyMethod = "destroyBeanC")
    public BeanC getBeanC() {
        return new BeanC();
    }
}
