package com.demoproject.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.demoproject.demoproject.Repository.LoginRepository;
import com.demoproject.demoproject.Repository.RegisterRepository;
import com.demoproject.demoproject.entity.Register;
//import com.demoproject.demoproject.entity.Login;
import com.demoproject.demoproject.service.RegisterService;


@CrossOrigin("http://localhost:4200")
@RestController
public class RegisterController {
	@Autowired
    RegisterRepository rep;
	@Autowired
	RegisterService service;
//	LoginRepository loginrep;
    @RequestMapping("/hamee") // REST API End Point
    public String home() {
       return "<Marquee><H1>Welcome to my page!</H1></Marquee>";
    }
    @GetMapping("/getreg")
    public List<Register> getallreg() {
       return rep.findAll();
    }
//    @PostMapping("/addreg")    
//    public Register createuser(@RequestBody Register regis) {
//        return rep.save(regis);
//    }
    @PostMapping("/addreg")
    public Register getallreg(@RequestBody Register register) throws Exception {
    	String tempemail=register.getEmail();
    	if(tempemail != null && !"".equals(tempemail)){
    		Register regobj=service.fetchRegisterByEmail(tempemail);
    		if(regobj !=null) {
    			throw new Exception ("User with "+tempemail+"is already exist");
    		}
    	}
    	Register regObj=null;
    	regObj=service.saveReg(register);
    	return regObj;
    }
    @GetMapping("/findID/{id}")
    public Register findById( @PathVariable int id){
        return rep.findById(id);
    };
    
    @PostMapping("/login")
    public Register loginReg(@RequestBody Register register) throws Exception {
    	String tempemail=register.getEmail();
    	String tempPass=register.getPassword();
    	
    	Register regObj=null;
    	if(tempemail != null && tempPass != null) {
    		regObj=service.fetchRegisterByEmailAndPassword(tempemail, tempPass);
    	}
    	if (regObj == null)
    	{
    		throw new Exception("Wrong credentials");
    	}
    	
    	return regObj;
        
    }
//    @PostMapping("/adminlog")
//    public Register adminlog(@RequestBody Register register) throws Exception {
////    	String tempemail=register.getEmail();
////    	String tempPass=register.getPassword();
//    	String tempemail="admin@voizfonica.com";
//    	String tempPass="password";
//    	if(tempemail=="admin@voizfonica.com"  && tempPass =="password") {
//    		return service.adminreg(tempemail, tempPass); 
//    	}
//    	else
//    	{
//    		throw new Exception("Wrong credentials");
//    	}
//  }

   // create POST
    // create employee rest API
//    @PostMapping("/addreg")    
//    public Register createuser(@RequestBody Register regis) {
//        return rep.save(regis);
//        
//    }
    @DeleteMapping("/deletereg/{id}")
    public String  deletereg(@PathVariable int id)
    {
       
        rep.deleteById(id);
        return  "Is deleted";
    }
    
//    @GetMapping("/getlogin")
//    public List<Login> getlogin() {
//       return loginrep.findAll();
//    }
    
//
//
//
//   // create POST
//    // create employee rest API
//    @PostMapping("/addlogin")
//    public Login createreg(@RequestBody Login login) {
//        loginrep.save(login);
//        return login;
//    }

}
