package commerce.products

import grails.plugin.multitenant.core.annotation.MultiTenant

/**
 *  The option in the modifier
 */
@MultiTenant
class ModifierOption {

    String name

    double price

    /**
     * This indicates the product will sale with this option as default.
     */
    boolean isBase

    static belongsTo = [modifier:Modifier]

    static constraints = {
        name unique:'tenantId'
    }
}
