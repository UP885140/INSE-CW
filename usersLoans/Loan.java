/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usersLoans;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Jack
 */
public class Loan implements Serializable {
    
    /*OVERVIEW OF METHOD
    
        Class Loan is an object that contains an individual loan
        the method contains get/set methods that relate to the Loan Table in
        the database.
    */
    
    private static final int loan_id = 1;
    private String bookname;
    private String author;
    private String loanday;
    private String loanperiod;
    private int user_id;

    /**
     * @return the bookname
     */
    public String getBookname() {
        return bookname;
    }

    /**
     * @param bookname the bookname to set
     */
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the loanday
     */
    public String getLoanday() {
        return loanday;
    }

    /**
     * @param loanday the loanday to set
     */
    public void setLoanday(String loanday) {
        this.loanday = loanday;
    }

    /**
     * @return the loanperiod
     */
    public String getLoanperiod() {
        return loanperiod;
    }

    /**
     * @param loanperiod the loanperiod to set
     */
    public void setLoanperiod(String loanperiod) {
        this.loanperiod = loanperiod;
    }
    
    public void setUserID(int user_ID){
        this.user_id = user_ID;
    }
    
    public int getUserID(){
        return user_id;
    }

    
}
