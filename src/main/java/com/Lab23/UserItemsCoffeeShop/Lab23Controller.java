package com.Lab23.UserItemsCoffeeShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Lab23Controller {

	@Autowired
	CoffeeUserItemDAO dao;

	@RequestMapping("/")
	public ModelAndView landing() {
		return new ModelAndView("index", "firstPage", "Your Source for Coffee Sourcing");

	}
	
		@RequestMapping("/userlist")
		public ModelAndView listUsers() {
			ModelAndView mv = new ModelAndView("userlist");
			mv.addObject("items", dao.findAllItems());
			return mv;
			
		}  
		
		@RequestMapping("/adduser")
		public ModelAndView addUser(Users user) {
			ModelAndView mv = new ModelAndView("userlist");
			mv.addUser(String user.getFName(), String user.getlName(), String user.getPhoneNum(), String user.getEmail());
			return mv;
		}
	
	
//	@PostMapping(value="userlist")
//	public ModelAndView newUser(Users newUser) {
//		dao.addUsers(newUser.getfName(), newUser.getlName(), newUser.getPhoneNum(), newUser.getEmail());
//		return new ModelAndView("redirect:/userlist");
//	
//	}
}
