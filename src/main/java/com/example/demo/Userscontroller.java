package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/user")
public class Userscontroller {
	
	@GetMapping
	public String getUsers(@RequestParam (value="page") int pageno ,@RequestParam (value="limit") int limitno ) {
		
		return "Http user request send for page no"+ pageno +"limit is "+limitno;
	}
	
	@GetMapping(path="/{userID}")
	public String getUser(@PathVariable String userID) {
		
		return "Http user request send for "+ userID;
	}
	@PostMapping
	public String CreateUser() {
		
		return "This is user Crete request.";
	}
	@PutMapping
	public String Updateuser() {
		
		return"This is user Update request.";
	}
	@DeleteMapping
	public String DeleteUsers() {
		
		return"This is user Delete request.";
	}
	

}
