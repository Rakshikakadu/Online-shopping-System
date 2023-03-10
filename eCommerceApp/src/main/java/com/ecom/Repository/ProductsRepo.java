package com.ecom.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.Entity.Products;


@Repository
public interface ProductsRepo extends JpaRepository<Products, Integer>{
	public List<Products> findByProductName(String productName);
	public List<Products> findByType(String type);
	public List<Products> findByCategories(String categories);
}
