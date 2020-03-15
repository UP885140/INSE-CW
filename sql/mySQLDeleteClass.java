/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author up885140
 */
public class mySQLDeleteClass {

    static final String JDBC_DRIVER = "com.mysql.jdbc.driver";
    static final String DB_URL = "TODO";

    static final String USER = "INSE";
    static final String PASS = "Group7";

    public static void deleteStatement(String dbquery, int queryType) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");  //Error

            conn = DriverManager.getConnection(DB_URL, USER, PASS); //Conection Stage

            //Query Stage
            String query = dbquery;
            ResultSet rs = stmt.executeQuery(query);

            //Data Stage
            while (rs.next()) {
                switch (queryType) {
                    case 1:
                        break;
                    case 2:
                        break;
                }
            }

            rs.close();

            //Error Handling
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ep) {
            ep.printStackTrace();
        } //Close Stage
        finally {
            try {
                if (stmt != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
