# Springboot_Resilience4j_Circuitbreaker_Example
Resilience4j is a lightweight fault tolerance library that provides a variety of fault tolerance and stability patterns to a web application.
 this template will help you to understand the working of circuit breaker.
 this template run on port : 8080
please download the client(service b) from this link:- https://github.com/knoldus/Springboot_Resilence4j_ClientApplication
service b is running on port :8081
 step 1: download Springboot_Resilience4j_Circuitbreaker_Example and run this project
 step 2: download client application that running on port 8081 .(orderservice: it will return the orders(service b))
 step 3: run both the applications if service b is doen then you will get response from circuitbreaker fallback method.
