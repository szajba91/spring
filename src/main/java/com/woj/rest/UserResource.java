package com.woj.rest;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.woj.domain.UserDTO;

@RestController
public class UserResource {

	private static final Logger log =Logger.getLogger(UserResource.class);
	
	@GetMapping("/user")
	public UserDTO getSUser(@RequestParam(value="id") String id, HttpServletRequest request){
		log.info(request.getRemoteAddr());
		UserDTO wojtek= new UserDTO(Long.valueOf(id),"Wojciech");
		return wojtek;
	};
	
}
