package com.capgemini.salesmanagement.dao;

import java.util.HashMap;
import java.util.List;

import com.capgemini.salesmanagement.bean.Sale;

public interface ISaleDAO {
	public HashMap<Integer,Sale> insertSalesDetails(Sale sale);
	
}
