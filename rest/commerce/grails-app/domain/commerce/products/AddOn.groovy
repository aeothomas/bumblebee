package commerce.products

import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.Resource

/**
 * Add-On is the domain attached to a product that provide more options to a normal product
 * A product can only have one group of Add-on and a add-on group can have multiple AddOnOption
 */
@Resource()
@MultiTenant
class AddOn {

    String name

    /**
     * AddOn Type indicate the type of add-on , it can be:
     *  1. Adding more options
     *  2. Exclude some options
     */
    AddOnType type

    static hasMany  = [options: AddOnOption]

    static constraints = {
        name unique:'tenantId'
    }
}
