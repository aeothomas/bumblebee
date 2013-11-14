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
	String name
	/**
	 * The unique code of store
	 */
	String code
	/**
	 * The address of the store
	 */
	Address address

    /**
     * Embedded Address
     */
    static embedded = ['address']

    static constraints = {
        name blank:false
        code unique: true, blank:false
    }
}
