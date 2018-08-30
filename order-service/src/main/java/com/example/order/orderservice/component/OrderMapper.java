package com.example.order.orderservice.component;

import com.example.order.orderservice.model.Order;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {
    private final DefaultMapperFactory factory;
    public OrderMapper(){
        this.factory = new DefaultMapperFactory.Builder().build();
        initRegister();
    }

    private void initRegister(){

    }

    public <F,T> T map(final F from, final Class<T> toClass){
        return this.factory.getMapperFacade().map(from,toClass);
    }

    public <F,T> void map(final F from, final T to){
        this.factory.getMapperFacade().map(from,to);
    }
}
