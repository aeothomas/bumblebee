package commerce

import grails.plugin.multitenant.core.Tenant
import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.*

@Resource()
class Merchant implements Tenant{

    String username

    String password

    String domain

    static constraints = {
    }

    @Override
    Integer tenantId() {
        return null
    }
}
