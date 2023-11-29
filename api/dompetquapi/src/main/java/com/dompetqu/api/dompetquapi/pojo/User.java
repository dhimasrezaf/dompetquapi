package com.dompetqu.api.dompetquapi.pojo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Setter
@Getter
public class User implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "namaUser", length = 128)
    private String namaUser;

    @Column(name = "email", length = 128)
    private String email;

    @Column(name = "jenisKelamin", length = 2)
    private String jenisKemalin;

    @Column(name = "username", nullable = false, length = 128)
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "aktif")
    private boolean aktif;

    public User(int id, String namaUser, String email, String jenisKemalin, String username, String password,
            boolean aktif) {
        this.id = id;
        this.namaUser = namaUser;
        this.email = email;
        this.jenisKemalin = jenisKemalin;
        this.username = username;
        this.password = password;
        this.aktif = aktif;
    }



    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }



    public User() {
    }
    
}
