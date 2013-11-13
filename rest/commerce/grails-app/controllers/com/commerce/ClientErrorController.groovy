package com.commerce

import org.springframework.http.HttpStatus

class ClientErrorController {

    def index() {
        modelAndView.addObject("code", "1234")
        model
    }

    def badRequest() {
        modelAndView.addObject("code", HttpStatus.BAD_REQUEST)
        model
    }

    def unauthorised() {
        modelAndView.addObject("code", HttpStatus.UNAUTHORIZED)
        model
    }

    def forbidden() {
        modelAndView.addObject("code", HttpStatus.FORBIDDEN)
        model
    }

    def notFound() {
        modelAndView.addObject("code", HttpStatus.NOT_FOUND)
        model
    }

    def methodNotAllowed() {
        modelAndView.addObject("code", HttpStatus.METHOD_NOT_ALLOWED)
        model
    }
}
