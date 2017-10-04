package com.hyc.entity.product;

import com.hyc.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "h_category")
@Setter
@Getter
public class Category extends BaseEntity{
}
