package commerce.trans

import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.Resource

/**
 * The payment type
 */
@Resource()
@MultiTenant
class PaymentType {


    String name

    int type

    static constraints = {
    }
}
