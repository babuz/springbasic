package com.ganesh.repository;

public interface UserRepository {

     Boolean authenticate(String userName, String password);
}
