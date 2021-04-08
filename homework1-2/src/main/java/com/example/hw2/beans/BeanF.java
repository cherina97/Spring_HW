package com.example.hw2.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanF {

    private String name;
    private int value;

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
