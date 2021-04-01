package com.example.hw1.task7;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
@Qualifier("beanB")
public class BeanB implements Interface{

    @Override
    public String getOrder() {
        return "BeanB - order 3";
    }
}
