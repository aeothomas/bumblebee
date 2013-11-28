<%@ page import="commerce.products.Modifier" %>



<div class="fieldcontain ${hasErrors(bean: modifierInstance, field: 'modifierOption', 'error')} ">
	<label for="modifierOption">
		<g:message code="modifier.modifierOption.label" default="Modifier Option" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${modifierInstance?.modifierOption?}" var="m">
    <li><g:link controller="modifierOption" action="show" id="${m.id}">${m?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="modifierOption" action="create" params="['modifier.id': modifierInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'modifierOption.label', default: 'ModifierOption')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: modifierInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="modifier.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${modifierInstance?.name}"/>
</div>

