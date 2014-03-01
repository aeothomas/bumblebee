package commerce.emp

import commerce.commons.Address
import commerce.store.Store
import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.Resource

/**
 * Employ Object
 */
@Resource()
@MultiTenant
class Employee extends grails.plugin.nimble.core.ProfileBase  {

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
        code unique:true, blank:false//Code should be validated on the application level
        store nullable:true,blank:true
        phoneNumber nullable:true,blank:true
        address nullable:true,blank:true
        code unique:'tenantId'
    }
}
