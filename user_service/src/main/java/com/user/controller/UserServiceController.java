package com.user.controller;

import com.user.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserServiceController {
	
	@Autowired
	private UserService service;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId ) {
		Optional<User> optionalUser=service.getUser(userId);
		User user= optionalUser.get();
		List<Contact> contact=this.restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserId(),List.class);
		user.setContacts(contact);
		return user;
	}
	
//	@GetMapping("/{userId}")
//	public Optional<User> getUser(@PathVariable("userId") Long userId ) {
//		Optional<User> user=service.getUser(userId);
////		Contact contact=this.restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserId(),Contact.class);
////		user.setContacts(contact);
//		return user;
//	}
public ResponseEntity getUserFallBack(Exception e){
	String message="service is down please try after sometime";
	return ResponseEntity.ok().body(message);
}

	@PostMapping("/addUser")
	public void addUser(@RequestBody User user){
		service.saveUser(user);
	}

}
