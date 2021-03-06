
<%@ page import="commerce.suppliers.Supplier" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'supplier.label', default: 'Supplier')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-supplier" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-supplier" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list supplier">
			
				<g:if test="${supplierInstance?.code}">
				<li class="fieldcontain">
					<span id="code-label" class="property-label"><g:message code="supplier.code.label" default="Code" /></span>
					
						<span class="property-value" aria-labelledby="code-label"><g:fieldValue bean="${supplierInstance}" field="code"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${supplierInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="supplier.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${supplierInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${supplierInstance?.address}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="supplier.address.label" default="Address" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:fieldValue bean="${supplierInstance}" field="address"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${supplierInstance?.inventoryItem}">
				<li class="fieldcontain">
					<span id="inventoryItem-label" class="property-label"><g:message code="supplier.inventoryItem.label" default="Inventory Item" /></span>
					
						<g:each in="${supplierInstance.inventoryItem}" var="i">
						<span class="property-value" aria-labelledby="inventoryItem-label"><g:link controller="inventoryItem" action="show" id="${i.id}">${i?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${supplierInstance?.rawGood}">
				<li class="fieldcontain">
					<span id="rawGood-label" class="property-label"><g:message code="supplier.rawGood.label" default="Raw Good" /></span>
					
						<g:each in="${supplierInstance.rawGood}" var="r">
						<span class="property-value" aria-labelledby="rawGood-label"><g:link controller="rawGoodItem" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${supplierInstance?.storeInventory}">
				<li class="fieldcontain">
					<span id="storeInventory-label" class="property-label"><g:message code="supplier.storeInventory.label" default="Store Inventory" /></span>
					
						<g:each in="${supplierInstance.storeInventory}" var="s">
						<span class="property-value" aria-labelledby="storeInventory-label"><g:link controller="storeInventory" action="show" id="${s.id}">${s?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:supplierInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${supplierInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
