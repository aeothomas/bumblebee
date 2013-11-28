
<%@ page import="commerce.products.Product" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'product.label', default: 'Product')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-product" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-product" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list product">
			
				<g:if test="${productInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="product.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${productInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.category}">
				<li class="fieldcontain">
					<span id="category-label" class="property-label"><g:message code="product.category.label" default="Category" /></span>
					
						<span class="property-value" aria-labelledby="category-label"><g:link controller="productCategory" action="show" id="${productInstance?.category?.id}">${productInstance?.category?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.pricingType}">
				<li class="fieldcontain">
					<span id="pricingType-label" class="property-label"><g:message code="product.pricingType.label" default="Pricing Type" /></span>
					
						<span class="property-value" aria-labelledby="pricingType-label"><g:link controller="productPricingType" action="show" id="${productInstance?.pricingType?.id}">${productInstance?.pricingType?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.addon}">
				<li class="fieldcontain">
					<span id="addon-label" class="property-label"><g:message code="product.addon.label" default="Addon" /></span>
					
						<g:each in="${productInstance.addon}" var="a">
						<span class="property-value" aria-labelledby="addon-label"><g:link controller="addOn" action="show" id="${a.id}">${a?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.cost}">
				<li class="fieldcontain">
					<span id="cost-label" class="property-label"><g:message code="product.cost.label" default="Cost" /></span>
					
						<span class="property-value" aria-labelledby="cost-label"><g:fieldValue bean="${productInstance}" field="cost"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.department}">
				<li class="fieldcontain">
					<span id="department-label" class="property-label"><g:message code="product.department.label" default="Department" /></span>
					
						<span class="property-value" aria-labelledby="department-label"><g:link controller="department" action="show" id="${productInstance?.department?.id}">${productInstance?.department?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="product.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${productInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.excludeOptions}">
				<li class="fieldcontain">
					<span id="excludeOptions-label" class="property-label"><g:message code="product.excludeOptions.label" default="Exclude Options" /></span>
					
						<g:each in="${productInstance.excludeOptions}" var="e">
						<span class="property-value" aria-labelledby="excludeOptions-label"><g:link controller="addOn" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.inventoryItem}">
				<li class="fieldcontain">
					<span id="inventoryItem-label" class="property-label"><g:message code="product.inventoryItem.label" default="Inventory Item" /></span>
					
						<g:each in="${productInstance.inventoryItem}" var="i">
						<span class="property-value" aria-labelledby="inventoryItem-label"><g:link controller="inventoryItem" action="show" id="${i.id}">${i?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.modifiers}">
				<li class="fieldcontain">
					<span id="modifiers-label" class="property-label"><g:message code="product.modifiers.label" default="Modifiers" /></span>
					
						<g:each in="${productInstance.modifiers}" var="m">
						<span class="property-value" aria-labelledby="modifiers-label"><g:link controller="modifier" action="show" id="${m.id}">${m?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.productUnitType}">
				<li class="fieldcontain">
					<span id="productUnitType-label" class="property-label"><g:message code="product.productUnitType.label" default="Product Unit Type" /></span>
					
						<g:each in="${productInstance.productUnitType}" var="p">
						<span class="property-value" aria-labelledby="productUnitType-label"><g:link controller="productUnitType" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${productInstance?.rawGoodItem}">
				<li class="fieldcontain">
					<span id="rawGoodItem-label" class="property-label"><g:message code="product.rawGoodItem.label" default="Raw Good Item" /></span>
					
						<g:each in="${productInstance.rawGoodItem}" var="r">
						<span class="property-value" aria-labelledby="rawGoodItem-label"><g:link controller="rawGoodItem" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:productInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${productInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
