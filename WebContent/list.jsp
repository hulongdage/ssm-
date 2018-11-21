<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>listAll</title>
</head>
<body>
<c:forEach items="userList" varStatus="s">
	${userList[s.index].userName }
	<hr>
	${userList[s.index].userId }
	<hr>
	${userList[s.index].userPassword }
</c:forEach>
</body>
</html>