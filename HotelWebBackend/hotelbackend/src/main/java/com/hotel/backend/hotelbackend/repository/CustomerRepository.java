package com.hotel.backend.hotelbackend.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.hotel.backend.hotelbackend.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{
    @Query("SELECT f FROM Customer f WHERE f.lastName='abc'")
    List<Customer> findByStatus();

}