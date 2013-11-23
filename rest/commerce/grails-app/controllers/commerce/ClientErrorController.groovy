package commerce

import org.springframework.http.HttpStatus

class ClientErrorController {

    def index() {
        render(view: "clienterror", model: [code:HttpStatus.NOT_FOUND])
    }

    def badRequest() {
        render(view: "clienterror", model: [code:HttpStatus.BAD_REQUEST])
    }

    def unauthorised() {
        render(view: "clienterror", model: [code:HttpStatus.UNAUTHORIZED])
    }

    def forbidden() {
        render(view: "clienterror", model: [code:HttpStatus.FORBIDDEN])
    }

    def notFound() {
        render(view: "clienterror", model: [code:HttpStatus.NOT_FOUND])
    }

    def methodNotAllowed() {
        render(view: "clienterror", model: [code:HttpStatus.METHOD_NOT_ALLOWED])
    }
}
