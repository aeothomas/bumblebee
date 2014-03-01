package commerce.emp

import grails.plugin.multitenant.core.annotation.MultiTenant

@MultiTenant
class User extends grails.plugin.nimble.core.UserBase {

	// Extend UserBase with your custom values here
    byte[] passwordSalt

}
