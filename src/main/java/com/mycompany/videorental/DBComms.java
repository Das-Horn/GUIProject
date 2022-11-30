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
    String msAccDB = "./VideoRentalDB.accdb";
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
    public ResultSet getTable(String tableName) throws SQLException { // Method to get all entries for a table
            String sqlStr = "Select * from "+tableName;
            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlStr);
            
            return resultSet;
    } 
    
    public String[] getUserData(String email) {
            try {
                String sqlStr = "SELECT * FROM Accounts WHERE email='"+email+"'";
                connection = DriverManager.getConnection(dbURL);
                statement = connection.createStatement();
                resultSet = statement.executeQuery(sqlStr);
                if(resultSet.next()) {
                    return new String[] {
                        resultSet.getString("accountName"),
                        resultSet.getString("accountStatus"),
                        resultSet.getString("subscriptionID"),
                        resultSet.getString("email"),
                        resultSet.getString("moviesRented"),
                        resultSet.getString("autoRenew"),
                    };
                }
            } catch(SQLException e) {
                System.out.println(e);
            }
            return new String[] {};
    }
    
    public boolean checkLogin(String uName, String pass) {
            try {
                String sqlStr = "SELECT * FROM Accounts WHERE email='"+uName+"' AND password='"+pass+"'";
                connection = DriverManager.getConnection(dbURL);
                statement = connection.createStatement();
                resultSet = statement.executeQuery(sqlStr);
                if(resultSet.next()) {
                    return true;
                }
            } catch(SQLException e) {
                System.out.println(e);
            }
            return false;
    }
    
    public void addUser(String email, String name, String password) {
        try {
            String sqlStr = String.format("INSERT INTO Accounts (accountName, email, password, subscriptionID, moviesRented, autoRenew) Values('%s','%s', '%s',1,'','false')", name, email, password);
            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            statement.executeQuery(sqlStr);  
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
        
    ResultSet getMovies() {
            try {
                String sqlStr = "SELECT * FROM Movies";
                connection = DriverManager.getConnection(dbURL);
                statement = connection.createStatement();
                resultSet = statement.executeQuery(sqlStr);
            } catch (SQLException e) {
                System.out.println(e);
            }
            return resultSet;
    }
    
    int getMoviesLength() {
            int result = 0;
            try {
                String sqlStr = "SELECT COUNT(*) FROM Movies";
                connection = DriverManager.getConnection(dbURL);
                statement = connection.createStatement();
                resultSet = statement.executeQuery(sqlStr);
                resultSet.next();
                result = resultSet.getInt(1);
            } catch (SQLException e) {
                System.out.println(e);
            }
            return result;
    }
}
