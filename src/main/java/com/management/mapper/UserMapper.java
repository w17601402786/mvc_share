package com.management.mapper;

import com.management.pojo.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {


    @Select("SELECT * FROM user WHERE name = #{name} AND password = #{password}")
    User login(@Param("name") String name, @Param("password") String password);

    @Insert("INSERT INTO user (name, password) VALUES (#{name}, #{password})")
    int register(@Param("name") String username, @Param("password") String password);


    @Select("SELECT * FROM user WHERE name = #{username}")
    User getUserByUsername(@Param("username") String username);


}