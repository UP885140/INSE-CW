/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userAccount;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Jack
 */
public class DDuserLogin implements Serializable {
    
    
    /*OVERVIEW OF METHOD
    
        Method DDuserLogin is an object that stores the users core login details
        to make accessability to the database less complex
        the method contains get/set methods that relate to the DDuser Table in
        the database.
    */
    
    private static final long user_id =1;
    private String email;
    private String password;
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
