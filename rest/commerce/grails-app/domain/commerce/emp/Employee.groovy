package commerce.emp

import commerce.commons.Address
import commerce.store.Store
import grails.rest.Resource

/**
 * Employ Object
 */
@Resource()
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
