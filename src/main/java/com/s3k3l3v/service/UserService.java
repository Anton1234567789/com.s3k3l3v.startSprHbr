package com.s3k3l3v.service;

import com.s3k3l3v.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Антон on 17.08.2017.
 */

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List getAllUsers(){
        return userDao.getAllUser();
    }
}
