package com.example.hw2.configs;

import com.example.hw2.beans.*;
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
    public BeanD beanD() {
        return new BeanD();
    }

    @Bean(initMethod = "initBeanB",
            destroyMethod = "destroyBeanB")
    public BeanB beanB() {
        return new BeanB();
    }

    @Bean(initMethod = "initBeanC",
            destroyMethod = "destroyBeanC")
    public BeanC beanC() {
        return new BeanC();
    }

    @Bean
    public static FactoryPostProcessor factoryPost() {
        return new FactoryPostProcessor();
    }

    @Bean
    public static PostProcessor postProcessor() {
        return new PostProcessor();
    }

}
