package commerce.business

import grails.rest.Resource

@Resource()
class Department {

    String name

    long code

    static constraints = {
        code unique:true, blank:false
    }
}
