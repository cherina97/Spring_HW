package com.example.hw2.beans;

import com.example.hw2.Validator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class BeanB implements Validator {

    @Value("${beanB.name}")
    private String name;

    @Value("${beanB.value}")
    private int value;

    @Override
    public void validate() {
        System.out.println("-----");
        if (name == null){
            System.out.println("Name == null in Bean B");
        } else {
            System.out.println("Name == " + getName() + " in Bean B");
        }

        if (value <= 0){
            System.out.println("Value == 0 in Bean B");
        } else {
            System.out.println("Value == " + getValue() + " in Bean B");
        }
        System.out.println("-----");
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    private void initBeanB() {
        System.out.println("Init method Bean B");
    }

    public void initBeanBWithPostProcessor() {
        System.out.println("Init method Bean B with FactoryPostProcessor");
    }

    private void destroyBeanB() {
        System.out.println("Destroy method Bean B");
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
