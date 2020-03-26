/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import userAccount.DDuser;
import usersLoans.loanDAO;

/**
 *
 * @author Jack
 */

@WebServlet(name = "loanHistoryServlet", urlPatterns = {"/loanhistory"}) //Referenced in JSP to run Servlet
public class loanHistoryServlet extends HttpServlet {
    
    
    public loanHistoryServlet(){
        super();
    }

   
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter(); //Creates a writer to output data to the webpage
        response.setContentType("text/html"); //Sets to HTML language
        
        DDuser user = new DDuser();
        
        user.getUser_id(); //Gets users ID 
       
        
        
        try{
            loanDAO loans = new loanDAO();
            String result = loans.getLoanHistory(user);
            //Gets the loan history of the user using the user_ID 
            
            out.write(result);
            //Prints loan history to screen    
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
