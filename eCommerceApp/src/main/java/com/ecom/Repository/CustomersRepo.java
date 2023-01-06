package com.ecom.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Entity.Category;
import com.ecom.Entity.Customers;


@Repository
public interface CustomersRepo extends JpaRepository<Customers, Integer>{
	public List<Category> findByCategoryName(String categoryName);

	public Customers findByEmail(String email);
}
