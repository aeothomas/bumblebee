package security

import org.apache.http.HttpHeaders
import org.springframework.http.HttpStatus

/**
 * Created by @author: aeothomas on 27/12/2013.
 */
class SecurityUtils {

    /**
     * This method validates a request based on Basic Authentication and returns false if the login attempt
     * fails, and true if the login attempt is successful.
     *
     * When the "Authorization" header is not present in the header of the request then return 401 and
     * add the header WWW-Authenticate: Basic realm="Secure Area".
     *
     * When the "Authorization" header is present, but there is a bad login / password then return 403.
     */
    static validateBasicAuth(def request, def response, def log, def grailsApplication){

        try {
            def authString = request.getHeader(HttpHeaders.AUTHORIZATION)
            if (!authString) {
                response.status = HttpStatus.UNAUTHORIZED
                response.addHeader(HttpHeaders.WWW_AUTHENTICATE, "Basic realm=\"Secure Area\"")
                log.warn("unauthorised access attempt")
                return false
            }
            def encodedPair = authString - 'Basic '
            def decodedPair = new String(new sun.misc.BASE64Decoder().decodeBuffer(encodedPair));
            def credentials = decodedPair.split(':')
            def login = grailsApplication.config.admin.security.login
            def password = grailsApplication.config.admin.security.password

            if (login.equals(credentials[0]) && password.equals(credentials[1])) {
                log.warn("authorised access attempt")
                return true
            } else {
                log.warn("unauthorised access attempt due to bad credentials")
                response.status = HttpStatus.FORBIDDEN
                return false
            }
        } catch (Exception e) {
            log.warn("exception thrown when trying to authorise user access", e)
            response.status = HttpStatus.FORBIDDEN
            return false
        }
    }

}
