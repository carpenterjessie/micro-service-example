package com.example.order.orderservice.service;

import com.example.order.orderservice.model.Order;
import com.example.order.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public Order save(Order order){
        return this.orderRepository.save(order);
    }

}
