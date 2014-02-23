import commerce.account.Plan

class BootStrap {

    def init = { servletContext ->

        Plan freePlan = new Plan(name:"free plan",code: 1, description: "it's free", price:0).save()


    }
    def destroy = {
    }
}
