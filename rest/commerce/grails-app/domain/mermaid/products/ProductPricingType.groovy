package mermaid.products

/**
 * ProductPricingType specifies the type of pricing is used for the product.
 * For example:
 *      1. By Backoffice
 *      2. By Unit
 *      3. By Registe
 *
 */
class ProductPricingType {

	/**
	 * Name of product pricing type
	 */
	String name

    /**
     * The type code
     */
    int type
	
    static constraints = {
		name unique:true, nullable:false, blank:false
    }
}
