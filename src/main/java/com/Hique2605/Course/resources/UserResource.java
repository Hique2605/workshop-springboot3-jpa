package com.Hique2605.Course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hique2605.Course.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		//test
		User u = new User(1L, "White", "White@gmail.com", "99999999", "123");
		return ResponseEntity.ok().body(u);
	}
	
	
	
	
}



