package com.hotelmsbackend.review.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotelmsbackend.review.model.Customer;
import com.hotelmsbackend.review.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository cr;

    public Customer create(Customer c) {
        return cr.save(c);
    }

    public List<Customer> getalldetail() {
        return cr.findAll();
    }
    public Customer getUserByName(String email)
    {
        return cr.findById(email).orElse(null);
    }
    public boolean updateDetails(String email,Customer c)
    {
        if(this.getUserByName(email)==null)
        {
            return false;
        }
        try{
            cr.save(c);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean delete(String email)
    {
        if(this.getUserByName(email) == null)
        {
            return false;
        }
        cr.deleteById(email);
        return true;
    }
}