<%@ page import="commerce.business.Department" %>



<div class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'code', 'error')} required">
	<label for="code">
		<g:message code="department.code.label" default="Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="code" type="number" value="${departmentInstance.code}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="department.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${departmentInstance?.name}"/>
</div>

