
<%@ page import="commerce.inventory.InventoryItem" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'inventoryItem.label', default: 'InventoryItem')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-inventoryItem" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-inventoryItem" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list inventoryItem">
			
				<g:if test="${inventoryItemInstance?.sku}">
				<li class="fieldcontain">
					<span id="sku-label" class="property-label"><g:message code="inventoryItem.sku.label" default="Sku" /></span>
					
						<span class="property-value" aria-labelledby="sku-label"><g:fieldValue bean="${inventoryItemInstance}" field="sku"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryItemInstance?.globalSupplier}">
				<li class="fieldcontain">
					<span id="globalSupplier-label" class="property-label"><g:message code="inventoryItem.globalSupplier.label" default="Global Supplier" /></span>
					
						<g:each in="${inventoryItemInstance.globalSupplier}" var="g">
						<span class="property-value" aria-labelledby="globalSupplier-label"><g:link controller="supplier" action="show" id="${g.id}">${g?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryItemInstance?.isTracked}">
				<li class="fieldcontain">
					<span id="isTracked-label" class="property-label"><g:message code="inventoryItem.isTracked.label" default="Is Tracked" /></span>
					
						<span class="property-value" aria-labelledby="isTracked-label"><g:formatBoolean boolean="${inventoryItemInstance?.isTracked}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryItemInstance?.price}">
				<li class="fieldcontain">
					<span id="price-label" class="property-label"><g:message code="inventoryItem.price.label" default="Price" /></span>
					
						<span class="property-value" aria-labelledby="price-label"><g:fieldValue bean="${inventoryItemInstance}" field="price"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryItemInstance?.product}">
				<li class="fieldcontain">
					<span id="product-label" class="property-label"><g:message code="inventoryItem.product.label" default="Product" /></span>
					
						<span class="property-value" aria-labelledby="product-label"><g:link controller="product" action="show" id="${inventoryItemInstance?.product?.id}">${inventoryItemInstance?.product?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:inventoryItemInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${inventoryItemInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
