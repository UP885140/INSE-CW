/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import userAccount.DDuserDAO;
import userAccount.DDuserLogin;

/**
 *
 * @author up885140
 */
@WebServlet(name = "userloginServlet", urlPatterns = {"/login"})
public class loginServlet extends HttpServlet {
    
    public loginServlet(){
        super();
    }
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        //Gets email and password from JSP form 
        String email = request.getParameter("username");
        String password = request.getParameter("password");
        
        
        DDuserLogin login = new DDuserLogin();
        
        //Sets attributes of the users Login details
        login.setEmail(email);
        login.setPassword(password);
        
        
        try{
            DDuserDAO userDAO = new DDuserDAO();
            if(userDAO.validateLogin(login)){ // If users login exists in database
                response.sendRedirect("home.jsp"); //Redirects to personalised JSP
            }else{
                HttpSession session = request.getSession(); //Gets current session of Login page to display error message
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        
       
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
