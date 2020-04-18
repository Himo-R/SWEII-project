package com.SWIITest.himo.service;

import com.SWIITest.himo.RepositoryDataAccess;
import com.SWIITest.himo.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class mainService {
    @Autowired
    private RepositoryDataAccess todoRepository;


    public List<user> findAll() { return todoRepository.findAll(); }


    public user userById(String id) {
       return todoRepository.findById(id).get();
    }


    public boolean Registration(user od) {
        return todoRepository.insert(od)==null?false:true;
    }

    /*
    public void remove(String idToRemove) { todoRepository.deleteById(idToRemove);
    }

     */
}




