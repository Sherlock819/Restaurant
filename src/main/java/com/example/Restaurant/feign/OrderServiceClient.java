package com.example.Restaurant.feign;

import org.example.dto.OrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "order-service")
public interface OrderServiceClient {
    @GetMapping("/api/orders/user/{userId}")
    List<OrderDto> getOrdersByUserId(@PathVariable("userId") Long userId);
}
