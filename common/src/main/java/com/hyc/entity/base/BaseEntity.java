package com.hyc.entity.base;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;


@MappedSuperclass
@Setter
@Getter
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "UUID" , nullable = false)
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    private String uuid ;

    @Column(name = "create_man" , nullable = false , length = 100 ,updatable = false , insertable = false)
    private String createMan ;

    @Column(name = "edit_man" , nullable = false ,length = 100 ,updatable = false , insertable = false)
    private String editMan ;

    @Column(name = "create_time" )
    private Timestamp createTime ;

    @Column(name = "edit_time")
    private Timestamp editTime ;

}
