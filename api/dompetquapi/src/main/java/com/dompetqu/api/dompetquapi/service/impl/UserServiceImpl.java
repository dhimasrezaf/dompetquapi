package com.dompetqu.api.dompetquapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dompetqu.api.dompetquapi.pojo.User;
import com.dompetqu.api.dompetquapi.repository.UserRepository;
import com.dompetqu.api.dompetquapi.service.UserService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User getUserByUsername(String username) {
        // TODO Auto-generated method stub
       return repository.findByUsername(username);
    }
    
}
