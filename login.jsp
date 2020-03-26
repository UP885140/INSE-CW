<%-- 
    Document   : login
    Created on : 23-Mar-2020, 11:17:40
    Author     : Jack
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title>login Page</title>
        <link rel="stylesheet" type="text/css" href="style2.css">
    </head>

    <body>

        <h1>Login Page</h1>

        <form action="<%=request.getContextPath()%>/login" method="post">
            <table>

                <tr>
                    <td>Email</td>
                    <td><input type="text" name="email" /></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" /></td>
                </tr>
            </table>
            <input type="submit" value="Login" />
        </form>
        <a href="register.jsp">Not registered? Click here!</a>


    </body>

</html>

<footer class="footer" style="margin-top:400px;">
    <p> Here is a link to our GitHub page <a href="https://github.com/" target="_top">Click Here</a> Here you can see our code. <button class="button" type="button" onclick="alert('if you need help please contact IThelp@port.ac.uk')">Help!</button></P>
</footer>




</body>

</html>