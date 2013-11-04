package mermaid.products

/**
 *  The option in the modifier
 */
class ModifierOption {

    String name

    double price

    /**
     * This indicates the product will sale with this option as default.
     */
    boolean isBase

    static belongsTo = [modifier:Modifier]

    static constraints = {
    }
}
