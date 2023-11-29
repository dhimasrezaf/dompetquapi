package com.dompetqu.api.dompetquapi.pojo;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pemasukan")
@Getter
@Setter
public class Pemasukan implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", nullable = false)
    private User user; 

    @Column(name = "deskripsiPemasukan", nullable = false)
    private String deskripsi;

    @Temporal(TemporalType.DATE)
    @Column(name = "tanggalPemasukan", nullable = false)
    private Date tanggalPemasukan;

    @Column(name = "jumlahPemasukan", nullable = false)
    private int jumlahPemasukan;

    public Pemasukan() {
    }

    public Pemasukan(String id, User user, String deskripsi, Date tanggalPemasukan, int jumlahPemasukan) {
        this.id = id;
        this.user = user;
        this.deskripsi = deskripsi;
        this.tanggalPemasukan = tanggalPemasukan;
        this.jumlahPemasukan = jumlahPemasukan;
    }

    

}
