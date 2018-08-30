package com.example.order.orderservice.repository;

import com.example.order.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface OrderRepository extends JpaRepository<Order,String>, QuerydslPredicateExecutor<Order> {
}
