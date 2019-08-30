<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객 추가</title>
</head>
<body>
	<form action="insertRes.do" method="post">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id" placeholder="아이디를 입력하세요"/></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="password" placeholder="비밀번호를 입력하세요"/></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" placeholder="이름을 입력하세요"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="추가하기"/>
					<input type="button" onclick="location.href='list.do'" value="목록"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>