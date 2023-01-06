package com.ecom.Services;

import com.ecom.Entity.LoginDTO;
import com.ecom.Exception.LoginException;

public interface LoginService {
	public String customerLogin(LoginDTO dto) throws LoginException;
	public String customerLogout(String key) throws LoginException;
}
