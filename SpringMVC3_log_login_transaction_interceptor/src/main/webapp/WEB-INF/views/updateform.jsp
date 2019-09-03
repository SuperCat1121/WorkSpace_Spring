<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="updateRes.do">
		<input type="hidden" name="id" value="${dto.id}">
		<table border="1">
			<tr>
				<th>아이디</th>
				<td>${dto.id}</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="text" name="password" value="${dto.password}"></td>
			</tr>
			<tr>
				<th>이    름</th>
				<td><input type="text" name="name" value="${dto.name}"></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="수정하기">
					<input type="button" value="취소" onclick="location.href='selectone.do?id=${dto.id}'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>