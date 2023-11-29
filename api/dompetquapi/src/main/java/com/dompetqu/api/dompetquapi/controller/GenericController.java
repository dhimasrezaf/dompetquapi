package com.dompetqu.api.dompetquapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dompetqu.api.dompetquapi.service.GenericService;

public abstract class GenericController<T, ID> {
    
    private final GenericService<T, ID> service;

    public GenericController(GenericService<T, ID> service) {
        this.service = service;
    }

    @PostMapping("")
    public ResponseEntity<T> savEntity(@RequestBody T t){
        return ResponseEntity.ok().body(service.save(t));
    }

    @PutMapping("")
    public ResponseEntity<T> updaEntity(@RequestBody T t){
        return ResponseEntity.ok().body(service.save(t));
    }

    @GetMapping("")
    public ResponseEntity<List<T>> getAll(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<T>> getById(@PathVariable ID id){
        return ResponseEntity.ok().body(service.getById(id));
    }
}
