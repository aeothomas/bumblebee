<%@ page import="commerce.trans.PaymentType" %>



<div class="fieldcontain ${hasErrors(bean: paymentTypeInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="paymentType.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${paymentTypeInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: paymentTypeInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="paymentType.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="type" type="number" value="${paymentTypeInstance.type}" required=""/>
</div>

