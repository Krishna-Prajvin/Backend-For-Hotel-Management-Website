package com.hotel.backend.hotelbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.backend.hotelbackend.model.Login;
public interface LoginRepository  extends JpaRepository<Login,String> {
    
    
}