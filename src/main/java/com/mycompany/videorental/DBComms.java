/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.videorental;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSetMetaData;
/**
 *
 * @author b3nst
 */
public class DBComms {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    String msAccDB = "../VideoRentalDB.accdb";
    String dbURL = "jdbc:ucanaccess://" + msAccDB;
    
    public DBComms() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch(ClassNotFoundException cnfex) {
            System.out.println("Problem in loading or "
                            + "registering MS Access JDBC driver" );
            cnfex.printStackTrace();
        }
    }
    ResultSet getTable(String tableName) throws SQLException { // Method to get all entries for a table
            String sqlStr = "Select * from "+tableName;
            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlStr);
            
            return resultSet;
        } 

        
    
 }

