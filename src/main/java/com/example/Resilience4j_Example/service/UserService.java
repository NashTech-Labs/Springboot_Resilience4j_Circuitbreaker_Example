package com.example.Resilience4j_Example.service;

import com.example.Resilience4j_Example.response.Orders;

public interface UserService {
    Orders[] getOrdersByCategory(String category);
}
