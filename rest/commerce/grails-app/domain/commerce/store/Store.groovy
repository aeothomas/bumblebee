package commerce.store

import commerce.commons.Address
import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.Resource

/**
 * The store domain represents a store object
 * @author wshao
 *
 */
@Resource()
@MultiTenant
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
