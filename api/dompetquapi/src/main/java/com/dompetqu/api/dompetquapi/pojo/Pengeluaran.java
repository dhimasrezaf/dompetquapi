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
@Table(name = "pengeluaran")
@Setter
@Getter
public class Pengeluaran implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @Column(name = "deskripsiPengeluaran", nullable = false)
    private String deskripsiPengeluaran;

    @Temporal(TemporalType.DATE)
    @Column(name = "tanggalPengeluaran", nullable = false)
    private Date tanggalPengeluaran;

    @Column(name = "jumlahPengeluaran", nullable = false)
    private int jumlahPengeluaran;

    public Pengeluaran() {
    }

    public Pengeluaran(String id, User user, String deskripsiPengeluaran, Date tanggalPengeluaran,
            int jumlahPengeluaran) {
        this.id = id;
        this.user = user;
        this.deskripsiPengeluaran = deskripsiPengeluaran;
        this.tanggalPengeluaran = tanggalPengeluaran;
        this.jumlahPengeluaran = jumlahPengeluaran;
    }

    
}
