<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employees By Job</title>
</head>
<body>
	<h1>Employees By Job</h1>
	<s:form action="/employeesByJob">
		<s:select list="jobs" listKey="id" listValue="title" name="job"
			label="Select Job" />
		<s:submit value="Get Employees" />
	</s:form>
	
	<s:if test="job != null">

	<table border="1" cellpadding="5pt">
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Salary</th>
		</tr>

		<s:iterator value="employees">
			<tr>
				<td><s:property value="id" /></td>
				<td><s:property value="firstName" /></td>
				<td><s:property value="salary" /></td>
			</tr>
		</s:iterator>
	</table>

  </s:if>
</body>
</html>
