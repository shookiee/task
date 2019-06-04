<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

</head>
<body>
	<form id="addBoardFrm" action="${pageContext.request.contextPath }/addBoard" method="post">
		<label>게시판 이름</label>
		<input type="text" id="boardName" name="boardName">
		<select class="use_yn" name="use_yn">
			<option class="use_yes" name="use_yes">사용</option>
			<option class="use_no" name="use_no">미사용</option>
		</select>
		<input type="submit" value="생성">
	</form>
	
</body>
</html>