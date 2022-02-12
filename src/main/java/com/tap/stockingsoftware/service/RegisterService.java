package com.tap.stockingsoftware.service;
import com.tap.stockingsoftware.model.Users;
import com.tap.stockingsoftware.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    @Autowired
    UserRepository userRepository;
    public String register(Users userRegister)
    {
        //userRepository.save(userRegister);

        Users found = userRepository.findByFirstName("Jack");
        System.out.println(found.getFirstName());




        return "Added";
    }
}
