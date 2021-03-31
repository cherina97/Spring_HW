package com.example.task6;

import com.example.task5.OtherBeanA;
import com.example.task5.OtherBeanB;
import com.example.task5.OtherBeanC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectConstr {

    private OtherBeanA otherBeanA;
    private OtherBeanB otherBeanB;
    private OtherBeanC otherBeanC;

    @Autowired
    public InjectConstr(OtherBeanA otherBeanA, OtherBeanB otherBeanB, OtherBeanC otherBeanC) {
        this.otherBeanA = otherBeanA;
        this.otherBeanB = otherBeanB;
        this.otherBeanC = otherBeanC;
    }

    public void getBeansNames() {
        otherBeanA.getName();
        otherBeanB.getName();
        otherBeanC.getName();
    }


}
