/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videorental;

import java.util.Arrays;

/**
 *
 * @author Craig
 */
public class Manager {
    // Variables
    //      Account Values
    boolean loggedIn;
    boolean admin;
    String  accountName;
    String  accountEmail;
    String  accountStatus;
    int     subscriptionID;
    String     moviesRented;
    boolean autoRenew;
    //      Movie details
    int[]   movieIDs;
    String[]  subType = {"","",""};
    String[]  subCost = {"","",""};
    
    // Methods
    //      Account Methods
    public void getAccountDetails(DBComms DB) {
        String[] userDetails = DB.getUserData(accountEmail);
        Arrays.toString(userDetails);
        try {
            accountName = userDetails[0];
            accountStatus = userDetails[1];
            subscriptionID = Integer.getInteger(userDetails[2]);
            moviesRented = userDetails[4];
            autoRenew = userDetails[5].equals("true");
        } catch (Exception e) {
            System.out.println("Error Fetching Account Details");
        }
    }
    
    public void getSubscriptionDetails(DBComms DB) {
        String[] subsDetails = DB.getSubscriptions();
        try{
            int i = 0;
            int iter = 0;
            while(i < 5) {
                subType[iter] = subsDetails[i];
                subCost[iter] = subsDetails[i+1];
                i = i+2;
                iter++;
            } 
             
        }
        catch(Exception e) {
            System.out.println("Manager error: "+e);
        } 
    }
    //      Movie Methods
    public void getAllMovieIDs(DBComms DB) {
        
    }
    
    public boolean checkLogin(String uName, String pass, DBComms DB) {
        accountEmail = uName;
        boolean[] details = DB.checkLogin(uName, pass);
        loggedIn = details[0];
        admin = details[1];
        return loggedIn;
    }
}
