package mock

import com.commerce.business.*
import com.commerce.emp.Employee
import com.commerce.global.Country
import com.commerce.inventory.InventoryItem
import com.commerce.inventory.RawGoodItem
import com.commerce.inventory.StoreInventory
import com.commerce.products.AddOn
import com.commerce.products.AddOnOption
import com.commerce.products.AddOnType
import com.commerce.products.Modifier
import com.commerce.products.ModifierOption
import com.commerce.products.Product
import com.commerce.products.ProductCategory
import com.commerce.products.ProductPricingType
import com.commerce.products.ProductUnitType
import com.commerce.reg.Register
import com.commerce.store.Store
import com.commerce.commons.Address
import com.commerce.suppliers.Supplier
import com.commerce.trans.LineItem
import com.commerce.trans.OperationType
import com.commerce.trans.Payment
import com.commerce.trans.PaymentType
import com.commerce.trans.Transaction

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

        Address storeAddress =new Address(houseNumber: "1008", addressLine1: "Portland Street",
                  addressLine2: "Westminster", province: "Greate London",postCode: "EC1",country: gb)

        Store portlandBranch = new Store(name:"Store 1", code:"store-1", address: storeAddress).save()

        /**
         * Store Inventory
         */

        StoreInventory latteStoreInventory = new StoreInventory(store: portlandBranch,item: latteInventory, quantity: "" ).save()

        /**
         *   Suppliers
         */

        Address supplierAddress =new Address(houseNumber: "50", addressLine1: "Oxford Street",
                addressLine2: "Green Park London", province: "Great London",postCode: "EC1",country: gb)

        Supplier starbucks = new Supplier(name: 'starbucks' , code: "ABCDE" , address: supplierAddress).save()


        /**
         * Raw Good
         */

        RawGoodItem coffeeBean = new RawGoodItem(name:"coffee bean",cost:0.5,quantity: 50).save()

        /**
         * Supplier RawGood Association
         */
        coffeeBean.addToRawGoodSupplier(starbucks)

        coffeeBean.save()

        /**
         * Modifier
         */


        Modifier coffeeSize = new Modifier(name:"coffee size")

        ModifierOption tall = new ModifierOption(name:"tall", price: 0, isBase: true)

        ModifierOption grande = new ModifierOption(name:"grande", price:0.5)

        ModifierOption venti = new ModifierOption(name:"venti", price:1)

        coffeeSize.addToModifierOption(tall)
        coffeeSize.addToModifierOption(grande)
        coffeeSize.addToModifierOption(venti)

        coffeeSize.save()

        /**
         * Add-on
         */

        AddOnType plusGroup = new AddOnType(name:"plus group" , type:1).save()
        AddOnType minusGroup = new AddOnType(name:"minus group", type:2 ).save()

        AddOn coffeePlusGroup =  new AddOn(name:"coffee plus group",type: plusGroup )

        AddOnOption decaffeinated = new AddOnOption(name:"decaff", price:0)
        AddOnOption skinny = new AddOnOption(name:"skinny", price:0)
        AddOnOption extraHot = new AddOnOption(name:"extra hot", price:0)


        coffeePlusGroup.addToOptions(decaffeinated)
        coffeePlusGroup.addToOptions(skinny)
        coffeePlusGroup.addToOptions(extraHot)
        coffeePlusGroup.save()

        /**
         * Associate Products with Add-ons & Modifiers
         */
        latte.addToAddon(coffeePlusGroup)
        latte.addToModifiers(coffeeSize)
        latte.save()

        /**
         *  Register
         */
        Register register = new Register(code: "reg-1", store: portlandBranch).save()

        /**
         * Employee
         */
        Employee employee = new Employee(firstName: "john")

        /**
         * Transactions
         */

        OperationType purchaseOperation = new OperationType( name:"purchase", type:1)
        OperationType refundOperation = new OperationType(name:"refund", type:2)

        PaymentType cardPaymentType = new PaymentType(name: "card payment", type:1)
        PaymentType cashPaymentType = new PaymentType(name:"cash payment", type:2)
        PaymentType hyperPaymentType = new PaymentType(name: "hype payment", type:3)




        Payment multiPayment = new Payment(amount: 0 , paymentType: hyperPaymentType)

        LineItem latteLineItem = new LineItem(inventoryItem: latteInventory, quantity: 2, total: 5.98)

        Transaction transaction = new Transaction(transNum: "trans-1", orderNum: "order-1", date: new Date(),
                                     store: portlandBranch,cashier: employee,
                                     register: register, amount: 5.98, tax: 1,  payment: multiPayment, operationType: purchaseOperation
                                    )

        transaction.addToLineItem(latteLineItem)

//        Payment cardPayment = new Payment(amount: 2, paymentType: cardPaymentType)
//        Payment cashPayment = new Payment(amount: 3.98, paymentType: cashPaymentType)
//

        transaction.save()

        println "**************"
        println transaction.errors





    }
    def destroy = {

    }
}

