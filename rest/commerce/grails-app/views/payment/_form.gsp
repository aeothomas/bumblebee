<%@ page import="commerce.trans.Payment" %>



<div class="fieldcontain ${hasErrors(bean: paymentInstance, field: 'amount', 'error')} required">
	<label for="amount">
		<g:message code="payment.amount.label" default="Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="amount" value="${fieldValue(bean: paymentInstance, field: 'amount')}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: paymentInstance, field: 'paymentNum', 'error')} ">
	<label for="paymentNum">
		<g:message code="payment.paymentNum.label" default="Payment Num" />
		
	</label>
	<g:textField name="paymentNum" value="${paymentInstance?.paymentNum}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: paymentInstance, field: 'paymentType', 'error')} required">
	<label for="paymentType">
		<g:message code="payment.paymentType.label" default="Payment Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="paymentType" name="paymentType.id" from="${commerce.trans.PaymentType.list()}" optionKey="id" required="" value="${paymentInstance?.paymentType?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: paymentInstance, field: 'transaction', 'error')} required">
	<label for="transaction">
		<g:message code="payment.transaction.label" default="Transaction" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="transaction" name="transaction.id" from="${commerce.trans.Transaction.list()}" optionKey="id" required="" value="${paymentInstance?.transaction?.id}" class="many-to-one"/>
</div>

