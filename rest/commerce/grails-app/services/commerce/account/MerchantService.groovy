package commerce.account

import grails.transaction.Transactional

@Transactional
class MerchantService {

    def serviceMethod() {

    }

    /**
     * Check if the merchant is existing already
     * @param merchantInstance
     * @return
     */
    def isMerchantExist(Merchant merchantInstance){

        if(merchantInstance?.name){
            if(Merchant.findByName(merchantInstance.name)){
                return true
            }
        }
        return false
    }


}
