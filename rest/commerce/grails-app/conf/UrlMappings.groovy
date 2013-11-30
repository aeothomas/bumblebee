class UrlMappings {

	static mappings = {
		
		/*
		    Initial routing for commerce REST v1.0

		    Nested resource mappings are used to generate child resources.
		    Therefore, one needs to explicitly map parent resources to have their resources generated.
		    Without this a 404 is returned.

		    @author: aeothomas, 2013
		*/

        // map to merchants and it's children
        "/merchants"(version:'1.0', resources:'merchant', excludes:['create', 'edit'], namespace:'v1')
		"/merchants"(version:'1.0', resources:'merchant', excludes:['create', 'edit'], namespace:'v1') {

            // map to products and it's children
            "/products"(version:'1.0', resources:"product", excludes:['create', 'edit'], namespace:'v1')
			"/products"(version:'1.0', resources:"product", excludes:['create', 'edit'], namespace:'v1') {

				"/modifiers"(version:'1.0', resources:"modifier", excludes:['create', 'edit'], namespace:'v1')

				"/add-ons"(version:'1.0', resources:"addOn", excludes:['create', 'edit'], namespace:'v1')
			}

			"/employees"(version:'1.0', resources:"employee", excludes:['create', 'edit'], namespace:'v1')

			"/payment-types"(version:'1.0', resources:"paymentType", excludes:['create', 'edit'], namespace:'v1')

			"/departments"(version:'1.0', resources:"department", excludes:['create', 'edit'], namespace:'v1')

			"/suppliers"(version:'1.0', resources:"supplier", excludes:['create', 'edit'], namespace:'v1')

			"/raw-goods"(version:'1.0', resources:"rawGoodItem", excludes:['create', 'edit'], namespace:'v1')

            // map to stores and it's children
            "/stores"(version:'1.0', resources:"store", excludes:['create', 'edit'], namespace:'v1')
			"/stores"(version:'1.0', resources:"store", excludes:['create', 'edit'], namespace:'v1') {

				"/inventory"(version:'1.0', resources:"inventoryItem", excludes:['create', 'edit'], namespace:'v1')

				// map to registers and it's children
                "/registers"(version:'1.0', resources:"register", excludes:['create', 'edit'], namespace:'v1')
                "/registers"(version:'1.0', resources:"register", excludes:['create', 'edit'], namespace:'v1') {

                    // map to register transactions and it's children
                    "/transactions"(version:'1.0', resources:"transaction", excludes:['create', 'edit'], namespace:'v1')
					"/transactions"(version:'1.0', resources:"transaction", excludes:['create', 'edit'], namespace:'v1') {

						"/payments"(version:'1.0', resources:"payment", excludes:['create', 'edit'], namespace:'v1')

						"/line-items"(version:'1.0', resources:"lineItem", excludes:['create', 'edit'], namespace:'v1')
					}
				}

				"/transactions"(version:'1.0', resources:"transaction", excludes:['create', 'edit'], namespace:'v1')
			}

			"/transactions"(version:'1.0', resources:"transaction", excludes:['create', 'edit'], namespace:'v1')
		}

		"/"(view:"/index") // TODO: remove default grails page for real app

		// handle http code responses
		"400"(controller: "clientError", action: "badRequest", view: "/clientError/clienterror")
		"401"(controller: "clientError", action: "unauthorised", view: "/clientError/clienterror")
		"403"(controller: "clientError", action: "forbidden", view: "/clientError/clienterror")
		"404"(controller: "clientError", action: "notFound", view: "/clientError/clienterror")
		"405"(controller: "clientError", action: "methodNotAllowed", view: "/clientError/clienterror")

		//"500"(controller: "serverError", action: "illegalArgument", view: "/serverError/servererror", exception: IllegalArgumentException)
		//"500"(controller: "serverError", action: "nullPointer", view: "/serverError/servererror", exception: NullPointerException)
		//"500"(controller: "serverError", action: "xssException", view: "/serverError/servererror", exception: XSSException)
		"500"(controller: "serverError")
		"503"(controller: "serverError")
		
		/*
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		} */
		
		// TODO: version 2.0 for the future....
	}
}
