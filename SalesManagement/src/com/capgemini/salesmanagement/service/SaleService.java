package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exceptions.IncorrectNameException;
import com.capgemini.salesmanagement.exceptions.IncorrectPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductException;
import com.capgemini.salesmanagement.exceptions.InvalidSaleIdException;
import com.capgemini.salesmanagement.exceptions.ProductLimitSurpassedException;

public class SaleService implements ISaleService {
private ISaleDAO salesData= new SaleDAO();
	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
		
		return salesData.insertSalesDetails(sale);
	}

	@Override
	public boolean validateProductCode(int productId) throws InvalidProductCodeException {
		if(productId==1001 || productId==1002 || productId==1003 ||productId==1004) {
			return true;
		}
		else throw new InvalidProductCodeException("Invalid Product Code");
		
	}

	@Override
	public boolean ValidateQuantity(int qty) throws ProductLimitSurpassedException {
		if(qty>0 || qty<5) {
			return true;
		}
		else throw new ProductLimitSurpassedException("limit");
	}

	@Override
	public boolean validateProductCat(String prodCat) throws InvalidProductException {
		if(prodCat.equalsIgnoreCase("Electronics") || prodCat.equalsIgnoreCase("Toys")) {
			return true;
		}
		else throw new InvalidProductException("invalid type");
		
	}

	@Override
	public boolean validateProductName(String prodName) throws IncorrectNameException {
		if (prodName.equalsIgnoreCase("TV")|| prodName.equalsIgnoreCase("SmartPhone")|| prodName.equalsIgnoreCase("VideoGame")|| prodName.equalsIgnoreCase("SoftToy")|| prodName.equalsIgnoreCase("Telescope") || prodName.equalsIgnoreCase("BarbeeDoll")) {
			return true;
		}
		else throw new IncorrectNameException("not the correct product name");
		
	}

	@Override
	public boolean validateProductPrice(float price) throws IncorrectPriceException {
		if(price>200) {
			return true;
		}
		else throw new IncorrectPriceException("invalid price");
	}

}
