package com.commerce.trans

class Payment {

    String paymentNum


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
