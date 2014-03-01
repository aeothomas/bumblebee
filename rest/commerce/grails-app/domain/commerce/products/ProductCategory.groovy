package commerce.products

import grails.plugin.multitenant.core.annotation.MultiTenant

@MultiTenant
class ProductCategory {

	/**
	 * Product Category Name
	 */
	String name
	
    static constraints = {
		name unique: 'tenantId'
    }
	
	
}
