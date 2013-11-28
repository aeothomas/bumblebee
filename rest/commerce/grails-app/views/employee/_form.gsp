<%@ page import="commerce.emp.Employee" %>


<fieldset class="embedded"><legend><g:message code="employee.address.label" default="Address" /></legend>
<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'address.addressLine1', 'error')} ">
	<label for="address.addressLine1">
		<g:message code="employee.address.addressLine1.label" default="Address Line1" />
		
	</label>
	<g:textField name="addressLine1" value="${addressInstance?.addressLine1}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'address.addressLine2', 'error')} ">
	<label for="address.addressLine2">
		<g:message code="employee.address.addressLine2.label" default="Address Line2" />
		
	</label>
	<g:textField name="addressLine2" value="${addressInstance?.addressLine2}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'address.country', 'error')} required">
	<label for="address.country">
		<g:message code="employee.address.country.label" default="Country" />
		<span class="required-indicator">*</span>
	</label>
	
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'address.houseNumber', 'error')} ">
	<label for="address.houseNumber">
		<g:message code="employee.address.houseNumber.label" default="House Number" />
		
	</label>
	<g:textField name="houseNumber" value="${addressInstance?.houseNumber}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'address.id', 'error')} required">
	<label for="address.id">
		<g:message code="employee.address.id.label" default="Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="id" type="number" value="${addressInstance.id}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'address.postCode', 'error')} ">
	<label for="address.postCode">
		<g:message code="employee.address.postCode.label" default="Post Code" />
		
	</label>
	<g:textField name="postCode" value="${addressInstance?.postCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'address.province', 'error')} ">
	<label for="address.province">
		<g:message code="employee.address.province.label" default="Province" />
		
	</label>
	<g:textField name="province" value="${addressInstance?.province}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'address.version', 'error')} required">
	<label for="address.version">
		<g:message code="employee.address.version.label" default="Version" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="version" type="number" value="${addressInstance.version}" required=""/>
</div>
</fieldset>
<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'code', 'error')} ">
	<label for="code">
		<g:message code="employee.code.label" default="Code" />
		
	</label>
	<g:textField name="code" value="${employeeInstance?.code}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'firstName', 'error')} ">
	<label for="firstName">
		<g:message code="employee.firstName.label" default="First Name" />
		
	</label>
	<g:textField name="firstName" value="${employeeInstance?.firstName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'lastName', 'error')} ">
	<label for="lastName">
		<g:message code="employee.lastName.label" default="Last Name" />
		
	</label>
	<g:textField name="lastName" value="${employeeInstance?.lastName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'phoneNumber', 'error')} ">
	<label for="phoneNumber">
		<g:message code="employee.phoneNumber.label" default="Phone Number" />
		
	</label>
	<g:textField name="phoneNumber" value="${employeeInstance?.phoneNumber}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'store', 'error')} required">
	<label for="store">
		<g:message code="employee.store.label" default="Store" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="store" name="store.id" from="${commerce.store.Store.list()}" optionKey="id" required="" value="${employeeInstance?.store?.id}" class="many-to-one"/>
</div>

