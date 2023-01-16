package com.example.Resilience4j_Example.controller;

import com.example.Resilience4j_Example.response.Orders;
import com.example.Resilience4j_Example.service.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class UserServiceController {
    @Autowired
    private UserService userService;
    public static final String USER_SERVICE="userService";

    @GetMapping("/displayOrders")
    @CircuitBreaker(name =USER_SERVICE,fallbackMethod = "fallback")
    public List<Orders> displayOrders(@RequestParam("category") String category) {
        return Arrays.asList(userService.getOrdersByCategory(category));
    }
    public List<String> fallback(Exception ex) {
        return Arrays.asList("service not available");
    }

}
