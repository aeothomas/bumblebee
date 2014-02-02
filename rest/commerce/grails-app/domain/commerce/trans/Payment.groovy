package commerce.trans

import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.Resource

@Resource()
@MultiTenant
class Payment {

    String paymentNumber

    double amount

    /**
     * Indicate the payment type of this transaction:
     *  1. card
     *  2. cashes
     *  3. Hyper
     */
    PaymentType paymentType

    static belongsTo = [transaction:Transaction]

    static constraints = {
    }
}
