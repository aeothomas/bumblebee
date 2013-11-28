<%@ page import="commerce.reg.Register" %>



<div class="fieldcontain ${hasErrors(bean: registerInstance, field: 'code', 'error')} required">
	<label for="code">
		<g:message code="register.code.label" default="Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="code" required="" value="${registerInstance?.code}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: registerInstance, field: 'store', 'error')} required">
	<label for="store">
		<g:message code="register.store.label" default="Store" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="store" name="store.id" from="${commerce.store.Store.list()}" optionKey="id" required="" value="${registerInstance?.store?.id}" class="many-to-one"/>
</div>

