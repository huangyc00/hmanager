package com.hyc.controller.product;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hyc.service.product.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin/product")
public class ProductController {

    @Reference
    private ProductService productService;

    @RequestMapping(value = "/hello")
    public String hello(){
        return productService.hello("hello world");
    }
}
