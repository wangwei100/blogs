package com.demohot.blogs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDaoImpl implements UserDao {

	public void insert() {
	}

	public void select() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/homework", "root", null);
			Statement stmt = conn.createStatement();
			String sql = "select * from user;";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("username = " + rs.getString("username") + " password = " + rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		userDao.select();
	}
}
