/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import userAccount.DDuser;
import userAccount.DDuserDAO;

/**
 *
 * @author Jack
 */
public class registerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        //Gets attributes for user from the JSP form 
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        
        //Creates new user and sets the attributes of the user
        DDuser user = new DDuser();
        user.setEmail(email);
        user.setFirstname(firstName);
        user.setLastname(lastName);
        user.setPassword(password);
        
        
        try{
            
            //Attempts to register the user
            DDuserDAO userreg = new DDuserDAO();
            userreg.registerUser(user);
        } catch (Exception e) {
            //Error, user not added successfully
            e.printStackTrace();
        }
        //Returns the user to personalised homepage if registration is successful
        response.sendRedirect("home.jsp");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
