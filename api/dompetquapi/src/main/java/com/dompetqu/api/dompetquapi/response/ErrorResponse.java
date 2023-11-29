package com.dompetqu.api.dompetquapi.response;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ErrorResponse implements Serializable {

    private HttpStatus httpStatus;
    private String message;
    
    public ErrorResponse() {
    }

    public ErrorResponse(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    
    
}
