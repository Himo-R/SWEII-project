package com.SWIITest.himo;

import com.SWIITest.himo.model.user;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface todoRepository extends MongoRepository <user,String>{

}
