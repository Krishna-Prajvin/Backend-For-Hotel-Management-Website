package com.hotel.backend.hotelbackend.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hotel.backend.hotelbackend.model.Customer;
import com.hotel.backend.hotelbackend.service.CustomerService.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService cs;

	// to create a hotel customer
	@PostMapping("/addcustomer")
    public ResponseEntity<Customer> add(@RequestBody Customer c) {
        Customer cus = cs.create(c);
        return new ResponseEntity<>(cus, HttpStatus.CREATED);
    }
	
@GetMapping("/showcustomer")
public ResponseEntity<List<Customer>> getAll()
{
	List<Customer> obj = cs.getalldetail();
	return new ResponseEntity<>(obj,HttpStatus.OK);
}


	// to get a hotel customer by id
	@GetMapping("/showcustomer/{id}")
	public ResponseEntity<Customer>getCustomerById(@PathVariable String id,@RequestBody Customer c) {
		if(cs.getDetails(id,c) == true)
            {
                return new ResponseEntity<>(c,HttpStatus.OK);
            }
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
	}

	// to update a hotel customer
	
	@PutMapping("/updatecustomer/{id}")
	
        public ResponseEntity<Customer>putMethodName(@PathVariable String id,@RequestBody Customer c)
        {
            if(cs.updateDetails(id,c) == true)
            {
                return new ResponseEntity<>(c,HttpStatus.OK);
            }
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
	
	
	// delete customer rest api
	@DeleteMapping("/deletecustomer/{id}")
	public ResponseEntity<Boolean>delete(@PathVariable String id)
        {
            if(cs.delete(id) == true)
            {
                return new ResponseEntity<>(true,HttpStatus.OK);
            }
            return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
        }
	
	
}
        