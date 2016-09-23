<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<body>

<h2>Currency Conversion</h2>

<s:form action="currency">
  <s:textfield name="usd" label="US Dollars (USD)"></s:textfield>
  <s:submit value="Convert To INR"></s:submit>
</s:form>

INR = <s:property value="inr" />
</body>
</html>
