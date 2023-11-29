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
@Table(name = "log_history")
@Getter
@Setter
public class LogHistory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", nullable = false)
    private User user;
    
    @Column(name = "deskripsi")
    private String deskripsi;

    @Column(name = "namaUser", length = 128)
    private String namaUser;

    @Temporal(TemporalType.DATE)
    @Column(name = "createdAt")
    private Date createdAt;

    public LogHistory() {
    }

    public LogHistory(int id, String deskripsi, String namaUser, Date createdAt) {
        this.id = id;
        this.deskripsi = deskripsi;
        this.namaUser = namaUser;
        this.createdAt = createdAt;
    }

    
}
