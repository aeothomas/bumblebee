package mock

import commerce.account.Merchant
import commerce.account.Plan
import commerce.business.*
import commerce.emp.Employee
import commerce.global.Country
import commerce.inventory.InventoryItem
import commerce.inventory.RawGoodItem
import commerce.inventory.StoreInventory
import commerce.products.AddOn
import commerce.products.AddOnOption
import commerce.products.AddOnType
import commerce.products.Modifier
import commerce.products.ModifierOption
import commerce.products.Product
import commerce.products.ProductCategory
import commerce.products.ProductPricingType
import commerce.products.ProductUnitType
import commerce.reg.Register
import commerce.store.Store
import commerce.commons.Address
import commerce.suppliers.Supplier
import commerce.trans.LineItem
import commerce.trans.OperationType
import commerce.trans.Payment
import commerce.trans.PaymentType
import commerce.trans.Transaction
import grails.plugin.multitenant.core.CurrentTenant
import org.springframework.context.ApplicationContext
import org.springframework.web.context.support.WebApplicationContextUtils

/**
 * This bootstrap is to populate the sample data.
 * User: wshao
 * Date: 11/11/13
 * Time: 14:21
 * To change this template use File | Settings | File Templates.
 */

class TestDataBootStrap {

    def init = { servletContext ->

        // Define current Tenant
        CurrentTenant currentTenant
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        currentTenant = (CurrentTenant) ctx.getBean("currentTenant")

        /**
         * Configure a plan
         */

        Plan freePlan = new Plan(name:"free tier", code: 1, description:"Free Tier", price:0).save()

        /**
         * Register a merchant
         */
        Merchant powersquare = new Merchant(name:"PowerSquare", domain:"powersquare", tenantId:3, plan:freePlan).save()

        /**
         * Resolve a tenant
         */
        currentTenant.set(3)

        /**
         * Business
         */
        Department defualtDepartment = new Department(name:"default",code: 0).save()
        Department salesDep = new Department(name:"sales", code:1).save()
        Department opDep = new Department (name:"operation" ,code : 2).save()

        /**
         * Pre-define data
         */
        //Country
        Country gb = new Country(name:"UK", code:"GPB").save()
        Country us  = new Country(name:"US" ,code:"US").save()

        ProductPricingType backOfficeType = new ProductPricingType(name:"back-office",type:1).save()
        ProductPricingType unitType = new ProductPricingType(name:"by-unit",type:2).save()
        ProductPricingType inStoreTypes = new ProductPricingType(name:"in-store",type:3).save()

        ProductUnitType kilo = new ProductUnitType(name:"KG", type:1).save();

        /**
         * Products
         */
        ProductCategory defaultProductCat = new ProductCategory(name:"default").save()
        ProductCategory coffeeCat = new ProductCategory(name:"coffee").save()
        ProductCategory foodCat = new ProductCategory(name:"bakery").save()

        /**
         * Latte
         */
        Product latte = new Product(name:"latte", description:"This is a latte", pricingType:backOfficeType, department: salesDep,
                category: coffeeCat, cost:1.50)

        /**
         * Add-on for latte
         */
        AddOnType plusAddOnType = new AddOnType(name:"plus",type: 1).save()
        AddOnType minusAddOnType = new AddOnType(name:"minus",type:2).save()

        AddOn latteMilkOption = new AddOn(name:"Milk Options", type: plusAddOnType)
        AddOnOption latteRegular = new AddOnOption(name:"regular", price: 0)
        AddOnOption latteSkim = new AddOnOption(name:"skim", price: 0)
        AddOnOption soy = new AddOnOption(name:"soy", price: 0.5)
        latteMilkOption.addToOptions(latteRegular)
        latteMilkOption.addToOptions(latteSkim)
        latteMilkOption.addToOptions(soy)

        AddOn latteExtraOption = new AddOn(name:"latte extra Options", type: plusAddOnType)
        AddOnOption latteExtraRegular = new AddOnOption(name:"regular shot", price: 0)
        AddOnOption extraShot = new AddOnOption(name:"extraShot", price: 0.5)
        latteExtraOption.addToOptions(latteExtraRegular)
        latteExtraOption.addToOptions(extraShot)

        latte.addToAddon(latteMilkOption)
        latte.addToAddon(latteExtraOption)

        latte.save()

        /**
         * Burger
         */

        Product burger = new Product(name:"burger",description:"burger", pricingType:backOfficeType,department: salesDep,
                category: foodCat,cost:1.8)


        AddOn burgerNoOption = new AddOn(name:"Burger No Option", type: minusAddOnType)
        AddOnOption tomato = new AddOnOption(name:"tomato", price: 0)
        AddOnOption cheese = new AddOnOption(name:"cheese", price: 0)
        AddOnOption bacon = new AddOnOption(name:"bacon", sprice: 0.5)
        burgerNoOption.addToOptions(tomato)
        burgerNoOption.addToOptions(cheese)
        burgerNoOption.addToOptions(bacon)

        burger.addToAddon(burgerNoOption)

        burger.save()

        /**
         * Chocolate cake for unit measurement
         */

        Product chocolateCake = new Product(name:"chocolate cake", description: "cake", pricingType:unitType,department: salesDep,
                category: foodCat, cost:0.5)
        chocolateCake.addToProductUnitType(kilo)
        chocolateCake.save()

        Product packaging = new Product(name:"package", description: "packaging fee", pricingType: inStoreTypes,department: salesDep,
                category: foodCat).save()

        //        println "**************"
//        println transaction.errors

        /**
         * Inventory
         */
//        InventoryItem latteInventory  = new InventoryItem(product:latte, sku:"1", isTracked: true, price:2.99).save()
//
//        InventoryItem cappuccinoInventory = new InventoryItem(product: cappuccino,sku:"2",isTracked: false, price:2.55).save()
//        InventoryItem cakeInventory = new InventoryItem(product: chocolateCake,sku: "3", isTracked:true, price:1).save()
//        InventoryItem packagingInventory = new InventoryItem(product: packaging, sku:"3",isTracked: false).save()

        /**
         * Store
         */








//
//        Address storeAddress =new Address(houseNumber: "1008", addressLine1: "Portland Street",
//                  addressLine2: "Westminster", province: "Greate London",postCode: "EC1",country: gb)
//
//        Store portlandBranch = new Store(name:"Store 1", code:"store-1", address: storeAddress).save()
//
//        /**
//         * Store Inventory
//         */
//
//        StoreInventory latteStoreInventory = new StoreInventory(store: portlandBranch,item: latteInventory, quantity: "" ).save()
//
//        /**
//         *   Suppliers
//         */
//
//        Address supplierAddress =new Address(houseNumber: "50", addressLine1: "Oxford Street",
//                addressLine2: "Green Park London", province: "Great London",postCode: "EC1",country: gb)
//
//        Supplier starbucks = new Supplier(name: 'starbucks' , code: "ABCDE" , address: supplierAddress).save()
//
//
//        /**
//         * Raw Good
//         */
//
//        RawGoodItem coffeeBean = new RawGoodItem(name:"coffee bean",cost:0.5,quantity: 50).save()
//
//        /**
//         * Supplier RawGood Association
//         */
//        coffeeBean.addToRawGoodSupplier(starbucks)
//
//        coffeeBean.save()
//
//        /**
//         * Modifier
//         */
//
//
//        Modifier coffeeSize = new Modifier(name:"coffee size")
//
//        ModifierOption tall = new ModifierOption(name:"tall", price: 0, isBase: true)
//
//        ModifierOption grande = new ModifierOption(name:"grande", price:0.5)
//
//        ModifierOption venti = new ModifierOption(name:"venti", price:1)
//
//        coffeeSize.addToModifierOption(tall)
//        coffeeSize.addToModifierOption(grande)
//        coffeeSize.addToModifierOption(venti)
//
//        coffeeSize.save()
//
//        /**
//         * Add-on
//         */
//
//        AddOnType plusGroup = new AddOnType(name:"plus group" , type:1).save()
//        AddOnType minusGroup = new AddOnType(name:"minus group", type:2 ).save()
//
//        AddOn coffeePlusGroup =  new AddOn(name:"coffee plus group",type: plusGroup )
//
//        AddOnOption decaffeinated = new AddOnOption(name:"decaff", price:0)
//        AddOnOption skinny = new AddOnOption(name:"skinny", price:0)
//        AddOnOption extraHot = new AddOnOption(name:"extra hot", price:0)
//
//
//        coffeePlusGroup.addToOptions(decaffeinated)
//        coffeePlusGroup.addToOptions(skinny)
//        coffeePlusGroup.addToOptions(extraHot)
//        coffeePlusGroup.save()
//
//        /**
//         * Associate Products with Add-ons & Modifiers
//         */
//        latte.addToAddon(coffeePlusGroup)
//        latte.addToModifiers(coffeeSize)
//        latte.save()
//
//        /**
//         *  Register
//         */
//        Register register = new Register(code: "reg-1", store: portlandBranch).save()
//
//        /**
//         * Employee
//         */
//        Employee employee = new Employee(firstName: "john",code: "EM_001",lastName: "Doe",
//                       phoneNumber: "12345",address:storeAddress, store: portlandBranch).save()
//
//        /**
//         * Transactions
//         */
//
//        OperationType purchaseOperation = new OperationType( name:"purchase", type:1).save()
//        OperationType refundOperation = new OperationType(name:"refund", type:2).save()
//
//        PaymentType cardPaymentType = new PaymentType(name: "card payment", type:1).save()
//        PaymentType cashPaymentType = new PaymentType(name:"cash payment", type:2).save()
//
//    //    PaymentType hyperPaymentType = new PaymentType(name: "hype payment", type:3).save()
//
//
//
//
//        Payment payment1 = new Payment( paymentNumber: "1",  amount: 4 , paymentType: cardPaymentType)
//        Payment payment2 = new Payment( paymentNumber: "2",  amount: 1.98 , paymentType: cashPaymentType)
//
//        LineItem latteLineItem = new LineItem(inventoryItem: latteInventory, quantity: 2, total: 5.98)
//
//        Transaction transaction = new Transaction(receiptNum: "receipt-1", transNum: "trans-1", orderNum: "order-1", date: new Date(),
//                                     store: portlandBranch,cashier: employee,
//                                     register: register, amount: 5.98, tax: 1,   operationType: purchaseOperation,
//                                     payment:payment1
//                                    )
////
//        transaction.addToLineItem(latteLineItem)
//
////        Payment cardPayment = new Payment(amount: 2, paymentType: cardPaymentType)
////        Payment cashPayment = new Payment(amount: 3.98, paymentType: cashPaymentType)
////
//
//        transaction.save()
////
//        println "**************"
//        println transaction.errors





    }
    def destroy = {

    }
}

