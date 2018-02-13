package com.anshu.mynextbook.user.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anshu.mynextbook.user.model.User;

@RestController
@RequestMapping(value="/my-next-book/v1")
public class UserController {
	
	@RequestMapping(value="users",method=RequestMethod.GET)
	public ResponseEntity<User> getAllUsers() {
		User u1 = new User();
		u1.setId(1l);
		u1.setFirstName("Anshuman");
		u1.setLastName("Singh");
		
		return new ResponseEntity<User>(u1,HttpStatus.OK);
	}
	
}