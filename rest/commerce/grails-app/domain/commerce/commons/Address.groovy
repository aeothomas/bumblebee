package commerce.commons

import commerce.global.Country

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
