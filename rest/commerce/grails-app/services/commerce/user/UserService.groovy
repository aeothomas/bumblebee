package commerce.user

import grails.transaction.Transactional

@Transactional
class UserService {


    //def passwordSalt = new SecureRandomNumberGenerator().nextBytes().getBytes()
    //def admin = new User(username:"Admin",passwordHash: new Sha512Hash("password",passwordSalt,1024).toBase64(),passwordSalt:passwordSalt)

    def serviceMethod() {

    }
}
