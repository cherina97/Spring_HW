package com.example.hw2.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("postProcessBeforeInitialization method");

        if (bean instanceof BeanA){
            ((BeanA) bean).setName("Set name with Post Processor --- Bean A");
            ((BeanA) bean).setValue(100);
        }

        if (bean instanceof BeanE){
            ((BeanE) bean).setName("Set name with Post Processor --- Bean E");
            ((BeanE) bean).setValue(200);
        }

        if (bean instanceof BeanF){
            ((BeanF) bean).setName("Set name with Post Processor --- Bean F");
            ((BeanF) bean).setValue(300);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("postProcessAfterInitialization method");
        return bean;
    }
}
