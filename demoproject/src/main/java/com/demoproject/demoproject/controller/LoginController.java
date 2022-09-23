package com.demoproject.demoproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.demoproject.Repository.LoginRepository;
import com.demoproject.demoproject.entity.Login;

@CrossOrigin
@RestController
public class LoginController {
	@Autowired
	LoginRepository loginrep;
    @RequestMapping("/login") // REST API End Point
    public String home() {
       return "<Marquee><H1>Welcome to login page!</H1></Marquee>";
    }
    @GetMapping("/getlogin")
    public List<Login> getlogin() {
       return loginrep.findAll();
    }
   // create POST
    // create employee rest API
    @PostMapping("/addlogin")
    public Login createlogin(@RequestBody Login login) {
        loginrep.save(login);
        return login;
    }
	

}
