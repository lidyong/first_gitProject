package com.join.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.join.entity.User;
@Repository
public interface UserDao extends CrudRepository<User, String> {
 //gg  
}
