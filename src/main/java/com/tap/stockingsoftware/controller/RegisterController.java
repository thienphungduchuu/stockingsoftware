package com.tap.stockingsoftware.controller;
import com.tap.stockingsoftware.model.Users;
import com.tap.stockingsoftware.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @PostMapping("/user_registration")
    public ResponseEntity<?> userInfo (@RequestBody Users registerRequest)
    {
        // include checking for null
        if (registerRequest.getFirstName().trim().isEmpty())
            return new ResponseEntity<>("Can't input empty stuff man.....", HttpStatus.BAD_REQUEST);

        // register new user
        String respond = registerService.register(registerRequest);

        return new ResponseEntity<>(respond, HttpStatus.OK);
    }
}
