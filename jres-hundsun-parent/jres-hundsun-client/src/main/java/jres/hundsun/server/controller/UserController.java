package jres.hundsun.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hundsun.jrescloud.rpc.annotation.CloudReference;

import jres.hundsun.server.UserService;
import jres.hundsun.server.dto.User;

@RestController
public class UserController {

	@CloudReference
	private UserService userService;
	
	@RequestMapping(value= "getuser", method = RequestMethod.GET)
	public User getUser(@RequestParam("user_id")int userID) {
		return userService.getUser(userID);
		
	}
}
