package commerce

import commerce.commons.Address
import grails.plugin.multitenant.core.Tenant
import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.*

@Resource()
class Merchant implements Tenant{

    String name

    String domain

    Address address

    String tenantId

    static constraints = {
        tenantId unique:true, blank:false
        domain unique:true,blank:false
    }

    @Override
    Integer tenantId() {
        return tenantId
    }
}
