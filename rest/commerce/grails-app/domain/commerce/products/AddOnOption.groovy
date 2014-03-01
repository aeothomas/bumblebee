package commerce.products

import grails.plugin.multitenant.core.annotation.MultiTenant

/**
 * AddOnOption is one option configured inside AddOn Group
 */
@MultiTenant
class AddOnOption {

    String name

    double price

    static belongsTo = [addonGroup:AddOn]

    static constraints = {
    }
}
