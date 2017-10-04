package com.hyc.entity.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hyc.entity.base.BaseEntity;
import com.hyc.entity.provider.Provider;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "h_product")
@Getter
@Setter
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","providers"})
public class Product extends BaseEntity{

    @Column(name = "NAME" , nullable = false , length = 50)
    private String name ;

    @Column(name = "PRICE" ,nullable = false)
    private BigDecimal price ;


    @ManyToMany(mappedBy = "products",cascade=CascadeType.REFRESH,fetch = FetchType.EAGER)
    private List<Provider> providers ;
}
