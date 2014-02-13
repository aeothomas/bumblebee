package commerce.products

import commerce.business.Department
import commerce.inventory.InventoryItem
import commerce.inventory.RawGoodItem
import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.Resource


/**
 * The object represents a product in the inventory
 * @author wshao
 *
 */
@Resource()
@MultiTenant
class Product {

    /**
     * The product's name
     */

    String name
    /**
     * The description of a product
     */
    String description

    /**
     * The pricing type of a product:
     * 1. The price is fixed for a product.And it can be decided on the back-office
     * 2. The product is sold by measurement unit, and the unit price is fixed on the back-office
     * 3. The sale price is provided on the register
     */
    ProductPricingType pricingType

    /**
     * The product category
     */
    ProductCategory category


    Department department

    /**
     * TODO Review required . Should it be StoreInventory or staying at the global level
     */
    double cost

    /**
     * TODO Review productUnitType
     */
    static hasMany = [productUnitType: ProductUnitType,
            inventoryItem: InventoryItem,
            rawGoodItem: RawGoodItem,
            modifiers: Modifier,
            addon: AddOn,
            excludeOptions: AddOn]

    /**
     * Here, Product will have 0 or 1 product unit type. Enhance using a join table to save space
     * It will have a product unit type while the product pricing type is "sold by unit"
     * */
    static constraints = {
        name unique: 'tenantId', blank: false
        category blank: false
        pricingType blank: false

    }
    static mapping = {

    }


}
