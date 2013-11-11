package mock

import com.commerce.business.*
import com.commerce.global.Country
import com.commerce.products.Product
import com.commerce.products.ProductPricingType

/**
 * Created with IntelliJ IDEA.
 * User: wshao
 * Date: 11/11/13
 * Time: 14:21
 * To change this template use File | Settings | File Templates.
 */

class TestDataBootStrap {

    def init = { servletContext ->
        /**
         * Department
         */
        Department salesDep = new Department(name:"sales", code:1).save()
        Department opDep = new Department (name:"operation" ,code : 2).save()

        /**
         * Commons
         */
        Country gb = new Country(name:"UK", code:"GPB").save()
        Country us  = new Country(name:"US" ,code:"US").save()

        /**
         * Products
         */
        ProductPricingType backOfficeType = new ProductPricingType(name:"back-office",type:1).save()
        ProductPricingType unitType = new ProductPricingType(name:"by-unit",type:2).save()

     //   Product latte = new Prouct(name:"latte", description:"This is a lattee", pricingType:backOfficeType, );



    }
    def destroy = {

    }
}

