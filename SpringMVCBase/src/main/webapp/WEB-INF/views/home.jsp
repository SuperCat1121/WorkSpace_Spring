<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
	<table>
		<tr>
			<th>EMPNO</th>
			<th>ENAME</th>
			<th>SAL</th>
			<th>DEPTNO</th>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td><c:out value="${dto.empno}"/></td>
				<td><c:out value="${dto.ename}"/></td>
				<td><c:out value="${dto.sal}"/></td>
				<td><c:out value="${dto.deptno}"/></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
