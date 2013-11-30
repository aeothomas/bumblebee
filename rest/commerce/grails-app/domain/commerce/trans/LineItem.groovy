package commerce.trans

import commerce.inventory.InventoryItem
import grails.rest.Resource

/**
 * The line item
 */
@Resource()
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
