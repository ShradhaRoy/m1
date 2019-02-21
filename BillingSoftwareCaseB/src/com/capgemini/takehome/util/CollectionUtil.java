package com.capgemini.takehome.util;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import com.capgemini.takehome.beans.Product;

public class CollectionUtil {
	public static Map<Integer,Product> products=new HashMap<Integer,Product>();
	public static int PRODUCT_ID=1000;
	public static int getPRODUCT_ID() {
		return ++PRODUCT_ID;
		
	}
	static {
		products.put(1001, new Product(1001,"iPhone","Electronics",35000));
		products.put(1002, new Product(1002,"LEDTV","Electronics",45000));
		products.put(1003, new Product(1003,"Teddy","Toys",800));
		products.put(1004, new Product(1004,"Telescope","Toys",50000));	
	}

}
