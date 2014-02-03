
package commerce.emp

import grails.plugin.multitenant.core.annotation.MultiTenant

@MultiTenant
class WibiCloudUser extends grails.plugin.nimble.core.UserBase {

	// Extend UserBase with your custom values here

    static constraints = {
        username unique:'tenantId'
    }

}
