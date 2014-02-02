package commerce.trans

import commerce.inventory.InventoryItem
import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.Resource

/**
 * The line item
 */
@Resource()
@MultiTenant
class LineItem {


    /**
     * Inventory Item
     */
    InventoryItem inventoryItem

    /**
     * The number of quality orded
     */
    long quantity

    /**
     * Total number of sales
     */
    double total


    static belongsTo = [transaction: Transaction]

    static constraints = {
        inventoryItem blank : false
    }
}
