package com;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    public User findUser(@Param("age") int age);

    public List<User> findAll();


}
