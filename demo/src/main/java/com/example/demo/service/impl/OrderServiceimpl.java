package com.example.demo.service.impl;

import com.example.demo.dao.FoodMapper;
import com.example.demo.dao.OrderMapper;
import com.example.demo.service.OrderService;
import com.example.domain.Food;
import com.example.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceimpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private FoodMapper foodMapper;

    @Override
    public void add(Integer id) {
        Order order = new Order();
        Food food = foodMapper.findById(id);
        order.setName(food.getName());
        order.setStatus(0);
        order.setPrice(food.getPrice());

    }

    @Override
    public List<Order> findbll() {
        List<Order> list = orderMapper.findAll();
        return list;
    }

    @Override
    public List<Order> findAll() {
        List<Order> list = orderMapper.findAll();
        //将订单状态修改为已上架
        for (Order order : list) {
            order.setStatus(1);
        }
        return list;
    }

    @Override
    public void delete(Integer id) {
        Order order = orderMapper.findById(id);
        if (order.getStatus().equals(1)){
            new RuntimeException();
        }
        orderMapper.deleteByid(id);

    }

}
