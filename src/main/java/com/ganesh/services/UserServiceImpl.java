package com.ganesh.services;

import com.ganesh.repository.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService {

    private static final Logger logger =  Logger.getLogger(UserServiceImpl.class);
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean authenticate(String userName, String password) {
        logger .info("User Service Implementation : authenticate" + userName);
        return userRepository.authenticate(userName,password);
    }
}
