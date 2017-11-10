package com.dev.ws.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dev.ws.entity.User;
import com.dev.ws.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService service;
	@RequestMapping("/userlist.htm")
	public String getUserData(Model model){
		List<User> userlist = service.queryForList();
		model.addAttribute("userlist", userlist);
	return "userlist" ;	
	}
}
