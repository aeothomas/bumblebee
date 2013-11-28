<%@ page import="commerce.products.Product" %>



<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="product.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${productInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'category', 'error')} required">
	<label for="category">
		<g:message code="product.category.label" default="Category" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="category" name="category.id" from="${commerce.products.ProductCategory.list()}" optionKey="id" required="" value="${productInstance?.category?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'pricingType', 'error')} required">
	<label for="pricingType">
		<g:message code="product.pricingType.label" default="Pricing Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="pricingType" name="pricingType.id" from="${commerce.products.ProductPricingType.list()}" optionKey="id" required="" value="${productInstance?.pricingType?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'addon', 'error')} ">
	<label for="addon">
		<g:message code="product.addon.label" default="Addon" />
		
	</label>
	<g:select name="addon" from="${commerce.products.AddOn.list()}" multiple="multiple" optionKey="id" size="5" value="${productInstance?.addon*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'cost', 'error')} required">
	<label for="cost">
		<g:message code="product.cost.label" default="Cost" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="cost" value="${fieldValue(bean: productInstance, field: 'cost')}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'department', 'error')} required">
	<label for="department">
		<g:message code="product.department.label" default="Department" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="department" name="department.id" from="${commerce.business.Department.list()}" optionKey="id" required="" value="${productInstance?.department?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="product.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${productInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'excludeOptions', 'error')} ">
	<label for="excludeOptions">
		<g:message code="product.excludeOptions.label" default="Exclude Options" />
		
	</label>
	<g:select name="excludeOptions" from="${commerce.products.AddOn.list()}" multiple="multiple" optionKey="id" size="5" value="${productInstance?.excludeOptions*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'inventoryItem', 'error')} ">
	<label for="inventoryItem">
		<g:message code="product.inventoryItem.label" default="Inventory Item" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${productInstance?.inventoryItem?}" var="i">
    <li><g:link controller="inventoryItem" action="show" id="${i.id}">${i?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="inventoryItem" action="create" params="['product.id': productInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'inventoryItem.label', default: 'InventoryItem')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'modifiers', 'error')} ">
	<label for="modifiers">
		<g:message code="product.modifiers.label" default="Modifiers" />
		
	</label>
	<g:select name="modifiers" from="${commerce.products.Modifier.list()}" multiple="multiple" optionKey="id" size="5" value="${productInstance?.modifiers*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'productUnitType', 'error')} ">
	<label for="productUnitType">
		<g:message code="product.productUnitType.label" default="Product Unit Type" />
		
	</label>
	<g:select name="productUnitType" from="${commerce.products.ProductUnitType.list()}" multiple="multiple" optionKey="id" size="5" value="${productInstance?.productUnitType*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: productInstance, field: 'rawGoodItem', 'error')} ">
	<label for="rawGoodItem">
		<g:message code="product.rawGoodItem.label" default="Raw Good Item" />
		
	</label>
	<g:select name="rawGoodItem" from="${commerce.inventory.RawGoodItem.list()}" multiple="multiple" optionKey="id" size="5" value="${productInstance?.rawGoodItem*.id}" class="many-to-many"/>
</div>

