<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#loginchk").hide();
	});
	function login() {
		var idVal = $("#id").val();
		var pwVal = $("#pw").val();
		
		if(idVal == "" || idVal == null) {
			alert("ID를 다시 확인");
		} else if(pwVal == "" || pwVal == null) {
			alert("PW를 다시 확인");
		} else {
			$("#loginchk").show();
			$.ajax({
				type : "post",
				url : "loginajax.do",
				data : "id="+idVal+"&pw="+pwVal,
				success : function(msg) {
					alert(msg.loginchk);
					console.log(msg);
					if(msg.loginchk == true) {
						location.href="list.do";
					} else {
						document.getElementById("loginchk").innerHTML = "ID, PW를 다시 확인";
					}
				}, error : function() {
					alert("로그인 실패");
				}
			});
		}
	}
</script>
</head>
<body>

	<h1>LOGIN</h1>
	<form action="">
		<table>
			<tr>
				<th>ID</th>
				<td><input type="text" id="id"></td>
			</tr>
			<tr>
				<th>PW</th>
				<td><input type="text" id="pw"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="Login" onclick="login()"></td>
			</tr>
			<tr>
				<td colspan="2" align="center" id="loginchk"></td>
			</tr>
		</table>
	</form>
</body>
</html>