package com.commerce.suppliers

import com.commerce.commons.Address
import com.commerce.inventory.InventoryItem
import com.commerce.inventory.StoreInventory
import com.commerce.inventory.RawGoodItem

/**
 * The Supplier domain
 */
class Supplier {
	
	/**
	 * Supplier Name
	 */
	String name;
	
	/**
	 * Supplier Code 
	 */
	String code;
	
	/**
	 * Business address of the supplier
	 */
	Address address;
	
	
	static hasMany = [rawGood : RawGoodItem, inventoryItem: InventoryItem, storeInventory: StoreInventory]
	
	static belongsTo = [RawGoodItem, InventoryItem, StoreInventory]
	
    static constraints = {
       code unique: true, blank: false
       name blank: false
    }
}
