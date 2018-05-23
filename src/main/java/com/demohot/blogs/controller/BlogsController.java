package com.demohot.blogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demohot.blogs.mapper.UserMapper;
import com.demohot.blogs.model.User;

@Controller
public class BlogsController {
	@Autowired
	private UserMapper userMapper;
	//
	// @GetMapping("/hello")
	// @ResponseBody
	// public String hello(String username, String password) {
	// // model.addAttribute("message", "Hello World!");
	// System.out.println(username);
	// System.out.println(password);
	// return "success";
	// }

	@RequestMapping("/user/detail")
	public ModelAndView userDetail(int id) {
		User user = userMapper.get(id);
		ModelAndView result = new ModelAndView("userDetail.jsp");
		result.addObject("user", user);
		return result;
	}
}
