<%@ page import="commerce.products.AddOn" %>



<div class="fieldcontain ${hasErrors(bean: addOnInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="addOn.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${addOnInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addOnInstance, field: 'options', 'error')} ">
	<label for="options">
		<g:message code="addOn.options.label" default="Options" />
		
	</label>
	<g:select name="options" from="${commerce.products.AddOnOption.list()}" multiple="multiple" optionKey="id" size="5" value="${addOnInstance?.options*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: addOnInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="addOn.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="type" name="type.id" from="${commerce.products.AddOnType.list()}" optionKey="id" required="" value="${addOnInstance?.type?.id}" class="many-to-one"/>
</div>

