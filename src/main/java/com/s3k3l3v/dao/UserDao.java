package com.s3k3l3v.dao;

import com.s3k3l3v.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;


@Repository
public class UserDao {

    private List<User> users = Arrays.asList(new User("admin", "admin"),
            new User("admin", "admin"));

    public List<User> getAllUser(){
        return users;
    }

}
