
<%@ page import="commerce.trans.LineItem" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'lineItem.label', default: 'LineItem')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-lineItem" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-lineItem" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<th><g:message code="lineItem.inventoryItem.label" default="Inventory Item" /></th>
					
						<g:sortableColumn property="quantity" title="${message(code: 'lineItem.quantity.label', default: 'Quantity')}" />
					
						<g:sortableColumn property="total" title="${message(code: 'lineItem.total.label', default: 'Total')}" />
					
						<th><g:message code="lineItem.transaction.label" default="Transaction" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${lineItemInstanceList}" status="i" var="lineItemInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${lineItemInstance.id}">${fieldValue(bean: lineItemInstance, field: "inventoryItem")}</g:link></td>
					
						<td>${fieldValue(bean: lineItemInstance, field: "quantity")}</td>
					
						<td>${fieldValue(bean: lineItemInstance, field: "total")}</td>
					
						<td>${fieldValue(bean: lineItemInstance, field: "transaction")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${lineItemInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
