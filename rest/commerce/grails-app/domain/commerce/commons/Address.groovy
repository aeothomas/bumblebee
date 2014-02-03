package commerce.commons

import commerce.global.Country
import grails.plugin.multitenant.core.annotation.MultiTenant

/**
 * The address
 */
class Address {

	String houseNumber

	String addressLine1

	String addressLine2

	String province

    Country country

    String postCode

    static constraints = {
         addressLine2 nullable: true
         province nullable: true
    }
}
