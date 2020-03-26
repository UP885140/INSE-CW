/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userAccount;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jack
 */
public class DDuserDAO {
    
    public int registerUser(DDuser user) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO DDUSER" +
            "  (user_id, first_name, last_name, email, password) VALUES " +
            " (?, ?, ?, ?, ?);";
        //SQL statement to insert user with ? as wildcards
        
        
        int result = 0;

        Class.forName("org.apache.derby.jdbc.ClientDriver"); //Sets the driver

        try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/deadlineDB?useSSL=false", "root", "root"); //Creates connection to database

            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) { //Creates a prepared statement using the base statement
            
            //Sets the values of the wildcards in the DB statement(?)
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, user.getFirstname());
            preparedStatement.setString(3, user.getLastname());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getPassword());
            
           
            result = preparedStatement.executeUpdate(); //Executes statement and gets success/fail response

        } catch (SQLException e) {
            printSQLException(e);
        }
        return result;
    }
    
    public boolean validateLogin(DDuserLogin login) throws ClassNotFoundException {
        boolean status = false;

        Class.forName("org.apache.derby.jdbc.ClientDriver");//Sets the driver

        try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/deadlineDB?useSSL=false", "root", "root");

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM login WHERE email = ? AND password = ? ")) {//Creates a prepared statement
            
            //Sets the values of the wildcards in the DB statement(?)
            preparedStatement.setString(1, login.getEmail());
            preparedStatement.setString(2, login.getPassword());
            
            
            //Prints out statement(Testing)
            //System.out.println(preparedStatement);
            
            
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next(); //Executes the query and searches the database for the query data and the return if data exists or not

        } catch (SQLException e) {
            printSQLException(e);
        }
        return status;
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
