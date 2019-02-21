package com.capgemini.salesmanagement.util;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.capgemini.salesmanagement.bean.Sale;

public class CollectionUtil {
	public static Map<Integer,Sale> sales=new HashMap<Integer,Sale>();
	public static HashMap<Integer, Sale> getCollection(){
		return (HashMap<Integer, Sale>) sales;
	}
	public static LocalDate currDate() {
		return java.time.LocalDate.now();
		
	}
	public static int getSALEid() {
		return (int) (Math.random()*1000);
	}
}
