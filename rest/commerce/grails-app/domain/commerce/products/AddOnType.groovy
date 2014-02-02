package commerce.products

import grails.plugin.multitenant.core.annotation.MultiTenant

/**
 * An AddOnType indicates the type of the add-on group
 *
 * 1. It can be adding options group
 * 2. It can also be NO options group
 */
@MultiTenant
class AddOnType {

    String name

    int type

    static constraints = {
    }
}
