package com.dompetqu.api.dompetquapi.service;

import java.util.List;
import java.util.Optional;

public interface GenericService<T, ID> {
    
    T save(T t);
    T update(T t);
    void remove(T t);
    Optional<T> getById(ID id);
    List<T> getAll();
}
