<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<div>
    <table>
     <thead><tr><td>编号</td><td>姓名</td></tr></thead>
     <tbody>
        <c:forEach var="item" items="${userlist }">
          <tr><td>${item.id }</td><td>${item.name}</td><tr>
        </c:forEach>
     </tbody>
    </table>
</div>
</body>
</html>