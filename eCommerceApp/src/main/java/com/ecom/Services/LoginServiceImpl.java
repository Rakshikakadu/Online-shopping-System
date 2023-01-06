package com.ecom.Services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Entity.CurrentUserSession;
import com.ecom.Entity.Customers;
import com.ecom.Entity.LoginDTO;
import com.ecom.Exception.LoginException;
import com.ecom.Repository.CurrentUserSessionRepo;
import com.ecom.Repository.CustomersRepo;

import net.bytebuddy.utility.RandomString;


@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private CustomersRepo cRepo;
	
	@Autowired
	private CurrentUserSessionRepo sRepo;

	@Override
	public String customerLogin(LoginDTO dto) throws LoginException {
		
		Customers existingCustomer = cRepo.findByEmail(dto.getEmail());
		
		if (existingCustomer == null) {
			throw new LoginException("Enter valid email id..");
		}
		
		if (existingCustomer.getPassword().equals(dto.getPassword())) {
			String key = new RandomString().make(6);
			
			CurrentUserSession userSession = new CurrentUserSession(existingCustomer.getCustomerId(),key,LocalDateTime.now());
			
			sRepo.save(userSession);
			
			return key;
		}else {
			throw new LoginException("Invalid password..");
		}
		
	}

	@Override
	public String customerLogout(String key) throws LoginException {
		CurrentUserSession currentSession = sRepo.findBySessionKey(key);
		
		if (currentSession == null) {
			throw new LoginException("Invalid session key..");
		}
		
		sRepo.delete(currentSession);
		
		return "Logged out successfully...";
	}
	
}
