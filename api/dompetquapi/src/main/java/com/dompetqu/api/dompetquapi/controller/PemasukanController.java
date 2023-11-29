package com.dompetqu.api.dompetquapi.controller;

import com.dompetqu.api.dompetquapi.service.PemasukanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dompetqu.api.dompetquapi.pojo.Pemasukan;
import com.dompetqu.api.dompetquapi.service.GenericService;

import java.util.List;

@RestController
@RequestMapping("/pemasukan")
public class PemasukanController extends GenericController<Pemasukan, String> {

    @Autowired
    private PemasukanService service;

    public PemasukanController(GenericService<Pemasukan, String> service) {
        super(service);
        //TODO Auto-generated constructor stub
    }

    @GetMapping("/byUser/{id}")
    public ResponseEntity<List<Pemasukan>> getAllPemasukanByIdUser(@PathVariable int id){
        return ResponseEntity.ok().body(service.getListPemasukanByuser(id));
    }
    
}
