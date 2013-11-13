package com.commerce.inventory

import com.commerce.products.Product
import com.commerce.suppliers.Supplier

/**
 * The global inventory item which has a unique sku id
 */
class InventoryItem{
	
	/**
	 * Product
	 */
	Product product
	
	/**
	 * Each InventoryItem has a unique sku id
	 */
	String sku
	
	/**
	 * The flag indicates if the items will be tracked inside the report
	 */
	boolean isTracked
	
	/*
	 * It's the global price for the inventory Item
	 */
	double price
	
	static hasMany = [globalSupplier: Supplier]


	/**
	 * The IventoryItem is 1-to-many related with Product Entity. One Product can possible have multiple InventoryItem
	 */
	static belongsTo =  Product
	
    static constraints = {
		sku unique: true, blank:false
    }
}
