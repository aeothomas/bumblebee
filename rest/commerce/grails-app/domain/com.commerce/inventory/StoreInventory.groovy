package com.commerce.inventory

import com.commerce.store.Store
import com.commerce.suppliers.Supplier

/**
 * The details of inventory are held on the one store
 * @author wshao
 *
 */
class StoreInventory {
	
	/**
	 * Belong to which store
	 */
	Store store
	
	/**
	 * Inventory Item
	 */
	InventoryItem item

	/**
	 * The number of items are stored in this shop
	 */
	long quantity
	
	/**
	 * The special price the item in the local store
	 * TODO review here
	 */
	//	double price
	
	/**
	 * Suppliers associated to local store
	 */
	static hasMany = [storeSupplier: Supplier]
	
	
    static constraints = {
    }
}
