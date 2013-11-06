class UrlMappings {

	static mappings = {
		
		"/merchants"(resources:'merchant', excludes:['create', 'edit']) {

			"/products"(resources:"product", excludes:['create', 'edit']) {

				"/modifiers"(resources:"modifier", excludes:['create', 'edit'])

				"/add-ons"(resources:"add-on", excludes:['create', 'edit'])
			}

			"/employees"(resources:"employee", excludes:['create', 'edit'])

			"/payment-types"(resources:"payment-type", excludes:['create', 'edit'])

			"/departments"(resources:"department", excludes:['create', 'edit'])

			"/suppliers"(resources:"supplier", excludes:['create', 'edit'])

			"/raw-goods"(resources:"raw-good", excludes:['create', 'edit'])

			"/stores"(resources:"store", excludes:['create', 'edit']) {

				"/inventory"(resources:"inventory", excludes:['create', 'edit'])

				"/registers"(resources:"register", excludes:['create', 'edit']) {

					"/transactions"(resources:"transaction", excludes:['create', 'edit']) {

						"/payments"(resources:"payment", excludes:['create', 'edit'])

						"/line-items"(resources:"line-item", excludes:['create', 'edit'])
					}
				}

				"/transactions"(resources:"transaction", excludes:['create', 'edit'])
			}

			"/transactions"(resources:"transactions", excludes:['create', 'edit'])
		}

		"/"(view:"/index") // TODO: remove default grails page for real app
		
		// handle http code responses
		"400"(controller: "httpresponse",view: "/httpresponse/badrequest")
		"401"(controller: "httpresponse",view: "/httpresponse/unauthorized")
		"403"(controller: "httpresponse",view: "/httpresponse/forbidden")
		"404"(controller: "httpresponse",view: "/httpresponse/notfound")
		"405"(controller: "httpresponse",view: "/httpresponse/methodnotallowed")
		"500"(controller: "httpresponse",action: "illegalArgument", exception: IllegalArgumentException)
		"500"(controller: "httpresponse",action: "nullPointer", exception: NullPointerException)
		//"500"(controller: "httpresponse",action: "xssexception", exception: XSSException)
		"500"(controller: "httpresponse",view: "/httpresponse/servererror")
		"503"(controller: "httpresponse",view: "/httpresponse/internalservererror")
		
		
		/*"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}*/
	}
}
