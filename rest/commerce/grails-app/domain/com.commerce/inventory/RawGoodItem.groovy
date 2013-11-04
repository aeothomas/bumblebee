package com.commerce.inventory


import com.commerce.products.Product;
import com.commerce.suppliers.Supplier

/**
 * 
 * <code>RawGoodItem</code> is the materials or ingredient to make up a inventory item. <br/>
 * It generally is used to generate the cost burn down report
 * 
 * @author wshao
 *
 */
class RawGoodItem {

	/**
	 * The name of the raw good
	 */
	String name
	
	/**
	 * The cost of the raw good
	 */
	double cost
	
	/**
	 * Quantity of the raw good on hand
	 */
	long quantity

	
	/**
	 * The suppliers
	 */
	static hasMany = [rawGoodSupplier: Supplier, product:Product]
	
	static belongsTo = Product

	
    static constraints = {
        name blank:false
    }
}
