package com.demohot.blogs.mapper;

import org.apache.ibatis.annotations.Param;

import com.demohot.blogs.model.User;

public interface UserMapper {

	User get(int id);

	User getByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
