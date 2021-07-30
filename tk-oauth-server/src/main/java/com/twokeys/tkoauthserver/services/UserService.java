package com.twokeys.tkoauthserver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twokeys.tkoauthserver.entities.User;
import com.twokeys.tkoauthserver.feignclients.UserFeignClient;

@Service
public class UserService {
	@Autowired
	private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		User user = userFeignClient.findByName(email).getBody();
		return user;
	}
}
