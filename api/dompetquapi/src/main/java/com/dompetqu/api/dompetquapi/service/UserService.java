package com.dompetqu.api.dompetquapi.service;

import com.dompetqu.api.dompetquapi.pojo.User;

public interface UserService extends GenericService<User, Integer> {
    public User getUserByUsername(String username);
}
