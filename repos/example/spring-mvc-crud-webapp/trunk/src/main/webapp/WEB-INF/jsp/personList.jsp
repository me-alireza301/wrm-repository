<%@ include file="/WEB-INF/jsp/include.jsp"%>
<html>
<head>
<title>Spring Framework CRUD Web Application</title>
</head>
<body>
<h1>Spring Framework Application</h1>
<h3>Persons</h3>
<c:forEach items="${personList}" var="person">
	<c:out value="${person.firstName}" />
	<i><c:out value="${person.lastName}" /></i>
	<br>
	<br>
</c:forEach>
</body>
</html>