<%@ taglib prefix="core" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>
<head><title>Spring MVC CRUD Example </title></head>
<body>

<center>

	<h1>Spring MVC CRUD</h1>
	<br/>

	<form method="post" action="/spring-mvc-crud-webapp/userPage.do">
		<table width="70%" border="1">
			<tr>
				<td align="center" bgcolor="lightblue">Save Person Detail</td>
			</tr>
			<tr>
				<td>
					<table border="0" width="100%">
						<tr>
							<td width="33%" align="right">First Name: </td>
							<td width="66%" align="left">
								<spring:bind path="person.firstName">
								<input type="text"
								       name="firstName"
								       value="<core:out value="${status.value}"/>"/>
								</spring:bind>
							</td>

						</tr>
						<tr>
							<td colspan="2" align="center">
								<spring:hasBindErrors name="person">
								<font color="red"><core:out value="${status.errorMessage}"/></font>
								</spring:hasBindErrors>
							</td>
						</tr>
						<tr>
							<td width="33%" align="right">Last Name: </td>
							<td width="66%" align="left">
								<spring:bind path="person.lastName">
								<input type="text" name="lastName" />
								</spring:bind>
							</td>
						</tr>
						<tr>
							<td colspan="2" align="center">
								<spring:hasBindErrors name="person">
								<font color="red"><core:out value="${status.errorMessage}"/></font>
								</spring:hasBindErrors>
							</td>
						</tr>
						<tr>
							<td align="center" colspan="2">
								<input type="submit" alignment="center" value="Save">
							</td>
						</tr>
					</table>

				</td>
			</tr>
		</table>

	</form>

</center>

</body>
</html>