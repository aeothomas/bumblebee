package mock

import com.commerce.business.*
import com.commerce.global.Country
import com.commerce.inventory.InventoryItem
import com.commerce.products.Product
import com.commerce.products.ProductCategory
import com.commerce.products.ProductPricingType
import com.commerce.products.ProductUnitType
import com.commerce.store.Store
import com.commerce.commons.Address

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

        ProductUnitType kilo = new ProductUnitType(name:"KG", type:1).save();


        ProductCategory coffeeCat = new ProductCategory(name:"coffee").save()


        Product latte = new Product(name:"latte", description:"This is a latte", pricingType:backOfficeType, department: salesDep,
                                    category: coffeeCat, cost:1.50).save()

        /**
         * Inventory
         */
        InventoryItem latteInventory  = new InventoryItem(product:latte, sku:"123456", isTracked: true, price:2.99).save()



        /**
         * Store
         */
        Store store = new Store(name:"Store 1", code:"ABC", address: new Address(houseNumber: "1008", addressLine1: "Portland Street",
                addressLine2: "Westminster", province: "aa",country: gb)).save()



















    }
    def destroy = {

    }
}

