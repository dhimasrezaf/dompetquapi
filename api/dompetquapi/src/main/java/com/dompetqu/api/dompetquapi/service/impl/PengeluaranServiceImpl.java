package com.dompetqu.api.dompetquapi.service.impl;

import com.dompetqu.api.dompetquapi.pojo.User;
import com.dompetqu.api.dompetquapi.repository.PengeluaranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dompetqu.api.dompetquapi.pojo.Pengeluaran;
import com.dompetqu.api.dompetquapi.service.PengeluaranService;

import jakarta.transaction.Transactional;

import java.util.List;

@Service
@Transactional
public class PengeluaranServiceImpl extends GenericServiceImpl<Pengeluaran, String> implements PengeluaranService {

    @Autowired
    private PengeluaranRepository repository;

    @Override
    public List<Pengeluaran> getAllByUser(Integer id) {
        return repository.findAllByUserId(id);
    }
}
