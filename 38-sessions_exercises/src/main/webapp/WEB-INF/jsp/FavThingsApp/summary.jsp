
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta name="viewport" content="width=device-width" />

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Favorite Things Exercise" />
</c:import>

<section id="main-content">
	<h2>These are a few of my favorite things</h2>
	<div>
		<div><c:out value="${user1.color}"/></div>		
		<div><c:out value="${user1.food}"/></div>
		<div><c:out value="${user1.season}"/></div>				
	</div>
</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp">
</c:import>