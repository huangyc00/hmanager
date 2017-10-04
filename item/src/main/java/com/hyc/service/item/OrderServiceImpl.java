package com.hyc.service.item;

import com.alibaba.dubbo.config.annotation.Service;
import com.hyc.entity.item.Order;
import com.hyc.service.base.BaseService;
import com.hyc.service.base.impl.BaseServiceImpl;

@Service
public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService{

}
