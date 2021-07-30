package com.twokeys.tkoauthserver.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twokeys.tkoauthserver.entities.User;
import com.twokeys.tkoauthserver.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@Autowired
	private  UserService service;
	
	@RequestMapping(method =  RequestMethod.GET)
	public ResponseEntity<User> findByName(@RequestParam(value="email")String email){
		return ResponseEntity.ok().body(service.findByEmail(email));
	}

}
