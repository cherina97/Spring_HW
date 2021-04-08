package com.example.hw2.beans;

import com.example.hw2.Validator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("postProcessBeforeInitialization method");
//        if (bean instanceof BeanA){
//            ((BeanA) bean).setName("Set name with Post Processor --- Bean A");
//            ((BeanA) bean).setValue(100);
//        }

        if (bean instanceof Validator){
            ((Validator) bean).validate();
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("postProcessAfterInitialization method");
        return bean;
    }
}
