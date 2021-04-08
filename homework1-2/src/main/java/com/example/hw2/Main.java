package com.example.hw2;

import com.example.hw2.beans.*;
import com.example.hw2.configs.Config2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context1 =
                new AnnotationConfigApplicationContext(Config2.class);

        System.out.println("-----");
        context1.close();

        System.out.println("-----");
        ApplicationContext context
                = new AnnotationConfigApplicationContext(Config2.class);
        for (String bean : context.getBeanDefinitionNames()) {
            System.out.println(bean);
        }

        System.out.println("-----");
        System.out.println(context.getBean(BeanA.class));
        System.out.println(context.getBean(BeanB.class));
        System.out.println(context.getBean(BeanC.class));
        System.out.println(context.getBean(BeanD.class));
        System.out.println(context.getBean(BeanE.class));
        System.out.println(context.getBean(BeanF.class));

    }
}
