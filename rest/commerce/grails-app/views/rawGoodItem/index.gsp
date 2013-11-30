
<%@ page import="commerce.inventory.RawGoodItem" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'rawGoodItem.label', default: 'RawGoodItem')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-rawGoodItem" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-rawGoodItem" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="name" title="${message(code: 'rawGoodItem.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="cost" title="${message(code: 'rawGoodItem.cost.label', default: 'Cost')}" />
					
						<g:sortableColumn property="quantity" title="${message(code: 'rawGoodItem.quantity.label', default: 'Quantity')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${rawGoodItemInstanceList}" status="i" var="rawGoodItemInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${rawGoodItemInstance.id}">${fieldValue(bean: rawGoodItemInstance, field: "name")}</g:link></td>
					
						<td>${fieldValue(bean: rawGoodItemInstance, field: "cost")}</td>
					
						<td>${fieldValue(bean: rawGoodItemInstance, field: "quantity")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${rawGoodItemInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
