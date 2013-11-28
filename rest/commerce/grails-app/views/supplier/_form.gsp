<%@ page import="commerce.suppliers.Supplier" %>



<div class="fieldcontain ${hasErrors(bean: supplierInstance, field: 'code', 'error')} required">
	<label for="code">
		<g:message code="supplier.code.label" default="Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="code" required="" value="${supplierInstance?.code}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: supplierInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="supplier.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${supplierInstance?.name}"/>
</div>
<fieldset class="embedded"><legend><g:message code="supplier.address.label" default="Address" /></legend>
<div class="fieldcontain ${hasErrors(bean: supplierInstance, field: 'address.addressLine1', 'error')} ">
	<label for="address.addressLine1">
		<g:message code="supplier.address.addressLine1.label" default="Address Line1" />
		
	</label>
	<g:textField name="addressLine1" value="${addressInstance?.addressLine1}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: supplierInstance, field: 'address.addressLine2', 'error')} ">
	<label for="address.addressLine2">
		<g:message code="supplier.address.addressLine2.label" default="Address Line2" />
		
	</label>
	<g:textField name="addressLine2" value="${addressInstance?.addressLine2}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: supplierInstance, field: 'address.country', 'error')} required">
	<label for="address.country">
		<g:message code="supplier.address.country.label" default="Country" />
		<span class="required-indicator">*</span>
	</label>
	
</div>

<div class="fieldcontain ${hasErrors(bean: supplierInstance, field: 'address.houseNumber', 'error')} ">
	<label for="address.houseNumber">
		<g:message code="supplier.address.houseNumber.label" default="House Number" />
		
	</label>
	<g:textField name="houseNumber" value="${addressInstance?.houseNumber}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: supplierInstance, field: 'address.id', 'error')} required">
	<label for="address.id">
		<g:message code="supplier.address.id.label" default="Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="id" type="number" value="${addressInstance.id}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: supplierInstance, field: 'address.postCode', 'error')} ">
	<label for="address.postCode">
		<g:message code="supplier.address.postCode.label" default="Post Code" />
		
	</label>
	<g:textField name="postCode" value="${addressInstance?.postCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: supplierInstance, field: 'address.province', 'error')} ">
	<label for="address.province">
		<g:message code="supplier.address.province.label" default="Province" />
		
	</label>
	<g:textField name="province" value="${addressInstance?.province}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: supplierInstance, field: 'address.version', 'error')} required">
	<label for="address.version">
		<g:message code="supplier.address.version.label" default="Version" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="version" type="number" value="${addressInstance.version}" required=""/>
</div>
</fieldset>
<div class="fieldcontain ${hasErrors(bean: supplierInstance, field: 'inventoryItem', 'error')} ">
	<label for="inventoryItem">
		<g:message code="supplier.inventoryItem.label" default="Inventory Item" />
		
	</label>
	
</div>

<div class="fieldcontain ${hasErrors(bean: supplierInstance, field: 'rawGood', 'error')} ">
	<label for="rawGood">
		<g:message code="supplier.rawGood.label" default="Raw Good" />
		
	</label>
	
</div>

<div class="fieldcontain ${hasErrors(bean: supplierInstance, field: 'storeInventory', 'error')} ">
	<label for="storeInventory">
		<g:message code="supplier.storeInventory.label" default="Store Inventory" />
		
	</label>
	
</div>

