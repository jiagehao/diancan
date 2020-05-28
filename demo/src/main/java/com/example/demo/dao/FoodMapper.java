package com.example.demo.dao;

import com.example.domain.Food;
import com.example.domain.Order;

public interface FoodMapper {
    Food findById(Integer id);
}
