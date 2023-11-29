package com.dompetqu.api.dompetquapi.request;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class LoginRequest implements Serializable {

    private String username;
    private String password;
    
    public LoginRequest() {
    }

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    
    
}
