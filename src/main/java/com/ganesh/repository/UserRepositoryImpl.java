package com.ganesh.repository;

import org.springframework.stereotype.Component;

@Component
public class  UserRepositoryImpl  implements  UserRepository{

     @Override
     public Boolean authenticate(String userName, String password){
          System.out.println("User Repository Implementation : Authenticate");
          return true;
     }
}
