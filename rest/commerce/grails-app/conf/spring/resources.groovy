// Place your Spring DSL code here
import org.apache.shiro.authc.credential.Sha512CredentialsMatcher
import commerce.tenancy.DomainResolver

beans = {

    credentialMatcher(Sha512CredentialsMatcher) {
        storedCredentialsHexEncoded = false
        hashSalted=true
        hashIterations=1024
    }


    tenantResolver(DomainResolver)
}
