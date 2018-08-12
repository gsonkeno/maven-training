package com.gsonkeno.mvntraining;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private String userName;

    public UserService(String userName) {
        this.userName = userName;
    }

    public  void execute(){
        System.out.println(userName);
    }
}
