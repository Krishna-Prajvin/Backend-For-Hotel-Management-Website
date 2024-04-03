package com.hotel.backend.hotelbackend.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.backend.hotelbackend.model.Login;
import com.hotel.backend.hotelbackend.repository.LoginRepository;


@Service
public class LoginService {
    @Autowired
    LoginRepository cr;

    public Login create(Login c) {
        return cr.save(c);
    }

    public List<Login> getalldetail() {
        return cr.findAll();
    }
    public Login getUserByName(String email)
    {
        return cr.findById(email).orElse(null);
    }
    public boolean updateDetails(String email,Login c)
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