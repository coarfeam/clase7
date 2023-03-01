package com.formulario.formulario.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Usuario {
    @NotEmpty
    private String id;
    @NotEmpty(message ="El usuario no puede estar vacio")
    private String username;
    @NotEmpty
    @Size(min = 3, max = 8)    
    private String password;
    @NotEmpty
    private String email;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
