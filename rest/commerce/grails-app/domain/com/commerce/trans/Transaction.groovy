package com.commerce.trans

import com.commerce.emp.Employee
import com.commerce.reg.Register
import com.commerce.store.Store

/**
 *
 */
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

    static hasMany = [lineItem: LineItem, multiplePayments:Payment]

    static constraints = {

    }
}
