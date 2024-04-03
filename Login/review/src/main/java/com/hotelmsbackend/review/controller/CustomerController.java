package com.hotelmsbackend.review.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.hotelmsbackend.review.model.Customer;
import com.hotelmsbackend.review.service.CustomerService;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class CustomerController {
    @Autowired
    CustomerService cs;

    @PostMapping("/login/customerpostmapping")
    public ResponseEntity<Customer> add(@RequestBody Customer c) {
        Customer cus = cs.create(c);
        return new ResponseEntity<>(cus, HttpStatus.CREATED);
    }

    @GetMapping("/login/customergetmapping")
    public ResponseEntity<List<Customer>> showdetails() {
        return new ResponseEntity<>(cs.getalldetail(), HttpStatus.OK);
    }
    @PutMapping("/login/putmapping/{email}")
        public ResponseEntity<Customer>putMethodName(@PathVariable("email")String email,@RequestBody Customer c)
        {
            if(cs.updateDetails(email,c) == true)
            {
                return new ResponseEntity<>(c,HttpStatus.OK);
            }
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
        @DeleteMapping("/login/deletemapping/{email}")
        public ResponseEntity<Boolean>delete(@PathVariable("email")String email)
        {
            if(cs.delete(email) == true)
            {
                return new ResponseEntity<>(true,HttpStatus.OK);
            }
            return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
        }
    }