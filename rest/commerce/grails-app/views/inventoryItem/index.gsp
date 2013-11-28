
<%@ page import="commerce.inventory.InventoryItem" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'inventoryItem.label', default: 'InventoryItem')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-inventoryItem" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-inventoryItem" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="sku" title="${message(code: 'inventoryItem.sku.label', default: 'Sku')}" />
					
						<g:sortableColumn property="isTracked" title="${message(code: 'inventoryItem.isTracked.label', default: 'Is Tracked')}" />
					
						<g:sortableColumn property="price" title="${message(code: 'inventoryItem.price.label', default: 'Price')}" />
					
						<th><g:message code="inventoryItem.product.label" default="Product" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${inventoryItemInstanceList}" status="i" var="inventoryItemInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${inventoryItemInstance.id}">${fieldValue(bean: inventoryItemInstance, field: "sku")}</g:link></td>
					
						<td><g:formatBoolean boolean="${inventoryItemInstance.isTracked}" /></td>
					
						<td>${fieldValue(bean: inventoryItemInstance, field: "price")}</td>
					
						<td>${fieldValue(bean: inventoryItemInstance, field: "product")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${inventoryItemInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
