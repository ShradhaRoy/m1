package com.capgemini.takehome.ui;
import java.util.Scanner;
import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.exceptions.InvalidProductIdException;
import com.capgemini.takehome.exceptions.InvalidProductQuantityException;
import com.capgemini.takehome.exceptions.NoProductAvailableException;
import com.capgemini.takehome.service.IProductService;
import com.capgemini.takehome.service.ProductService;

public class Client {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IProductService services=new ProductService();
		System.out.println("Enter 1 for Generating Bill and  2 to Exit");
		int choice=sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("******************************Bill Generation*****************************");
				try {
				System.out.println("Enter product code");
				int productCode=sc.nextInt();
				if(services.validateProductCode(productCode));
				System.out.println("Enter number of products/Quantity");
				int quantity=sc.nextInt();
				if(services.ValidateQuantity(quantity));
				Product prod=services.getProductDetails(productCode);
				prod.setLineTotal(quantity*prod.getProductPrice());
				System.out.println(prod);
			} catch (InvalidProductIdException | InvalidProductQuantityException e) {
								e.printStackTrace();
			} catch (NoProductAvailableException e) {
				e.printStackTrace();
			}
			case 2:
				System.out.println("Exit");
				System.exit(0);
			
		}

	}

}
