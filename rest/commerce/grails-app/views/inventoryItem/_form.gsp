<%@ page import="commerce.inventory.InventoryItem" %>



<div class="fieldcontain ${hasErrors(bean: inventoryItemInstance, field: 'sku', 'error')} required">
	<label for="sku">
		<g:message code="inventoryItem.sku.label" default="Sku" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="sku" required="" value="${inventoryItemInstance?.sku}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: inventoryItemInstance, field: 'globalSupplier', 'error')} ">
	<label for="globalSupplier">
		<g:message code="inventoryItem.globalSupplier.label" default="Global Supplier" />
		
	</label>
	<g:select name="globalSupplier" from="${commerce.suppliers.Supplier.list()}" multiple="multiple" optionKey="id" size="5" value="${inventoryItemInstance?.globalSupplier*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: inventoryItemInstance, field: 'isTracked', 'error')} ">
	<label for="isTracked">
		<g:message code="inventoryItem.isTracked.label" default="Is Tracked" />
		
	</label>
	<g:checkBox name="isTracked" value="${inventoryItemInstance?.isTracked}" />
</div>

<div class="fieldcontain ${hasErrors(bean: inventoryItemInstance, field: 'price', 'error')} required">
	<label for="price">
		<g:message code="inventoryItem.price.label" default="Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="price" value="${fieldValue(bean: inventoryItemInstance, field: 'price')}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: inventoryItemInstance, field: 'product', 'error')} required">
	<label for="product">
		<g:message code="inventoryItem.product.label" default="Product" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="product" name="product.id" from="${commerce.products.Product.list()}" optionKey="id" required="" value="${inventoryItemInstance?.product?.id}" class="many-to-one"/>
</div>

