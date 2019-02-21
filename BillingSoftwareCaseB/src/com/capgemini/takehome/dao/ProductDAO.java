package com.capgemini.takehome.dao;
import java.util.HashMap;
import com.capgemini.takehome.beans.Product;
import com.capgemini.takehome.util.CollectionUtil;

public class ProductDAO implements IProductDAO {

	@Override
	public Product getProductDetails(int ProductCode) {
		return CollectionUtil.products.get(ProductCode);
		
	}

	@Override
	public HashMap<Integer, Product> insertSalesDetails(Product product) {
		
		product.setProductId(CollectionUtil.getPRODUCT_ID());
		CollectionUtil.products.put(product.getProductId(),product);

		return (HashMap<Integer, Product>) CollectionUtil.products;
	}
	

}
