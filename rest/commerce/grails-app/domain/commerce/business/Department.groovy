package commerce.business

import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.Resource

@Resource()
@MultiTenant
class Department {

    String name

    long code


    static constraints = {
        code unique:true, blank:false
        name unique:'tenantId'
    }
}
