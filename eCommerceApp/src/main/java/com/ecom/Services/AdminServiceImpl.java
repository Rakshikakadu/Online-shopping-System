package com.ecom.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Entity.Admin;
import com.ecom.Exception.AdminException;
import com.ecom.Repository.AdminRepo;

@Service
protected class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepo adminRepo;

	@Override
	public Admin addAdmin(Admin admin) throws AdminException {
		Admin admin2 = adminRepo.save(admin);
		if (admin2 == null) {
			throw new AdminException("Admin cannot be added.");
		}
		return admin2;
	}

	@Override
	public List<Admin> getAllAdmins() throws AdminException {
		List<Admin> admins = adminRepo.findAll();
		if (admins.isEmpty()) {
			throw new AdminException("No admin found.");
		}
		return admins;
	}

}
