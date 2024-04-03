package com.hotel.backend.hotelbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.backend.hotelbackend.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{

}