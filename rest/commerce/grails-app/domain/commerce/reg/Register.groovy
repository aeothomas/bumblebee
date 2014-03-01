package commerce.reg

import commerce.store.Store
import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.Resource

/**
 * The register machine
 */
@Resource()
@MultiTenant
class Register {
    /**
     * Unique Code of the register
     */
    String code

    /**
     * Store which is belonging to
     */
    Store store

    static constraints = {
        code unique: true, blank:false
    }
}
