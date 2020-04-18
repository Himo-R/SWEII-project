package com.SWIITest.himo.service;

import com.SWIITest.himo.RepositoryDataAccess;
import com.SWIITest.himo.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class mainService {
    @Autowired
    private RepositoryDataAccess RepositoryDataAccess;


    public List<user> findAll() { return RepositoryDataAccess.findAll(); }


    public user userById(String id) {
       return RepositoryDataAccess.findById(id).get();
    }


    public boolean Registration(user od) {
        return RepositoryDataAccess.insert(od)==null?false:true;
    }


    public String homeUser(){ return "<center><h1>Wellcome user </h1> <br> <a href='/logout'>logout!</a></center>"; }

    public String homeAdmin(){ return "<center><h1>wellcome Admin <h1> <br> <a href='/listAllUsers'>list all user!</a> <br> <a href='/logout'>logout!</a> </center>"; }

    public String HomePage(){   return
            "<center><h1>wellcome API<h1> " +
            "<br> <a href='/UserPage'>USER LOGIN!</a>" +
            "<br> <a href='/AdminPage'>ADMIN LOGIN!</a></center>"
            ;}



    /*
    public void remove(String idToRemove) { todoRepository.deleteById(idToRemove);
    }

     */
}




