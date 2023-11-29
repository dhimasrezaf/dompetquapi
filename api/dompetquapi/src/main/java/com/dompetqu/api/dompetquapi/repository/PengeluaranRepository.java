package com.dompetqu.api.dompetquapi.repository;

import com.dompetqu.api.dompetquapi.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dompetqu.api.dompetquapi.pojo.Pengeluaran;

import java.util.List;

@Repository
public interface PengeluaranRepository extends JpaRepository<Pengeluaran, String> {

    public List<Pengeluaran> findAllByUserId(Integer id);
}
