package com.hotel.backend.hotelbackend.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.backend.hotelbackend.model.Customer;
import com.hotel.backend.hotelbackend.repository.CustomerRepository;
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
    public Customer getUserByName(String id)
    {
        return cr.findById(id).orElse(null);
    }

	public boolean getDetails(String id,Customer c)
    {
        if(this.getUserByName(id)==null)
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

    public boolean updateDetails(String id,Customer c)
    {
        if(this.getUserByName(id)==null)
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
    public boolean delete(String id)
    {
        if(this.getUserByName(id) == null)
        {
            return false;
        }
        cr.deleteById(id);
        return true;
    }
}