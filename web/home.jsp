<%-- 
    Document   : home
    Created on : 14/08/2015, 09:59:21
    Author     : 31240550
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bem vindo  
            <c:out value = "$(username)"></c:out>
        </h1>
    </body>
</html>
