package com.hyc.dao.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseDao<T> extends JpaRepository<T,Serializable>{
}
