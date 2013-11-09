class UrlMappings {

	static mappings = {
		
		// initial routing for commerce REST v1.0
		"/merchants"(version:'1.0', resources:'merchant', excludes:['create', 'edit'], namespace:'v1') {

			"/products"(version:'1.0', resources:"product", excludes:['create', 'edit'], namespace:'v1') {

				"/modifiers"(version:'1.0', resources:"modifier", excludes:['create', 'edit'], namespace:'v1')

				"/add-ons"(version:'1.0', resources:"add-on", excludes:['create', 'edit'], namespace:'v1')
			}

			"/employees"(version:'1.0', resources:"employee", excludes:['create', 'edit'], namespace:'v1')

			"/payment-types"(version:'1.0', resources:"payment-type", excludes:['create', 'edit'], namespace:'v1')

			"/departments"(version:'1.0', resources:"department", excludes:['create', 'edit'], namespace:'v1')

			"/suppliers"(version:'1.0', resources:"supplier", excludes:['create', 'edit'], namespace:'v1')

			"/raw-goods"(version:'1.0', resources:"raw-good", excludes:['create', 'edit'], namespace:'v1')

			"/stores"(version:'1.0', resources:"store", excludes:['create', 'edit'], namespace:'v1') {

				"/inventory"(version:'1.0', resources:"inventory", excludes:['create', 'edit'], namespace:'v1')

				"/registers"(version:'1.0', resources:"register", excludes:['create', 'edit'], namespace:'v1') {

					"/transactions"(version:'1.0', resources:"transaction", excludes:['create', 'edit'], namespace:'v1') {

						"/payments"(version:'1.0', resources:"payment", excludes:['create', 'edit'], namespace:'v1')

						"/line-items"(version:'1.0', resources:"line-item", excludes:['create', 'edit'], namespace:'v1')
					}
				}

				"/transactions"(version:'1.0', resources:"transaction", excludes:['create', 'edit'], namespace:'v1')
			}

			"/transactions"(version:'1.0', resources:"transactions", excludes:['create', 'edit'], namespace:'v1')
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
		
		
		
		// version 2.0 for the future....
	}
}
