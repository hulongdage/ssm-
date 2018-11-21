package com.example.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.ssm.pojo.entity.User;
import com.example.ssm.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("/listAllUser")
	public ModelAndView listAllUser(User user) {
		System.out.println(user.getUserId()+user.getUserName()+user.getUserPassword());
		ModelAndView modelAndView=new ModelAndView();
		List<User> list=userService.getAllUser();
		System.out.println("==================="+list.size());
		modelAndView.addObject("userList", list);
		modelAndView.setViewName("/list.jsp");
		return modelAndView;
	}
}
