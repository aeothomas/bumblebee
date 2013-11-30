package commerce.trans

import commerce.emp.Employee
import commerce.reg.Register
import commerce.store.Store
import grails.rest.Resource

/**
 *
 */
@Resource()
class Transaction {

    /**
     *  The unique transaction number
     * TODO review String vs Long
     */
    String transNum

    /**
     * The order number
     * TODO review String vs Long
     */
    String orderNum

    /**
     * The of transaction
     */
    Date date

    /**
     * The unique code of store
     */
    String storeCode

    /**
     * The unique code of register code
     *  TODO review if we need to remove it
     */
    String registerCode

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
     * The payment details
     */
    Payment payment

    /**
     * Indicate the type of transaction
     */
    OperationType operationType

    static hasMany = [lineItem: LineItem, muliplePayments:Payment]

    static constraints = {

    }
}
