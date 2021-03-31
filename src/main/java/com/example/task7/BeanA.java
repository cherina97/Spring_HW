package com.example.task7;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
@Primary
public class BeanA implements Interface{

    @Override
    public String getOrder() {
        return "BeanA - order 2";
    }
}
