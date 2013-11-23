package commerce.suppliers

import commerce.commons.Address
import commerce.inventory.InventoryItem
import commerce.inventory.RawGoodItem
import commerce.inventory.StoreInventory

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

    static embedded = ['address']
	
    static constraints = {
       code unique: true, blank: false
       name blank: false
    }
}
