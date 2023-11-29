package com.dompetqu.api.dompetquapi.controller;

import com.dompetqu.api.dompetquapi.service.PengeluaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dompetqu.api.dompetquapi.pojo.Pengeluaran;
import com.dompetqu.api.dompetquapi.service.GenericService;

import java.util.List;

@RestController
@RequestMapping("/pengeluaran")
public class PengeluaranController extends GenericController<Pengeluaran, String> {

    @Autowired
    private PengeluaranService service;

    public PengeluaranController(GenericService<Pengeluaran, String> service) {
        super(service);
        //TODO Auto-generated constructor stub
    }

    @GetMapping("/byUser/{id}")
    public ResponseEntity<List<Pengeluaran>> getAllPengeluaranByUserId(@PathVariable int id){
        return ResponseEntity.ok().body(service.getAllByUser(id));
    }
    
}
