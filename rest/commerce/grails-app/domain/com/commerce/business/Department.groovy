package com.commerce.business

class Department {

    String name

    long code

    static constraints = {
        code unique:true, blank:false
    }
}
