package com.example.hw2;

import com.example.hw2.beans.BeanD;
import com.example.hw2.configs.Config2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context1 = new AnnotationConfigApplicationContext(Config2.class);
        BeanD bean = context1.getBean(BeanD.class);
        System.out.println(bean);
    }
}
