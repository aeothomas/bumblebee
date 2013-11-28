<%@ page import="commerce.trans.LineItem" %>



<div class="fieldcontain ${hasErrors(bean: lineItemInstance, field: 'inventoryItem', 'error')} required">
	<label for="inventoryItem">
		<g:message code="lineItem.inventoryItem.label" default="Inventory Item" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="inventoryItem" name="inventoryItem.id" from="${commerce.inventory.InventoryItem.list()}" optionKey="id" required="" value="${lineItemInstance?.inventoryItem?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: lineItemInstance, field: 'quantity', 'error')} required">
	<label for="quantity">
		<g:message code="lineItem.quantity.label" default="Quantity" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="quantity" type="number" value="${lineItemInstance.quantity}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: lineItemInstance, field: 'total', 'error')} required">
	<label for="total">
		<g:message code="lineItem.total.label" default="Total" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="total" value="${fieldValue(bean: lineItemInstance, field: 'total')}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: lineItemInstance, field: 'transaction', 'error')} required">
	<label for="transaction">
		<g:message code="lineItem.transaction.label" default="Transaction" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="transaction" name="transaction.id" from="${commerce.trans.Transaction.list()}" optionKey="id" required="" value="${lineItemInstance?.transaction?.id}" class="many-to-one"/>
</div>

