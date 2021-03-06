package com.example.hw1.task6;

import com.example.hw1.task5.OtherBeanA;
import com.example.hw1.task5.OtherBeanB;
import com.example.hw1.task5.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InjectField {

    @Autowired
    @Qualifier("otherBeanA")
    private OtherBeanA otherBeanA;

    @Autowired
    @Qualifier("otherBeanB")
    private OtherBeanB otherBeanB;

    @Autowired
    @Qualifier("otherBeanC")
    private OtherBeanC otherBeanC;

    public void getBeansNames() {
        otherBeanA.getName();
        otherBeanB.getName();
        otherBeanC.getName();
    }
}
