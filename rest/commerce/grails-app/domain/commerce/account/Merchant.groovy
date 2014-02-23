package commerce.account

import commerce.commons.Address
import grails.plugin.multitenant.core.Tenant
import grails.rest.*

/**
 * Merchant is a tenant class represents a business unit
 */
//@Resource()
class Merchant implements Tenant{

    /**
     * Name of the business
     */
    String name

    String domain

    Address address

    /**
     * This unique Id is preserved for the future improvement with MongoDB.
     */
    String uuid

    /**
     * The subscription plan
     */
    Plan plan

    /**
     *
     */
    boolean isActive

    static embedded = ['address']

    static constraints = {
        domain unique:true,blank:false
        address nullable:true, blank:true
        uuid nullable:true
    }

    def beforeInsert() {
        uuid = UUID.randomUUID().toString()
        /**
         * Default free plan
         */
        plan = Plan.findByCode(1)
        isActive = true
    }

    @Override
    Integer tenantId() {
        return id
    }
}
