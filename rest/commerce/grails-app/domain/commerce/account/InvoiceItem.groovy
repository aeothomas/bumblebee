package commerce.account

import grails.plugin.multitenant.core.annotation.MultiTenant

@MultiTenant
class InvoiceItem {


    String name

    String description

    String unitPrice

    int quality = 0


    static constraints = {
    }
}
