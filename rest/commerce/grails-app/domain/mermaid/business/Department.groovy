package mermaid.business

import com.mermaid.inventory.StoreInventory

class Department {

    String name

    long code

    static constraints = {
        code unique:true, blank:false
    }
}
