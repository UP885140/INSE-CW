<%-- 
    Document   : register
    Created on : 24-Mar-2020, 13:56:20
    Author     : Jack
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <form action="<%= request.getContextPath() %>/register" method="post">
            <table>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="first_name" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="last_name" /></td>
                </tr>

                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td>Confirm Password</td>
                    <td><input type="confirmpass" name="password" /></td>
                </tr></table>
        </tr>
    </table>

    <input type="submit" value="Submit">
</form>

</body>
</html>
