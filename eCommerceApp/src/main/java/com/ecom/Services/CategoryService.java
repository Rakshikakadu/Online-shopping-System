package com.ecom.Services;

import java.util.List;

import com.ecom.Entity.Category;
import com.ecom.Entity.Products;
import com.ecom.Exception.CategoryException;
import com.ecom.Exception.ProductException;

public interface CategoryService {
	
	public Category addCategory(Category category) throws CategoryException;

	public Category deleteCategory(Integer categoryId) throws CategoryException;

	public Category getCategoryByID(Integer categoryId) throws CategoryException;

	public List<Category> getAllCategories() throws CategoryException;

	public List<Products> addProductsToCategory(Integer categoryId, Integer productId)
			throws CategoryException, ProductException;
	
}
