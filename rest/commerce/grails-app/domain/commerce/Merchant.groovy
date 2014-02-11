package commerce

import commerce.commons.Address
import grails.plugin.multitenant.core.Tenant
import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.*

/**
 * Merchant is a tenant class represents a business unit
 */
@Resource()
class Merchant implements Tenant{

    String name

    String domain

    Address address

    /**
     * This tenant id is used by the multi-tenant plugin, which is Integer defined in the interface.
     */
    Integer tenantId

    /**
     * This unique Id is preserved for the future improvement with MongoDB.
     */
    String uuid

    static embedded = ['address']

    static constraints = {
        tenantId unique:true, blank:false
        domain unique:true,blank:false
    }

    def beforeInsert() {
        uuid = new Date()
    }

    @Override
    Integer tenantId() {
        return tenantId
    }
}
