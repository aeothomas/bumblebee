package com.commerce.store

import com.commerce.commons.Address

/**
 * The store domain represents a store object
 * @author wshao
 *
 */
class Store {
	/**
	 * The name of store
	 */
	String storeName
	/**
	 * The unique code of store
	 */
	String storeCode
	/**
	 * The address of the store
	 */
	Address address 
	
    static constraints = {
        storeName blank:false
        storeCode unique: true, blank:false
    }
}
