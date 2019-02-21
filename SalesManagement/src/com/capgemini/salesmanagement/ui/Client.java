package com.capgemini.salesmanagement.ui;

import java.util.HashMap;
import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.IncorrectNameException;
import com.capgemini.salesmanagement.exceptions.IncorrectPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductException;
import com.capgemini.salesmanagement.exceptions.ProductLimitSurpassedException;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ISaleService services=new SaleService();
		int productId=0;;
		int qty=0;
		String prodCat=" ";
		String prodName="";
		float price=0.0f;
		int saleId=0;
		
		try {
		System.out.println("Enter product Code : ");
		productId=sc.nextInt();
		if(services.validateProductCode(productId));
		
		System.out.println("Enter the quantity: ");
		qty=sc.nextInt();
		if(services.ValidateQuantity(qty));
		
		System.out.println("Enter product Category - Electronics or Toys");
		prodCat=sc.next();
		if(services.validateProductCat(prodCat));
		
		System.out.println("Enter the name of product: ");
		prodName=sc.next();
		if(services.validateProductName(prodName));
		
		System.out.println("Enter price of product: ");
		price=sc.nextFloat();
		if(services.validateProductPrice(price));
		
		
		}catch(InvalidProductCodeException e) {
			System.out.println("Invalid product Code");
		} catch (ProductLimitSurpassedException e) {
			System.out.println("Product Limit out of bounds");
		} catch (InvalidProductException e) {
			System.out.println("Not a valid product");
		} catch (IncorrectNameException e) {
			System.out.println("Incorrect product Name");
		} catch (IncorrectPriceException e) {
			System.out.println("Invalid price input");
		}
		float lineTotal=price*qty;
		
		Sale sale = new Sale(productId, prodName, prodCat, CollectionUtil.currDate(), qty, lineTotal);
		//System.out.println(services.insertSalesDetails(sale));
		  HashMap<Integer,Sale >h =services.insertSalesDetails(sale); 
		  for (Integer ir :h.keySet()) { System.out.println(h.get(ir));
		 
		  }
			
	}

	}
