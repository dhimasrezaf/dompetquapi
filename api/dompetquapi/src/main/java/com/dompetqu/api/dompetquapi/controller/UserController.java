package com.dompetqu.api.dompetquapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dompetqu.api.dompetquapi.pojo.User;
import com.dompetqu.api.dompetquapi.service.GenericService;
import com.dompetqu.api.dompetquapi.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController extends GenericController<User, Integer> {

    @Autowired
    private UserService service;

    public UserController(GenericService<User, Integer> service) {
        super(service);
        //TODO Auto-generated constructor stub
    }
    
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user){
        if (service.getUserByUsername(user.getUsername()) == null) {
            
            return ResponseEntity.ok().body(service.save(user));
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("username sudah digunakan");
    }

    @GetMapping("/byusername/{username}")
    public ResponseEntity<User> getByUsername(@PathVariable String username){
        return ResponseEntity.ok().body(service.getUserByUsername(username));
    }

}
