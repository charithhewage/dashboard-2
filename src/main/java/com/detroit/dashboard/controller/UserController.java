package com.detroit.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.detroit.dashboard.bean.UserBean;
import com.detroit.dashboard.model.User;
import com.detroit.dashboard.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("users/index");
	}
	
	
	//Testing purposes..
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView Test() {
		return new ModelAndView("test/index");
	}
	
	@RequestMapping(value = "/testsave", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute("user") UserBean userBean, 
			BindingResult result) {
		User user = prepareModel(userBean);
		userService.addUser(user);
		
		return new ModelAndView("test/show");
	}

	private User prepareModel(UserBean userBean){
		User user = new User();
		user.setFirstName(userBean.getFirstName());
		user.setLastName(userBean.getLastName());
		user.setEmail(userBean.getEmail());
		user.setPassword(userBean.getPassword());
		return user;
	}


}
