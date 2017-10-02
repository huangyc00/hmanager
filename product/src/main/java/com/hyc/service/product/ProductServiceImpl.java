package com.hyc.service.product;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class ProductServiceImpl implements ProductService {

    public String hello(String str){
        return str;
    }
}
