package com.ecom.Entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrentUserSession {
	
	@Id
	@Column(unique = true)
	private Integer userId;

	private String sessionKey;

	private LocalDateTime localDateTime;

//	public CurrentUserSession() {
//
//	}
//
//	public CurrentUserSession(Integer userId, String sessionKey, LocalDateTime localDateTime) {
//		this.userId = userId;
//		this.sessionKey = sessionKey;
//		this.localDateTime = localDateTime;
//	}
//
//	public Integer getUserId() {
//		return userId;
//	}
//
//	public void setUserId(Integer userId) {
//		this.userId = userId;
//	}
//
//	public String getSessionKey() {
//		return sessionKey;
//	}
//
//	public void setSessionKey(String sessionKey) {
//		this.sessionKey = sessionKey;
//	}
//
//	public LocalDateTime getLocalDateTime() {
//		return localDateTime;
//	}
//
//	public void setLocalDateTime(LocalDateTime localDateTime) {
//		this.localDateTime = localDateTime;
//	}

}