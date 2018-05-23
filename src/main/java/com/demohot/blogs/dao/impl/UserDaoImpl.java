package com.demohot.blogs.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.demohot.blogs.dao.UserDao;
import com.demohot.blogs.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	public void insert() {
	}

	public Statement getStmt() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/homework", "root", null);
		Statement stmt = conn.createStatement();
		return stmt;
	}

	public void select() {
		try {
			Statement stmt = getStmt();
			String sql = "select * from user;";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out
						.println("username = " + rs.getString("username") + " password = " + rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insert(User user) {
		try {
			Statement stmt = getStmt();
			String sql = "insert into user (username, password, email) values ('" + user.getUsername() + "','"
					+ user.getPassword() + "','" + user.getEmail() + "')";
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void login(String username, String password) {
		try {
			Statement stmt = getStmt();
			String sql = "select * from user where username='" + username + "' and password = '" + password + "';";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println("login success");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
