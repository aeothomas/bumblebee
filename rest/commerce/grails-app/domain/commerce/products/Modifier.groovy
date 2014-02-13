package commerce.products

import grails.plugin.multitenant.core.annotation.MultiTenant
import grails.rest.Resource

/**
 *
 * The modifier normally is used to put attributes to a same product. for example: size
 *
 * One product can have more than one modifier group
 *
 * @author wshao
 *
 */
@Resource()
@MultiTenant
class Modifier {	
	/**
	 * Modifier Name
	 */
	String name

    static hasMany = [modifierOption: ModifierOption]
	
    static constraints = {
        name unique:'tenantId'
    }
}
