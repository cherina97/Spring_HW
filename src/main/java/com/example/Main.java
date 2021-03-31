package com.example;

import com.example.configs.AppConfig1;
import com.example.configs.AppConfig2;
import com.example.task5.OtherBeanA;
import com.example.task6.ConfigTask6;
import com.example.task6.InjectConstr;
import com.example.task6.InjectField;
import com.example.task6.InjectSetter;
import com.example.task7.BeanCollection;
import com.example.task7.BeanTask8;
import com.example.task7.Config;
import com.example.task7.Interface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("==============");
        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig1.class);
        for (String bean : context1.getBeanDefinitionNames()){
            System.out.println(bean);
        }

        System.out.println("==============");
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig2.class);
        for (String bean : context2.getBeanDefinitionNames()){
            System.out.println(bean);
        }

        System.out.println("==============");
        ApplicationContext context3 = new AnnotationConfigApplicationContext(ConfigTask6.class);
        context3.getBean(InjectConstr.class).getBeansNames();

        System.out.println("==============");
        context3.getBean(InjectField.class).getBeansNames();

        System.out.println("==============");
        context3.getBean(InjectSetter.class).getBeansNames();

        System.out.println("==============");
        ApplicationContext context4 = new AnnotationConfigApplicationContext(Config.class);
        context4.getBean(BeanCollection.class).getBeans();

        System.out.println("==============");
        ApplicationContext context5 = new AnnotationConfigApplicationContext(Config.class);
        context5.getBean(BeanTask8.class).getBean();
        context5.getBean(BeanTask8.class).getPrimary();
    }

}
