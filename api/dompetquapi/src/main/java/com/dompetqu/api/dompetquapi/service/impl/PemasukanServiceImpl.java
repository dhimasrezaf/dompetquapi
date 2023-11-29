package com.dompetqu.api.dompetquapi.service.impl;

import com.dompetqu.api.dompetquapi.pojo.User;
import com.dompetqu.api.dompetquapi.repository.PemasukanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dompetqu.api.dompetquapi.pojo.Pemasukan;
import com.dompetqu.api.dompetquapi.service.PemasukanService;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
@Transactional
public class PemasukanServiceImpl extends GenericServiceImpl<Pemasukan, String> implements PemasukanService {

    @Autowired
    private PemasukanRepository repository;

    @Override
    public List<Pemasukan> getListPemasukanByuser(Integer id) {
        return repository.findAllByUserId(id);
    }
}
