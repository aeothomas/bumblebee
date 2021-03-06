package commerce.inventory

import commerce.products.Product
import commerce.suppliers.Supplier
import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.Resource

/**
 * 
 * <code>RawGoodItem</code> is the materials or ingredient to make up a inventory item. <br/>
 * It generally is used to generate the cost burn down report
 * 
 * @author wshao
 *
 */
@Resource()
@MultiTenant
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
        name blank:false , unique: 'tenantId'
        cost nullable:true
        quantity nullable:true

    }

}
