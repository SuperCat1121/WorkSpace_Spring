<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 리스트</title>
<style type="text/css">
	table {
		border : 1px solid red;
		text-align: center;
		width : 300px;
		height : 250px;
	}
	
	th {
		height :  50px;
	}
</style>
</head>
<body>
	<h1>List</h1>
	<table>
		<c:choose>
			<c:when test="${empty list}">
				<tr><td><h3>고객 정보가 없습니다.</h3></td></tr>
			</c:when>
			<c:otherwise>
				<tr>
					<th>아이디</th>
					<th>이름</th>
				</tr>
				<c:forEach items="${list}" var="dto">
					<tr>
						<td>
							<a href="selectone.do?id=${dto.id}">${dto.id}</a>
						</td>
						<td>${dto.name}</td>
					</tr>
				</c:forEach>
				<tr>
					<td colspan="2">
						<input type="button" onclick="location.href='insertForm.do'" value="고객 추가"/>
					</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
</body>
</html>