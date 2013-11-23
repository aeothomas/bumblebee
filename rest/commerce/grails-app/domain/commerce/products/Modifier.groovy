package commerce.products

/**
 *
 * The modifier normally is used to put attributes to a same product. for example: size
 *
 * One product can have more than one modifier group
 *
 * @author wshao
 *
 */
class Modifier {	
	/**
	 * Modifier Name
	 */
	String name

    static hasMany = [modifierOption: ModifierOption]
	
    static constraints = {
    }
}
