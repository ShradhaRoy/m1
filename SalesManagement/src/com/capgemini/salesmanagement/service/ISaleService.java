package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.IncorrectNameException;
import com.capgemini.salesmanagement.exceptions.IncorrectPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductException;
import com.capgemini.salesmanagement.exceptions.InvalidSaleIdException;
import com.capgemini.salesmanagement.exceptions.ProductLimitSurpassedException;

public interface ISaleService {
	public HashMap<Integer,Sale> insertSalesDetails(Sale sale);
	public boolean validateProductCode(int productId) throws InvalidProductCodeException;
	boolean ValidateQuantity(int qty) throws ProductLimitSurpassedException;
	public boolean validateProductCat(String prodCat) throws InvalidProductException;
	public boolean validateProductName(String prodName) throws IncorrectNameException;
	public boolean validateProductPrice(float price) throws IncorrectPriceException;
}
