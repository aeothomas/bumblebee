package commerce.user

import grails.transaction.Transactional
import org.apache.shiro.crypto.hash.Sha512Hash
import org.apache.shiro.crypto.RandomNumberGenerator
import org.apache.shiro.crypto.SecureRandomNumberGenerator

@Transactional
class UserManagementService {

    def generatePasswordSalt() {

        return new SecureRandomNumberGenerator().nextBytes().getBytes()

    }

    def generatePasswordHash(String password, passwordSalt) {

        return new Sha512Hash(password, passwordSalt, 1024).toBase64()

    }
}
