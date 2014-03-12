package commerce.account

import commerce.CommerceRestController
import commerce.acl.WibiAclService
import commerce.emp.Employee
import commerce.emp.User
import grails.plugin.multitenant.core.CurrentTenant
import grails.transaction.Transactional
import org.springframework.context.ApplicationContext
import org.springframework.web.context.support.WebApplicationContextUtils

class MerchantController extends CommerceRestController{

    static namespace = 'v1'

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    MerchantService merchantService

    WibiAclService wibiAclService

    /**
     * Add a new merchant into the system.
     * It also wil create a admin user the user database.
     * @return
     */
    @Override
    @Transactional
    def save(){

        def newMerchant = new Merchant(params)

        if(merchantService.isMerchantExist(newMerchant)){
              render "merchant existing"
        }else{
            if(!newMerchant.save()){
                print(newMerchant.errors)
                render "error on creating merchant"
            }else{

                CurrentTenant currentTenant
                ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
                currentTenant = (CurrentTenant) ctx.getBean("currentTenant")
                currentTenant.set((Integer)newMerchant.getId())

                def newUser = new User()
                newUser.username = params["email"]
                newUser.pass = params["password"]
                newUser.passConfirm = params["password"]

                Employee employee = new Employee()
                employee.email = params["email"]

                wibiAclService.createUser(newUser,employee,null)
                render "new Merchant save"
            }
        }

    }



}
