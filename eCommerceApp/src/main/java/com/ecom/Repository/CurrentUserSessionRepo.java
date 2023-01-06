package com.ecom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Entity.CurrentUserSession;


@Repository
public interface CurrentUserSessionRepo extends JpaRepository<CurrentUserSession, Integer>{
	public CurrentUserSession findBySessionKey(String sessionkey);
}
