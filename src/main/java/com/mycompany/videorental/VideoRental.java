/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.videorental;

/**
 *
 * @author Craig Doyle
 * @author Ben Stobie
 */
public class VideoRental {

    public static void main(String[] args) {
        // Set All Variables
        MainApp MA = new MainApp();
        LoginForm LF = new LoginForm(null ,false);
        DBComms DB = new DBComms();
        Manager MG = new Manager();
        // Start through login Form
        LF.main(args, MG, DB, MA);
        
        
    }
}
