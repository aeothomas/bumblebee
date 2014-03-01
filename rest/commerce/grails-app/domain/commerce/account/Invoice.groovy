package commerce.account

import commerce.commons.Address
import grails.plugin.multitenant.core.annotation.MultiTenant

/**
 *
 */
@MultiTenant
class Invoice {

    String invoiceNumber

    Date dateIssue

    Date dueDate

    String description

    double totalDue

    double totalPaid

    Address billingAddress

    boolean isPaid

    String contactName

    String contactCompay

    String contactEmail

    static embedded = ['billingAddress']


    static hasMany = [invoiceItem : InvoiceItem]


    static constraints = {
    }
}
