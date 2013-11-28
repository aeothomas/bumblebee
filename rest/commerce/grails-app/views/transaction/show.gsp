
<%@ page import="commerce.trans.Transaction" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'transaction.label', default: 'Transaction')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-transaction" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-transaction" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list transaction">
			
				<g:if test="${transactionInstance?.amount}">
				<li class="fieldcontain">
					<span id="amount-label" class="property-label"><g:message code="transaction.amount.label" default="Amount" /></span>
					
						<span class="property-value" aria-labelledby="amount-label"><g:fieldValue bean="${transactionInstance}" field="amount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${transactionInstance?.cashier}">
				<li class="fieldcontain">
					<span id="cashier-label" class="property-label"><g:message code="transaction.cashier.label" default="Cashier" /></span>
					
						<span class="property-value" aria-labelledby="cashier-label"><g:link controller="employee" action="show" id="${transactionInstance?.cashier?.id}">${transactionInstance?.cashier?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${transactionInstance?.date}">
				<li class="fieldcontain">
					<span id="date-label" class="property-label"><g:message code="transaction.date.label" default="Date" /></span>
					
						<span class="property-value" aria-labelledby="date-label"><g:formatDate date="${transactionInstance?.date}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${transactionInstance?.lineItem}">
				<li class="fieldcontain">
					<span id="lineItem-label" class="property-label"><g:message code="transaction.lineItem.label" default="Line Item" /></span>
					
						<g:each in="${transactionInstance.lineItem}" var="l">
						<span class="property-value" aria-labelledby="lineItem-label"><g:link controller="lineItem" action="show" id="${l.id}">${l?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${transactionInstance?.muliplePayments}">
				<li class="fieldcontain">
					<span id="muliplePayments-label" class="property-label"><g:message code="transaction.muliplePayments.label" default="Muliple Payments" /></span>
					
						<g:each in="${transactionInstance.muliplePayments}" var="m">
						<span class="property-value" aria-labelledby="muliplePayments-label"><g:link controller="payment" action="show" id="${m.id}">${m?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${transactionInstance?.operationType}">
				<li class="fieldcontain">
					<span id="operationType-label" class="property-label"><g:message code="transaction.operationType.label" default="Operation Type" /></span>
					
						<span class="property-value" aria-labelledby="operationType-label"><g:link controller="operationType" action="show" id="${transactionInstance?.operationType?.id}">${transactionInstance?.operationType?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${transactionInstance?.orderNum}">
				<li class="fieldcontain">
					<span id="orderNum-label" class="property-label"><g:message code="transaction.orderNum.label" default="Order Num" /></span>
					
						<span class="property-value" aria-labelledby="orderNum-label"><g:fieldValue bean="${transactionInstance}" field="orderNum"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${transactionInstance?.payment}">
				<li class="fieldcontain">
					<span id="payment-label" class="property-label"><g:message code="transaction.payment.label" default="Payment" /></span>
					
						<span class="property-value" aria-labelledby="payment-label"><g:link controller="payment" action="show" id="${transactionInstance?.payment?.id}">${transactionInstance?.payment?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${transactionInstance?.register}">
				<li class="fieldcontain">
					<span id="register-label" class="property-label"><g:message code="transaction.register.label" default="Register" /></span>
					
						<span class="property-value" aria-labelledby="register-label"><g:link controller="register" action="show" id="${transactionInstance?.register?.id}">${transactionInstance?.register?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${transactionInstance?.registerCode}">
				<li class="fieldcontain">
					<span id="registerCode-label" class="property-label"><g:message code="transaction.registerCode.label" default="Register Code" /></span>
					
						<span class="property-value" aria-labelledby="registerCode-label"><g:fieldValue bean="${transactionInstance}" field="registerCode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${transactionInstance?.store}">
				<li class="fieldcontain">
					<span id="store-label" class="property-label"><g:message code="transaction.store.label" default="Store" /></span>
					
						<span class="property-value" aria-labelledby="store-label"><g:link controller="store" action="show" id="${transactionInstance?.store?.id}">${transactionInstance?.store?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${transactionInstance?.storeCode}">
				<li class="fieldcontain">
					<span id="storeCode-label" class="property-label"><g:message code="transaction.storeCode.label" default="Store Code" /></span>
					
						<span class="property-value" aria-labelledby="storeCode-label"><g:fieldValue bean="${transactionInstance}" field="storeCode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${transactionInstance?.tax}">
				<li class="fieldcontain">
					<span id="tax-label" class="property-label"><g:message code="transaction.tax.label" default="Tax" /></span>
					
						<span class="property-value" aria-labelledby="tax-label"><g:fieldValue bean="${transactionInstance}" field="tax"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${transactionInstance?.transNum}">
				<li class="fieldcontain">
					<span id="transNum-label" class="property-label"><g:message code="transaction.transNum.label" default="Trans Num" /></span>
					
						<span class="property-value" aria-labelledby="transNum-label"><g:fieldValue bean="${transactionInstance}" field="transNum"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:transactionInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${transactionInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
