<%@page import="kr.or.ddit.user.model.UserVO"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>JSP</title>

<!-- css / js -->
<%@include file="/common/basicLib.jsp" %>

</head>

<body>
	<!-- header -->
   	<%@include file="/common/header.jsp" %>
   
   
<div class="container-fluid">
      <div class="row">
         
	<!-- left -->
	<%@include file="common/left.jsp" %>

<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            

<div class="blog-header">
   <h1 class="blog-title">Main</h1>
   <p class="lead blog-description">Jsp / Spring</p>
</div>

<div class="row">

   <div class="col-sm-8 blog-main">

      <div class="blog-post">
         <h2 class="blog-post-title">JSP</h2>
         <p class="blog-post-meta">
            2017.10.30, room 201
         </p>

         <p>jsp를 통한 웹 프로그래밍 학습</p>
         <hr>
        <div class="col-sm-8 blog-main">
						<h2 class="sub-header">게시판 현황</h2>			
						
						<div class="table-responsive">
							<table class="table table-striped">
								<tr>
									<th>NO.</th>
									<th>게시판명</th>
									<th>게시판 생성자</th>
									<th>생성일시</th>
								</tr>

<%-- 								<c:forEach items="${userList }" var="user" varStatus="status"> --%>
<%-- 									<tr class="userTr" data-userid="${user.userId }"> --%>
<%-- 										<td class="userId">${status.index}/${status.count}/${user.userId }</td> --%>
<%-- 										<td>${user.name }</td> --%>
<%-- 										<td>${user.alias }</td> --%>
<!-- 										<td></td> -->
<!-- 									</tr> -->
<%-- 								</c:forEach> --%>

							</table>
						</div>
      </div>
   </div>
   <!-- /.blog-main -->
</div>   </div>
      </div>
   </div>
</body>
</html>