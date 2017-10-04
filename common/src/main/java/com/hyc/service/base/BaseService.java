package com.hyc.service.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 此接口封装一些基本用的方法
 * 如crud
 * @param <T>
 */
public interface BaseService<T>{

    List<T> findAll() throws Exception;

    T findOne(String uuid) throws Exception;

    T save(T t) throws Exception;

    void delete(String uuid) throws Exception;


}
