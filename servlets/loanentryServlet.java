/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import userAccount.DDuserDAO;
import usersLoans.Loan;
import usersLoans.loanDAO;

/**
 *
 * @author Jack
 */
@WebServlet(name = "loanentryServlet", urlPatterns = {"/loanentry"}) //Identifier of servlet for JSP
public class loanentryServlet extends HttpServlet {

    public loanentryServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { //Post to database

        //Gets Loan column data by taking entries from JSP form
        String book_name = request.getParameter("book_name");
        String author = request.getParameter("author");
        String loanday = request.getParameter("loanday");
        String loanperiod = request.getParameter("loanperiod");
        Loan loan = new Loan(); // Creates new instance of loan (New Loan)
        
        
        //Sets the attributes of the loan object
        loan.setAuthor(author);
        loan.setBookname(book_name);
        loan.setLoanday(loanday);
        loan.setLoanperiod(loanperiod);
        loan.setUserID(0);
        
         try{
            loanDAO DAOloan = new loanDAO(); // Creates instance of Loan DAO
            DAOloan.registerLoan(loan); //Registers users loan
        } catch (Exception e) {
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
