package com.example.hw2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class BeanA implements InitializingBean, DisposableBean {

    private String name;
    private int value;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet() method in Bean A");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy() method in Bean A");
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }



}
