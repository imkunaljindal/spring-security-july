package com.example.springsecurityjuly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {





    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to STUDENT area";
    }
}
