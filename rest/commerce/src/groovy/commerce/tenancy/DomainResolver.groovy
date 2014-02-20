package commerce.tenancy

import commerce.Merchant
import grails.plugin.multitenant.core.resolve.TenantResolver
import org.apache.commons.logging.LogFactory
import sun.util.logging.resources.logging

import javax.servlet.http.HttpServletRequest

/**
 * Created by wshao on 2/2/14.
 */
class DomainResolver  implements TenantResolver {
    private static final log = LogFactory.getLog(this)

    @Override
    public Integer resolve(HttpServletRequest request) {

        String domain = request.getServerName()

        if(domain!=null){
            Merchant merchant =  Merchant.findByDomain(domain)
            return merchant?.id;
        }

        log.warn("Cannot resolve the request to any tenant reutrn null")

        return null
    }

}
