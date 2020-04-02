package com.SWIITest.himo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class user {
    @Id
    private String id;
    private String type;
    private String firstName;
    private String lastName;
    private String userName;
    private String Email;
    private String PassWord;
    private long timestamp;
    public user (String id,String firstName,String lastName,String userName,String Email,String PassWord)
    {
        this.id=id;
        this.lastName=lastName;
        this.firstName=firstName;
        this.timestamp=System.currentTimeMillis();
        this.userName=userName;
        this.Email=Email;
        this.PassWord=PassWord;
    }
    public user(){
        this.timestamp= System.currentTimeMillis();
    }

    public String getId() {
        return id;
    }

    public String getLastName() { return lastName; }

    public String getPassWord() { return PassWord;}

    public String getUserName() { return userName; }

    public String getEmail() { return Email; }

    public String getFirstName() { return firstName;}
    public String getType() { return type; }

    public long getTimestamp() {
        return timestamp;
    }




    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setType(String type) {
        this.type = type;
    }
}
