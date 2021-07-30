package com.twokeys.tkuser.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twokeys.tkuser.dto.UserDTO;
import com.twokeys.tkuser.service.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private  UserService service;
		
	@RequestMapping(method =  RequestMethod.GET)
	public ResponseEntity<UserDTO> findByName(@RequestParam(value="email")String email){
		return ResponseEntity.ok().body(service.findByEmail(email));
	}
}
