package com.demohot.blogs.dao.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demohot.blogs.dao.UserDao;
import com.demohot.blogs.po.User;

public class UserDaoImplTest {

	@Test
	public void testInsert() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao = context.getBean(UserDao.class, "userDaoImpl");
		User user = new User();
		user.setUsername("tom");
		user.setPassword("123");
		user.setEmail("tom@126.com");
		userDao.insert(user);
	}

	@Test
	public void testLogin() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserDao userDao = context.getBean(UserDao.class, "userDaoImpl");
		String username = "tom";
		String password = "123";
		userDao.login(username, password);
	}

}
