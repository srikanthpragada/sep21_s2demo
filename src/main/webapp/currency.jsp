<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<s:head />
</head>
<body>

	<h2>Currency Conversion</h2>

	<s:form action="currency" validate="true">
		<s:textfield name="usd" label="US Dollars (USD)"></s:textfield>
		<s:submit value="Convert To INR"></s:submit>
	</s:form>
	<s:if test="inr > 0">
		<h3>
			INR =
			<s:property value="inr" />
		</h3>
	</s:if>
</body>
</html>
