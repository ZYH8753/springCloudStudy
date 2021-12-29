package com.zyh.consumer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyh.consumer.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
