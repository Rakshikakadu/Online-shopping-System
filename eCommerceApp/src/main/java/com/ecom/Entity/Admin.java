package com.ecom.Entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;

	@Pattern(regexp = "^[A-Za-z]*", message = "Name cannot start with number of symbol")
	private String adminName;

	@Size(min = 3, max = 20, message = "Password length should be minimun 3")
	private String password;

	@Email
	private String email;

	@Size(min = 10, max = 10, message = "Enter valid mobile length of length 10")
	private String mobile;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Report> reports = new ArrayList<>();

//	public Integer getAdminId() {
//		return adminId;
//	}
//
//	public void setAdminId(Integer adminId) {
//		this.adminId = adminId;
//	}
//
//	public String getAdminName() {
//		return adminName;
//	}
//
//	public void setAdminName(String adminName) {
//		this.adminName = adminName;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getMobile() {
//		return mobile;
//	}
//
//	public void setMobile(String mobile) {
//		this.mobile = mobile;
//	}
//
//	public List<Report> getReports() {
//		return reports;
//	}
//
//	public void setReports(List<Report> reports) {
//		this.reports = reports;
//	}
//
//	public Admin() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Admin(Integer adminId,
//			@Pattern(regexp = "^[A-Za-z]*", message = "Name cannot start with number of symbol") String adminName,
//			@Size(min = 3, max = 20, message = "Password length should be minimun 3") String password,
//			@Email String email,
//			@Size(min = 10, max = 10, message = "Enter valid mobile length of length 10") String mobile,
//			List<Report> reports) {
//		super();
//		this.adminId = adminId;
//		this.adminName = adminName;
//		this.password = password;
//		this.email = email;
//		this.mobile = mobile;
//		this.reports = reports;
//	}
//
//	public Admin(@Pattern(regexp = "^[A-Za-z]*", message = "Name cannot start with number of symbol") String adminName,
//			@Size(min = 3, max = 20, message = "Password length should be minimun 3") String password,
//			@Email String email,
//			@Size(min = 10, max = 10, message = "Enter valid mobile length of length 10") String mobile,
//			List<Report> reports) {
//		super();
//		this.adminName = adminName;
//		this.password = password;
//		this.email = email;
//		this.mobile = mobile;
//		this.reports = reports;
//	}
//
//	@Override
//	public String toString() {
//		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", password=" + password + ", email=" + email
//				+ ", mobile=" + mobile + "]";
//	}

}