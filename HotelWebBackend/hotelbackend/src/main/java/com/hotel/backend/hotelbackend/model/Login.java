package com.hotel.backend.hotelbackend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Login {
    @Id
    private String email;
    private String password;
    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public Login() {

    }
}