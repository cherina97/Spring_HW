package com.example.task7;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
@Qualifier("beanC")
public class BeanC implements Interface{

    @Override
    public String getOrder() {
        return "BeanC - order 1";
    }
}
