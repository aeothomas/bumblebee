package com.commerce.business

import com.commerce.inventory.StoreInventory

class Department {

    String name

    long code

    static constraints = {
        code unique:true, blank:false
    }
}
