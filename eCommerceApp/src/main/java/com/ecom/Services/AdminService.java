package com.ecom.Services;

import java.util.List;

import com.ecom.Entity.Admin;
import com.ecom.Exception.AdminException;

public interface AdminService {
	public Admin addAdmin(Admin admin) throws AdminException;

	public List<Admin> getAllAdmins() throws AdminException;
}
