/**
 * Created by @author: aeothomas on 26/12/2013.
 */
import security.SecurityUtils

class SecurityFilters {
    def grailsApplication

    def filters = {
        /*
        loginCheck(controller: '*', action: '*') {
            before = {
                if (!session.user && !actionName.equals('login')) {
                    redirect(action: 'login')
                    return false
                }
            }
        }*/

        restAuth(uri: '/merchants*') {
            before = {
                //extract basic auth information so that it can be used for authentication in secure filter
                if (!session.user && !actionName.equals('login')) {
                    //redirect(action: 'login')
                    //return false
                }
            }
        }

        basicAuth(uri: '/merchants*') { //(controller: 'prospect', action: '*') {
            before = {
                if (!SecurityUtils.validateBasicAuth(request, response, log, grailsApplication)) {
                    // TODO: delegate to JSON Marshaller to render response
                    return false
                }
            }
        }

        //secure(controller:"product", action:"edit") {
        secure(uri: '/merchants*') {
            before = {
                accessControl {
                    true
                }
            }
        }
    }

}