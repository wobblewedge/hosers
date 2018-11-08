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
	<h2>&#x266B &#x266A These are a few of my favorite things &#x266B &#x266A</h2>
	
	<div id="questioncontainer">
	
	<p>What is your favorite <strong>food</strong>?</p>
	
	</div>
	
	<div id="inputcontainer" style="text-align:left">
	<form action="foodInput" method="POST"> <%-- THIS WILL NEED TO BE UPDATED --%>
		<div>
			<label for="food"></label>
			<input type="text" name="food" id="food" required/><br/><br/>
			<input type="submit" value="Next >>>" />
		</div><br/>
	</form>
	</div>
	
</section>
<c:import url="/WEB-INF/jsp/common/footer.jsp">
</c:import>