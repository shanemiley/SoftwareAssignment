<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<c:set var="user" value="${sessionScope.user}"/>
	<div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>user</h2></caption>
            <tr>
                <th>userId</th>
                <th>username</th>
                <th>password</th>
                <th>lastname</th>
                <th>firstname</th>
            </tr>

                <tr>
                    <td><c:out value="${user.userId}" /></td>
                    <td><c:out value="${user.username}" /></td>
                    <td><c:out value="${user.password}" /></td>
                    <td><c:out value="${user.lastName}" /></td>
                     <td><c:out value="${user.firstName}" /></td>
                </tr>

        </table>
    </div>    
		
</body>
</html>
