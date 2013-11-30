
<%@ page import="commerce.inventory.RawGoodItem" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'rawGoodItem.label', default: 'RawGoodItem')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-rawGoodItem" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-rawGoodItem" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list rawGoodItem">
			
				<g:if test="${rawGoodItemInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="rawGoodItem.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${rawGoodItemInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${rawGoodItemInstance?.cost}">
				<li class="fieldcontain">
					<span id="cost-label" class="property-label"><g:message code="rawGoodItem.cost.label" default="Cost" /></span>
					
						<span class="property-value" aria-labelledby="cost-label"><g:fieldValue bean="${rawGoodItemInstance}" field="cost"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${rawGoodItemInstance?.quantity}">
				<li class="fieldcontain">
					<span id="quantity-label" class="property-label"><g:message code="rawGoodItem.quantity.label" default="Quantity" /></span>
					
						<span class="property-value" aria-labelledby="quantity-label"><g:fieldValue bean="${rawGoodItemInstance}" field="quantity"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${rawGoodItemInstance?.product}">
				<li class="fieldcontain">
					<span id="product-label" class="property-label"><g:message code="rawGoodItem.product.label" default="Product" /></span>
					
						<g:each in="${rawGoodItemInstance.product}" var="p">
						<span class="property-value" aria-labelledby="product-label"><g:link controller="product" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${rawGoodItemInstance?.rawGoodSupplier}">
				<li class="fieldcontain">
					<span id="rawGoodSupplier-label" class="property-label"><g:message code="rawGoodItem.rawGoodSupplier.label" default="Raw Good Supplier" /></span>
					
						<g:each in="${rawGoodItemInstance.rawGoodSupplier}" var="r">
						<span class="property-value" aria-labelledby="rawGoodSupplier-label"><g:link controller="supplier" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:rawGoodItemInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${rawGoodItemInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
