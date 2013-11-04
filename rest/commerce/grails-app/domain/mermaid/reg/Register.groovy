package mermaid.reg

import com.mermaid.store.Store

/**
 * The register machine
 */
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
