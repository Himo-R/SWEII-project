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
    public mainService todoService;
    @GetMapping
    public String greeting(){return  "<center><h1>wellcome API<h1> <br> <a href='/login'>Visit login!</a></center>";}

    @GetMapping("/listAllUsers")
    public List<user> listAllUsers() { return todoService.findAll(); }

/*
    @GetMapping("/{id}")
    public user getUserById(@PathVariable String id){
    return todoService.userById(id);
    }
*/


    @PostMapping(value = "/signUp")
    public boolean signUp(@RequestBody user obUser){
   return todoService.Registration(obUser);
    }

    @GetMapping("/UserPage")
    public String homeUser(){
        return "<h1>wellCome user</h1>";
    }

    /*
    @DeleteMapping( value = "/{id}")
    public void deleteUser(@PathVariable String id){
         todoService.remove(id);
    }
    */

}
