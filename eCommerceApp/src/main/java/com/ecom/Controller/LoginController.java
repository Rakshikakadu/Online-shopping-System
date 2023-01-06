package com.ecom.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecom.Entity.LoginDTO;
import com.ecom.Exception.LoginException;
import com.ecom.Services.LoginService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	/*--------------------------------------------Login Controller--------------------------- */

	@PostMapping("/customerLogin")
	public ResponseEntity<String> customerLoginHandler(@RequestBody LoginDTO dto) throws LoginException {
		String res = loginService.customerLogin(dto);

		return new ResponseEntity<String>(res, HttpStatus.ACCEPTED);
	}

	@GetMapping("/customerLogout")
	public ResponseEntity<String> customerLogOutHandler(@RequestParam String key) throws LoginException {
		String res = loginService.customerLogout(key);

		return new ResponseEntity<String>(res, HttpStatus.OK);
	}
	
}
