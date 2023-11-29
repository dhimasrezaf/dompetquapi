package com.dompetqu.api.dompetquapi.service;

import com.dompetqu.api.dompetquapi.pojo.Pemasukan;
import com.dompetqu.api.dompetquapi.pojo.User;

import java.util.List;

public interface PemasukanService extends GenericService<Pemasukan, String> {

    public List<Pemasukan> getListPemasukanByuser(Integer id);
}
