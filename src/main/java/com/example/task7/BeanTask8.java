package com.example.task7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BeanTask8 {

    @Autowired
    @Qualifier("beanB")
    private Interface anInterface;

    @Autowired
    private Interface primaryInterface;

    public void getBean(){
        System.out.println("Bean with @Qualifier: " + anInterface.getOrder());
    }

    public void getPrimary(){
        System.out.println("Bean with @Primary: " + primaryInterface.getOrder());
    }

}
