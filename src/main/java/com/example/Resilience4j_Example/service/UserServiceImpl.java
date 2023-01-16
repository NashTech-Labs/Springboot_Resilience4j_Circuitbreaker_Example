package com.example.Resilience4j_Example.service;

import com.example.Resilience4j_Example.client.UserServiceClient;
import com.example.Resilience4j_Example.response.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService{
    @Autowired
    UserServiceClient userServiceClient;
    @Override
    public Orders[] getOrdersByCategory(String category) {
        return userServiceClient.getOrders(category);
    }
}
