package com.example.hw2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanE {

    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
