package com.example.hw2;

import com.example.hw2.configs.Config2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context1 =
                new AnnotationConfigApplicationContext(Config2.class);

        System.out.println("-----");
        context1.close();
    }
}
