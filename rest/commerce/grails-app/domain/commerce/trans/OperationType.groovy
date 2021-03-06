package commerce.trans

import grails.plugin.multitenant.core.annotation.MultiTenant

/**
 * It indicates the operation type of the transaction. For example:
 *  1. purchase,
 *  2. refund
 */
class OperationType {

    /**
     * Name of the operation
     */
    String name

    int type

    static constraints = {
        name blank:false, unique: true
        type blank:false, unique: true
    }
}
