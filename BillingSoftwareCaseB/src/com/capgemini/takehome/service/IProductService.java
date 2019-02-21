package com.capgemini.takehome.service;
import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.exceptions.InvalidProductIdException;
import com.capgemini.takehome.exceptions.InvalidProductQuantityException;
import com.capgemini.takehome.exceptions.NoProductAvailableException;

public interface IProductService {
	Product getProductDetails(int ProductCode) throws NoProductAvailableException;
	public boolean validateProductCode(int productId) throws InvalidProductIdException;
	boolean ValidateQuantity(int qty) throws InvalidProductQuantityException;

}
