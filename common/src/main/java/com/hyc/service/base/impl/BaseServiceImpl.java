package com.hyc.service.base.impl;

import com.hyc.dao.base.BaseDao;
import com.hyc.entity.base.BaseEntity;
import com.hyc.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * 具体实现
 * @param <T>
 */
public class BaseServiceImpl<T extends BaseEntity> implements BaseService<T>{

    @Autowired
    private JpaRepository<T,Serializable> jpaRepository;

    @Override
    public List<T> findAll() throws Exception{
        return jpaRepository.findAll();
    }

    @Override
    public T findOne(String uuid) throws Exception{
        return jpaRepository.findOne(uuid);
    }

    @Override
    public T save(T t) throws Exception{
        if(null == t.getUuid()|| t.getUuid().isEmpty()){
            t.setCreateMan("hyc");
            t.setCreateTime(new Timestamp(System.currentTimeMillis()));
        }else{
            t.setEditMan("hyc");
            t.setEditTime(new Timestamp(System.currentTimeMillis()));
        };
        return jpaRepository.save(t);
    }

    @Override
    public void delete(String uuid) throws Exception{
        jpaRepository.delete(uuid);
    }
}
