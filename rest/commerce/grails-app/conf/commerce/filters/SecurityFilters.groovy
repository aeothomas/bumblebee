package commerce.filters

/**
 * Created by @author: aeothomas on 26/12/2013.
 */

import commons.RestApiUtils
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

        /*
        restAuth(uri: '/merchants*') {
            before = {
                //extract basic auth information so that it can be used for authentication in secure filter
                if (!session.user && !actionName.equals('login')) {
                    //redirect(action: 'login')
                    //return false
                }
            }
        }*/

        /*
        basicAuth(uri: '/**', controllerExclude: 'error') {
            before = {
                log.debug(request)
                if (SecurityUtils.isValidBasicAuth(request, response, log, grailsApplication)) {
                    // TODO: delegate to JSON Marshaller to render response

                    RestApiUtils.setHeaders(request, response, log, grailsApplication)
                    return true
                }
            }
        }*/

        // restrict all access
        secure(uri: '/merchant') {
            before = {
                accessControl {
                    return true
                }
            }
        }

        // TODO: restrict role-based resources/ controllers
        /*
        secure(controller: 'xxxx') {
            before = {
                accessControl {
                    return role("product-admin") || permission("book:delete")
                }
            }
        }
        */

        // TODO: restrict role-based and permission resources/ controllers
        /*
        secure(controller: 'xxxxx') {
            before = {
                accessControl {
                    return role("product-admin") || permission("book:delete")
                }
            }
        }
        */


        // TODO: restrict admin-only resources/ controllers
        /*
        secure(controller: 'xxxxx') {
            before = {
                accessControl {
                    return role("product-admin") || permission("book:delete")
                }
            }
        }
        */




        /*
        addHResponseHeaders(uri: '/**') {

            after = {
                log.error("here after")
                //RestApiUtils.setHeaders(request, response, log, grailsApplication)
            }
        }
        */
    }

}