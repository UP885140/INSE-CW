<%-- 
    Document   : loginResponse
    Created on : 13-Mar-2020, 13:09:59
    Author     : up885140
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="loginBean" scope="page" class="org.mypackage.handler.loginHandler" />
        <jsp:setProperty name="loginBean" property="email"/>
        <jsp:setProperty name="loginBean" property="password" value="" />
        <h1>Hello World!,
            <jsp:getProperty name="loginBean" property="email" />
            <jsp:getProperty name="loginBean" property="password" />
        </h1>
    </body>
</html>
