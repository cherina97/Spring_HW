package com.example.hw1.task6;

import com.example.hw1.task5.OtherBeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectSetter {

    private OtherBeanA otherBeanA;

    @Autowired
    public void setOtherBeanA(OtherBeanA otherBeanA) {
        this.otherBeanA = otherBeanA;
    }

    public void getBeansNames() {
        otherBeanA.getName();
    }
}
