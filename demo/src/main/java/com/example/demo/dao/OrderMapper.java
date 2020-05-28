package com.example.demo.dao;

import com.example.domain.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> findAll();
    Order findById(Integer id);
    void deleteByid(Integer id);
}
