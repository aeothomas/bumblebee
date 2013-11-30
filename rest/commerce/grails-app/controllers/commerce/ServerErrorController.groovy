package commerce

import org.springframework.http.HttpStatus

class ServerErrorController {

    def index() {
        [exception:"Exception", code:response.getStatus(), message: "exception code"]
    }

    def handleNullPointer(NullPointerException npe) {
        [exception:npe.metaClass, code:response.getStatus(), message: npe.message]
    }

    def handleIllegalArgument(IllegalArgumentException iae) {
        [exception:iae.metaClass, code:response.getStatus(), message: iae.message]
    }

}
