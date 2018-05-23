package com.demohot.blogs.dao;

import com.demohot.blogs.model.User;

public interface UserDao {

	void insert(User user);

	void select();

	void login(String username, String password);

}
