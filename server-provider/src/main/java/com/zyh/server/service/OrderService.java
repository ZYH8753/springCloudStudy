package com.zyh.server.service;

import com.zyh.server.entity.Order;
import com.zyh.server.mapper.OrderMapper;
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
