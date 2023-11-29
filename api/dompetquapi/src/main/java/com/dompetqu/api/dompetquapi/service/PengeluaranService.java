package com.dompetqu.api.dompetquapi.service;

import com.dompetqu.api.dompetquapi.pojo.Pengeluaran;
import com.dompetqu.api.dompetquapi.pojo.User;

import java.util.List;

public interface PengeluaranService extends GenericService<Pengeluaran, String> {

    public List<Pengeluaran> getAllByUser(Integer id);
}
