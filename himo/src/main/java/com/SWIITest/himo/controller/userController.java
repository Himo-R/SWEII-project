package com.SWIITest.himo.controller;

import com.SWIITest.himo.model.user;
import com.SWIITest.himo.service.mainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class userController {
    @Autowired
    public mainService ObService;

    @GetMapping
    public String HomePage(){return  ObService.HomePage();}

    @GetMapping("/listAllUsers")
    public List<user> listAllUsers() { return ObService.findAll(); }

/*
    @GetMapping("/{id}")
    public user getUserById(@PathVariable String id){
    return todoService.userById(id);
    }
*/


    @PostMapping(value = "/signUp")
    public boolean signUp(@RequestBody user obUser){
    return ObService.Registration(obUser);
    }

    @GetMapping("/UserPage")
    public String homeUser(){ return ObService.homeUser(); }

    @GetMapping("/AdminPage")
    public String homeAdmin(){ return ObService.homeAdmin(); }

    /*
    @DeleteMapping( value = "/{id}")
    public void deleteUser(@PathVariable String id){
         todoService.remove(id);
    }
    */

}
