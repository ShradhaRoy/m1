package com.capgemini.takehome.dao;

import java.util.HashMap;
import com.capgemini.takehome.beans.Product;

public interface IProductDAO {
	Product getProductDetails(int ProductCode);
	public HashMap<Integer,Product> insertSalesDetails(Product product);

}
