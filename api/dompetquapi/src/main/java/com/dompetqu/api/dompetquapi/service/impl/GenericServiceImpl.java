package com.dompetqu.api.dompetquapi.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.dompetqu.api.dompetquapi.service.GenericService;

import jakarta.transaction.Transactional;


public abstract class GenericServiceImpl<T, ID> implements GenericService<T, ID> {


    @Autowired
    public JpaRepository<T, ID> jpaRepository;

    @Override
    public T save(T t) {
        // TODO Auto-generated method stub
        return jpaRepository.save(t);
    }

    @Override
    public T update(T t) {
        // TODO Auto-generated method stub
        return jpaRepository.save(t);
    }

    @Override
    public void remove(T t) {
        // TODO Auto-generated method stub
        jpaRepository.delete(t);
    }

    @Override
    public Optional<T> getById(ID id) {
        // TODO Auto-generated method stub
        return jpaRepository.findById(id);
    }

    @Override
    public List<T> getAll() {
        // TODO Auto-generated method stub
        return jpaRepository.findAll();
    }
    
}
