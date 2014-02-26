// Place your Spring DSL code here
import org.apache.shiro.authc.credential.HashedCredentialsMatcher

beans = {

    credentialMatcher(HashedCredentialsMatcher) {
        storedCredentialsHexEncoded = false
        hashAlgorithmName = "SHA-512"
        hashSalted=true
        hashIterations=1024
    }

}
