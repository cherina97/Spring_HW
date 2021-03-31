package com.example.task7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BeanCollection {

    @Autowired
    private List<Interface> beans;

    public void getBeans(){
        for (Interface i: beans){
            System.out.println(i.getOrder());
        }
    }
}
