/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.myhandler.userAccount;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author up885140
 */
public class loginVerify {
    
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.driver";
    static final String DB_URL = "TODO";

    static final String USER = "INSE";
    static final String PASS = "Group7";
    
    public loginUser checkLogin(String email, String password) throws SQLException,ClassNotFoundException{
        
        
        Class.forName(JDBC_DRIVER);
        Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
        String query = "SELECT * FROM USERS WHERE email= ? and password = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, email);
        stmt.setString(2, password);
        
        ResultSet rs = stmt.executeQuery();
        
        loginUser user = null;
        
        if(rs.next()){
            user = new loginUser();
            user.setFirstname(rs.getString(first_name)); //Error till DB fully created
            user.setLastname(rs.getString(last_name));
            
        }
        
    }
    
}
