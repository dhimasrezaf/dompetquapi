package com.dompetqu.api.dompetquapi.repository;

import com.dompetqu.api.dompetquapi.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dompetqu.api.dompetquapi.pojo.Pemasukan;

import java.util.List;

@Repository
public interface PemasukanRepository extends JpaRepository<Pemasukan, String> {
    public List<Pemasukan> findAllByUserId(Integer id);
}
