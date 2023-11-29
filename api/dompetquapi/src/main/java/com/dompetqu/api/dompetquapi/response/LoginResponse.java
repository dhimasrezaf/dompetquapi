package com.dompetqu.api.dompetquapi.response;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginResponse implements Serializable {
    
    private String username;
    private String password;
    
    public LoginResponse() {
    }

    public LoginResponse(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
