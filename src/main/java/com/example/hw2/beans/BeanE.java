package com.example.hw2.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE {

    private String name;
    private int value;

    @PostConstruct
    public void postConstrict(){
        System.out.println("postConstrict() method in Bean E");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("preDestroy() method in Bean E");
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
