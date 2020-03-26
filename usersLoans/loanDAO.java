/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usersLoans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import userAccount.DDuser;

/**
 *
 * @author Jack
 */
public class loanDAO {
    
    public int registerLoan(Loan loan) throws ClassNotFoundException {
        String INSERT_LOAN_SQL = "INSERT INTO DDLOAN" +
            "  (loan_id, book_name, author, loanday, loanperiod, user_id) VALUES " +
            " (?, ?, ?, ?, ?,?);"; //Query to be executed with wildcards(?)

        int result = 0;

        Class.forName("org.apache.derby.jdbc.ClientDriver"); //Gets DB driver

        try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/deadlineDB?useSSL=false", "root", "root");//Creates connection to DB
            
            //Creates a prepared statement using the base query
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_LOAN_SQL)) {
            
            //Sets the values of the wildcards in the DB statement(?)
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, loan.getBookname());
            preparedStatement.setString(3, loan.getAuthor());
            preparedStatement.setString(4, loan.getLoanday());
            preparedStatement.setString(5, loan.getLoanperiod());
            
            
            //Executes statement and gets success/fail response
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        }
        return result;
    }
    
    public String getLoanHistory(DDuser user) throws ClassNotFoundException{
        String GET_LOANHISTORY_SQL = "SELECT * FROM LOAN WHERE user_id=" + user.getUser_id() ; //Query to get all of users Loan
        
        String result = null;
        
        Class.forName("org.apache.derby.jdbc.ClientDriver"); //Sets driver for DB
        
        try(Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/deadlineDB?useSSL=false", "root", "root")){ //Creates connection to DB
                
            Statement stmt = connection.createStatement(); //Creates statement 
            ResultSet rs = stmt.executeQuery(GET_LOANHISTORY_SQL); //Executes statement using parameter query
            
            while(rs.next()){ //While there are entries in table
                String book_name = rs.getString("book_name");
                String author = rs.getString("author");
                String loanday = rs.getString("loanday");
                String loanperiod = rs.getString("loanperiod");
                
                result += book_name + "\t" + author + "\t" + loanday + "\t" + loanperiod;
                //Single row of data to be returned
                
            }
            
            
            
        }catch(SQLException e){
            printSQLException(e);
        }
        
        
        return result;   
    }
    
    
    
    private void printSQLException(SQLException ex) { //SQL error method to check any erroneous output (TESTING)
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
    
}
