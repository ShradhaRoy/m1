package com.capgemini.salesmanagement.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class SaleDAO implements ISaleDAO {
	public HashMap<Integer,Sale> insertSalesDetails(Sale sale){
		sale.setSaleId(CollectionUtil.getSALEid());
		CollectionUtil.sales.put(sale.getSaleId(),sale);

		return (HashMap<Integer, Sale>) CollectionUtil.getCollection();		
	}


}
