<%@ page import="commerce.store.Store" %>



<div class="fieldcontain ${hasErrors(bean: storeInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="store.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${storeInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: storeInstance, field: 'code', 'error')} required">
	<label for="code">
		<g:message code="store.code.label" default="Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="code" required="" value="${storeInstance?.code}"/>
</div>
<fieldset class="embedded"><legend><g:message code="store.address.label" default="Address" /></legend>
<div class="fieldcontain ${hasErrors(bean: storeInstance, field: 'address.addressLine1', 'error')} ">
	<label for="address.addressLine1">
		<g:message code="store.address.addressLine1.label" default="Address Line1" />
		
	</label>
	<g:textField name="addressLine1" value="${addressInstance?.addressLine1}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: storeInstance, field: 'address.addressLine2', 'error')} ">
	<label for="address.addressLine2">
		<g:message code="store.address.addressLine2.label" default="Address Line2" />
		
	</label>
	<g:textField name="addressLine2" value="${addressInstance?.addressLine2}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: storeInstance, field: 'address.country', 'error')} required">
	<label for="address.country">
		<g:message code="store.address.country.label" default="Country" />
		<span class="required-indicator">*</span>
	</label>
	
</div>

<div class="fieldcontain ${hasErrors(bean: storeInstance, field: 'address.houseNumber', 'error')} ">
	<label for="address.houseNumber">
		<g:message code="store.address.houseNumber.label" default="House Number" />
		
	</label>
	<g:textField name="houseNumber" value="${addressInstance?.houseNumber}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: storeInstance, field: 'address.id', 'error')} required">
	<label for="address.id">
		<g:message code="store.address.id.label" default="Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="id" type="number" value="${addressInstance.id}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: storeInstance, field: 'address.postCode', 'error')} ">
	<label for="address.postCode">
		<g:message code="store.address.postCode.label" default="Post Code" />
		
	</label>
	<g:textField name="postCode" value="${addressInstance?.postCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: storeInstance, field: 'address.province', 'error')} ">
	<label for="address.province">
		<g:message code="store.address.province.label" default="Province" />
		
	</label>
	<g:textField name="province" value="${addressInstance?.province}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: storeInstance, field: 'address.version', 'error')} required">
	<label for="address.version">
		<g:message code="store.address.version.label" default="Version" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="version" type="number" value="${addressInstance.version}" required=""/>
</div>
</fieldset>
