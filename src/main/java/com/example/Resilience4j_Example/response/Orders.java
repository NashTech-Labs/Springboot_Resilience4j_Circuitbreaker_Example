package com.example.Resilience4j_Example.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private int id;
    private String name;
    private String category;
    private String color;
    private double price;
}
