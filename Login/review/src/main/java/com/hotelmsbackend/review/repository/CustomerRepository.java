package com.hotelmsbackend.review.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.hotelmsbackend.review.model.Customer;
public interface CustomerRepository  extends JpaRepository<Customer,String> {

    
}