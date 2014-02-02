package commerce.products

import grails.plugin.multitenant.core.annotation.MultiTenant

@MultiTenant
class ProductUnitType {
	
	String name

    int type

    static constraints = {
    }
}
