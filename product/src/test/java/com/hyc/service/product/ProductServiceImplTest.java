package com.hyc.service.product;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hyc.entity.product.Product;
import com.hyc.entity.provider.Provider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.security.jca.Providers;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductService productService;

    @Test
    public void findAll() throws Exception{
//       List<Product> products =  productService.findAll();
//        List<Provider> providers = products.get(0).getProviders();
//        for (Provider p:providers){
//            System.out.println(p);
//        }
    }

}