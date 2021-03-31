package com.example.task6;

import com.example.task5.OtherBeanA;
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
