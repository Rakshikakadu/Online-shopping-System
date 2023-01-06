package com.ecom.Services;

import java.util.List;

import com.ecom.Entity.Products;
import com.ecom.Exception.CategoryException;
import com.ecom.Exception.ProductException;

public interface ProductsService {
	public Products addProduct(Products product) throws ProductException;

	public Products daleteProduct(Integer productId) throws ProductException;

	public Products getProductById(Integer productId) throws ProductException;

	public List<Products> getAllProducts() throws ProductException;

	public List<Products> getProductsByName(String productName) throws ProductException;

	public List<Products> getProductsByType(String productType) throws ProductException;

	public List<Products> getProductsByCategory(String categoryName) throws ProductException, CategoryException;
}
