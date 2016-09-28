<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Get Date Using Ajax</title>
<sj:head />
</head>
<body>
	<h2>Ajax with jQuery Plugin</h2>
	<s:url var="today" value="/today" />
	<sj:a id="ajaxlink" href="%{today}" targets="result">
	  	What is Today?
	</sj:a>
	<h3 id="result"></h3>
</body>
</html>
