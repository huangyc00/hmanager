package com.hyc.entity.item;

import com.hyc.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "h_order")
@Setter
@Getter
public class Order extends BaseEntity{

    @Column(name = "NAME" , nullable = false , length = 100)
    private String name ;

}
