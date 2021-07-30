package com.twokeys.tkoauthserver.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.twokeys.tkoauthserver.entities.User;

@Component
@FeignClient(name="tk-user", path = "/users")
public interface UserFeignClient {
	@RequestMapping(method =  RequestMethod.GET)
	ResponseEntity<User> findByName(@RequestParam(value="email")String email);
		
}
