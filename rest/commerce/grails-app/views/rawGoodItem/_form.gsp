<%@ page import="commerce.inventory.RawGoodItem" %>



<div class="fieldcontain ${hasErrors(bean: rawGoodItemInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="rawGoodItem.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${rawGoodItemInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: rawGoodItemInstance, field: 'cost', 'error')} required">
	<label for="cost">
		<g:message code="rawGoodItem.cost.label" default="Cost" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="cost" value="${fieldValue(bean: rawGoodItemInstance, field: 'cost')}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: rawGoodItemInstance, field: 'quantity', 'error')} required">
	<label for="quantity">
		<g:message code="rawGoodItem.quantity.label" default="Quantity" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="quantity" type="number" value="${rawGoodItemInstance.quantity}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: rawGoodItemInstance, field: 'product', 'error')} ">
	<label for="product">
		<g:message code="rawGoodItem.product.label" default="Product" />
		
	</label>
	
</div>

<div class="fieldcontain ${hasErrors(bean: rawGoodItemInstance, field: 'rawGoodSupplier', 'error')} ">
	<label for="rawGoodSupplier">
		<g:message code="rawGoodItem.rawGoodSupplier.label" default="Raw Good Supplier" />
		
	</label>
	<g:select name="rawGoodSupplier" from="${commerce.suppliers.Supplier.list()}" multiple="multiple" optionKey="id" size="5" value="${rawGoodItemInstance?.rawGoodSupplier*.id}" class="many-to-many"/>
</div>

