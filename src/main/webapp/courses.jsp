<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<body>

	<h2>List Of Courses</h2>

	<table border="1">
		<tr>
			<th>Title</th>
			<th>Duration</th>
			<th>Course Fee</th>
		</tr>
		<s:iterator value="courses">
			<tr>
				<td><s:property value="title" /></td>
				<td><s:property value="duration" /></td>
				<td><s:property value="fee" /></td>
			</tr>

		</s:iterator>

	</table>

</body>
</html>
