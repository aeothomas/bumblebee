<%@ page import="commerce.trans.Transaction" %>



<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'amount', 'error')} required">
	<label for="amount">
		<g:message code="transaction.amount.label" default="Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="amount" value="${fieldValue(bean: transactionInstance, field: 'amount')}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'cashier', 'error')} required">
	<label for="cashier">
		<g:message code="transaction.cashier.label" default="Cashier" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cashier" name="cashier.id" from="${commerce.emp.Employee.list()}" optionKey="id" required="" value="${transactionInstance?.cashier?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'date', 'error')} required">
	<label for="date">
		<g:message code="transaction.date.label" default="Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="date" precision="day"  value="${transactionInstance?.date}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'lineItem', 'error')} ">
	<label for="lineItem">
		<g:message code="transaction.lineItem.label" default="Line Item" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${transactionInstance?.lineItem?}" var="l">
    <li><g:link controller="lineItem" action="show" id="${l.id}">${l?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="lineItem" action="create" params="['transaction.id': transactionInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'lineItem.label', default: 'LineItem')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'muliplePayments', 'error')} ">
	<label for="muliplePayments">
		<g:message code="transaction.muliplePayments.label" default="Muliple Payments" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${transactionInstance?.muliplePayments?}" var="m">
    <li><g:link controller="payment" action="show" id="${m.id}">${m?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="payment" action="create" params="['transaction.id': transactionInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'payment.label', default: 'Payment')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'operationType', 'error')} required">
	<label for="operationType">
		<g:message code="transaction.operationType.label" default="Operation Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="operationType" name="operationType.id" from="${commerce.trans.OperationType.list()}" optionKey="id" required="" value="${transactionInstance?.operationType?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'orderNum', 'error')} ">
	<label for="orderNum">
		<g:message code="transaction.orderNum.label" default="Order Num" />
		
	</label>
	<g:textField name="orderNum" value="${transactionInstance?.orderNum}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'payment', 'error')} required">
	<label for="payment">
		<g:message code="transaction.payment.label" default="Payment" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="payment" name="payment.id" from="${commerce.trans.Payment.list()}" optionKey="id" required="" value="${transactionInstance?.payment?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'register', 'error')} required">
	<label for="register">
		<g:message code="transaction.register.label" default="Register" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="register" name="register.id" from="${commerce.reg.Register.list()}" optionKey="id" required="" value="${transactionInstance?.register?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'registerCode', 'error')} ">
	<label for="registerCode">
		<g:message code="transaction.registerCode.label" default="Register Code" />
		
	</label>
	<g:textField name="registerCode" value="${transactionInstance?.registerCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'store', 'error')} required">
	<label for="store">
		<g:message code="transaction.store.label" default="Store" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="store" name="store.id" from="${commerce.store.Store.list()}" optionKey="id" required="" value="${transactionInstance?.store?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'storeCode', 'error')} ">
	<label for="storeCode">
		<g:message code="transaction.storeCode.label" default="Store Code" />
		
	</label>
	<g:textField name="storeCode" value="${transactionInstance?.storeCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'tax', 'error')} required">
	<label for="tax">
		<g:message code="transaction.tax.label" default="Tax" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="tax" value="${fieldValue(bean: transactionInstance, field: 'tax')}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: transactionInstance, field: 'transNum', 'error')} ">
	<label for="transNum">
		<g:message code="transaction.transNum.label" default="Trans Num" />
		
	</label>
	<g:textField name="transNum" value="${transactionInstance?.transNum}"/>
</div>

