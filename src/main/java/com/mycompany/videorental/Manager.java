/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videorental;

/**
 *
 * @author Craig
 */
public class Manager {
    // Variables
    //      Account Values
    boolean loggedIn;
    String  accountName;
    String  accountEmail;
    String  accountStatus;
    int     subscriptionID;
    int     moviesRented;
    boolean autoRenew;
    //      Movie details
    int[]   movieIDs;
    
    // Methods
    //      Account Methods
    public void getAccountDetails(DBComms DB) {
        // TODO Get Account Details and set them
    }
    //      Movie Methods
    public void getAllMovieIDs(DBComms DB) {
        
    }
    
    public boolean checkLogin(String uName, String pass, DBComms DB) {
        return DB.checkLogin(uName, pass);
    }
}
