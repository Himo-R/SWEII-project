package com.SWIITest.himo.controller;

import com.SWIITest.himo.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class userController {
    @Autowired
    public com.SWIITest.himo.service.todoService todoService;
    @GetMapping
    public String greeting(){return  "wellcome API";}
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

    /*
    @DeleteMapping( value = "/{id}")
    public void deleteUser(@PathVariable String id){
         todoService.remove(id);
    }
    */

}
