package commerce.trans

import grails.rest.Resource

/**
 * The payment type
 */
@Resource()
class PaymentType {


    String name

    int type

    static constraints = {
    }
}
