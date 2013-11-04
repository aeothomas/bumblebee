package com.commerce.emp

import com.commerce.business.Department
import com.commerce.commons.Address
import com.commerce.store.Store

/**
 * Employ Object
 */
class Employee {

    /**
     * The unique number of the employee
     */
    String code

    /**
     * First name of the employee
     */
    String firstName

    /**
     * Last name of the employee
     */
    String lastName

    /**
     * Remove the middle name to reduce the space
     */
    //String middleName

    /**
     * Address of the
     */
    Address address

    String phoneNumber

    /**
     * The store which the employee belong to
     */
    Store store

    //TODO adding more

    static embedded = ['address']

    static constraints = {
    }
}
