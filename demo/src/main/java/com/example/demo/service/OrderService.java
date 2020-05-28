package com.example.demo.service;

import com.example.domain.Order;

import java.util.List;
import java.util.Map;

public interface OrderService {
    void add(Integer id);
    List<Order> findbll();
    List<Order> findAll();
    void delete(Integer id);
}
