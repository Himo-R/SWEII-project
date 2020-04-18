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

    @GetMapping("/test1")
    public String t1(){
        return "test11";
    }
    @GetMapping("/test2")
    public String t29() {
        return "test22";
    }

    /*
    @DeleteMapping( value = "/{id}")
    public void deleteUser(@PathVariable String id){
         todoService.remove(id);
    }
    */

}
