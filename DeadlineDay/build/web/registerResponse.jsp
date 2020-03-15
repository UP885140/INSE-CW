<%-- 
    Document   : registerResponse
    Created on : 06-Mar-2020, 13:21:06
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
        <jsp:useBean id="registerBean" scope="session" class="org.mypackage.handler.registerHandler" />
        <jsp:setProperty name="registerBean" property="firstName" />
        <jsp:setProperty name="registerBean" property="lastName" />
        <jsp:setProperty name="registerBean" property="email" />
        <jsp:setProperty name="registerBean" property="password" />
        <h1>Hello World!, <jsp:getProperty name="registerBean" property="firstName" />,
            <jsp:getProperty name="registerBean" property="firstName" />,
            <jsp:getProperty name="registerBean" property="lastName" />,
            <jsp:getProperty name="registerBean" property="email" />, 
            <jsp:getProperty name="registerBean" property="password" /></h1>
    </body>
</html>
