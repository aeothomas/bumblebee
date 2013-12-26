/**
 * Created by @author: aeothomas on 26/12/2013.
 */
class SecurityFilters {

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

        secure(controller:"product", action:"edit") {
            before = {
                accessControl {
                    true
                }
            }
        }
    }

}