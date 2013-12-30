package commons

import security.SecurityUtils

/**
 * Created by @author: aeothomas on 29/12/2013.
 */
import org.codehaus.groovy.grails.web.servlet.HttpHeaders

class RestApiUtils {

    private static final String ACCEPTED_VERSION_TOKEN = 'Accept-Version'
    private static final String UTF_8 = 'UTF-8'

    /*
    * Extracts the accepts version header and lowercases the value if it exists.
    * */
    def static String getAcceptVersionHeader(def request, def log) {
        def avh = request?.getHeader(ACCEPTED_VERSION_TOKEN)?.trim()?.toLowerCase() ?: ""
        log?.debug(ACCEPTED_VERSION_TOKEN + ": " + avh)
        return avh
    }


    def static String getAcceptHeader(def request, def log) {
        def ah = request?.getHeader(HttpHeaders.ACCEPT)?.trim()?.toLowerCase() ?: ""
        log?.debug(HttpHeaders.ACCEPT + ": " + ah)
        return ah
    }

    def static String getContentType(def request, def log) {
        def ah = getAcceptHeader(request, log)
        boolean renderXml = ah?.contains("xml")
        boolean renderJson = ah?.contains("json") || !renderXml
        return renderJson ? "application/json" : "application/xml"
    }

    def static setHeaders(def request, def response, def log, def grailsApplication) {
        response.addHeader(HttpHeaders.CONTENT_TYPE, RestApiUtils.getContentType(request, log))
        response.addHeader(HttpHeaders.CONTENT_ENCODING, UTF_8)
    }

}
