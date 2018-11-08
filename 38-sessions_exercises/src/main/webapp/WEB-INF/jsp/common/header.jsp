
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<title><c:out value="${param.pageTitle}" /></title>
<c:url var="sitesCssUrl" value="/css/site.css" />
<link rel="stylesheet" type="text/css" href="${sitesCssUrl}" />

</head>

<body>
	<header>
		<h1>Favorite Things Exercise</h1>
	</header>