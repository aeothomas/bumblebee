package commerce

/**
 * Created by @author: aeothomas on 15/01/2014.
 */

class WibiBootStrap {

    def wibiAclService

    def init = { servletContext ->

        wibiAclService.init()

    }

    def destroy = {
    }
}