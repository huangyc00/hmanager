package com.hyc.controller.product;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hyc.Response.Response;
import com.hyc.entity.product.Product;
import com.hyc.entity.provider.Provider;
import com.hyc.service.product.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/admin/product")
public class ProductController {

    @Reference
    private ProductService productService;

    @RequestMapping(value = "/findAll")
    public Response findAll() throws Exception{
        List<Product> products = productService.findAll();

        return Response.ok(products);
    }
}
