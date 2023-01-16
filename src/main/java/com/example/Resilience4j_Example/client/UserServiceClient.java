package com.example.Resilience4j_Example.client;

import com.example.Resilience4j_Example.response.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
@Component
public class UserServiceClient {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    public RestTemplate restTemplate;

    @Value("${domain.url}")
    String getOrder;

    public Orders[] getOrders(String category) {
        Orders[] response;
        UriComponents builder = UriComponentsBuilder.fromHttpUrl(getOrder+category)
                .build();
        response = restTemplate.getForObject(builder.toUriString(), Orders[].class);
        return response;
    }
}
