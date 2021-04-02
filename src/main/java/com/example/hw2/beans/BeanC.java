package com.example.hw2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class BeanC {

    @Value("${beanC.name}")
    private String name;

    @Value("${beanC.value}")
    private int value;

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    private void initBeanC() {
        System.out.println("Init method Bean C");
    }

    private void destroyBeanC() {
        System.out.println("Destroy method Bean C");
    }


}
