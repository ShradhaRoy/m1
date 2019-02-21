package com.capgemini.takehome.service;
import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.dao.IProductDAO;
import com.capgemini.takehome.dao.ProductDAO;
import com.capgemini.takehome.exceptions.InvalidProductIdException;
import com.capgemini.takehome.exceptions.InvalidProductQuantityException;
import com.capgemini.takehome.exceptions.NoProductAvailableException;

public class ProductService implements IProductService {
	private IProductDAO product= new ProductDAO();
	
	@Override
	public Product getProductDetails(int ProductCode) throws NoProductAvailableException {
		Product prod =product.getProductDetails(ProductCode);
		if(prod==null)
			throw new NoProductAvailableException("NO product Available");
		return prod;
	}
	@Override
	public boolean validateProductCode(int productId) throws InvalidProductIdException {	
		int prodId=productId;
		int count=0;
		while(prodId>0)
		{
			prodId=prodId/10;
			count++;
		}
		if(count!=4)
			throw new InvalidProductIdException("INVALID PRODUCT-ID");
		return true;
	}
	@Override
	public boolean ValidateQuantity(int qty) throws InvalidProductQuantityException {
		if(qty<0 || qty==0)
			throw new InvalidProductQuantityException("Select the correct Quantity");
		return true;
	}
}
