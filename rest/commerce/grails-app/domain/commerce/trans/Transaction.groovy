package commerce.trans

import commerce.emp.Employee
import commerce.reg.Register
import commerce.store.Store
import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.Resource

/**
 *
 */
@Resource()
@MultiTenant
class Transaction {

    /**
     *  The unique transaction number
     */
    String transNum

    /**
     * The order number
     */
    String orderNum

    /**
     * The receipt number
     */
    String receiptNum

    /**
     * The of transaction
     */
    Date date

    /**
     * Cashier
     */
    Employee cashier

    /**
     * Store
     */
    Store store

    /**
     * The register used in this transaction
     */
    Register register

    /**
     * Amount of the transaction in total
     */
    double amount

    /**
     * Tax of taxes included in transaction
     */
    double tax

    /**
     * Indicate the type of transaction
     */
    OperationType operationType

    /**
     * Payments
     */
    Payment payment

    static hasMany = [lineItem: LineItem]

    static constraints = {

    }
}
