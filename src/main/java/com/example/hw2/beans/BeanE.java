package com.example.hw2.beans;

import com.example.hw2.Validator;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE implements Validator {

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
    public void validate() {
        System.out.println("-----");
        if (name == null){
            System.out.println("Name == null in Bean E");
        } else {
            System.out.println("Name == " + getName() + " in Bean E");
        }

        if (value <= 0){
            System.out.println("Value == 0 in Bean E");
        } else {
            System.out.println("Value == " + getValue() + " in Bean E");
        }
        System.out.println("-----");

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }


}
