package com.zyh.consumer.service;

import com.zyh.consumer.entity.Order;
import com.zyh.consumer.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    public void insert(Order order) {
        orderMapper.insert(order);
    }

}
