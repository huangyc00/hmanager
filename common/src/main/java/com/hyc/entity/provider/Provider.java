package com.hyc.entity.provider;

import com.hyc.entity.base.BaseEntity;
import com.hyc.entity.product.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * 供货商
 */
@Entity
@Table(name = "h_provider")
@Getter
@Setter
public class Provider extends BaseEntity{

    /**
     * 供应商的姓名
     */
    private String name ;

    /**
     * 供应商的年龄
     */
    private Integer age ;

    /**
     * 供应商所提供商品
     */

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(name="h_provider_product",inverseJoinColumns=@JoinColumn(name="PRODUCT_ID"),joinColumns=@JoinColumn(name="PROVIDER_ID"))
    private List<Product> products ;
}
