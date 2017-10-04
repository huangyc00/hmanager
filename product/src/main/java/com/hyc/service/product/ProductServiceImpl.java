package com.hyc.service.product;

import com.hyc.entity.product.Product;
import com.hyc.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.persistence.Cacheable;
import java.util.List;


@Service
@com.alibaba.dubbo.config.annotation.Service
@Cacheable
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService{

}
