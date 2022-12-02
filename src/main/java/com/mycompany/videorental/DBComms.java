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
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Ben Stobie
 * @author Craig Doyle
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
    
    public String[][] getAllData(String tableName) {
        try {
            int length = getTableLength(tableName);
            ResultSet data = getTable(tableName);
            ResultSetMetaData meta = data.getMetaData();
            
            String[][] finalString = new String[length][];
            int i = 0;
            int cols = meta.getColumnCount();
            while(data.next()) {
                finalString[i] = new String[cols];
                for(int j = 1; j <= cols; j++) {
                    finalString[i][j - 1] = data.getString(j);
                }
                i++;
            }
            return finalString;
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return new String[][] {};
    }
    
    public int deleteItemByID(int ID, String tableName) {
        try{
            String sqlStr = "DELETE FROM "+tableName+" WHERE ID="+ID;
            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            return statement.executeUpdate(sqlStr);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return -1;
    }
    
    public String[] getUserData(String email) {
            try {
                String sqlStr = "SELECT * FROM Accounts WHERE email='"+email+"'";
                connection = DriverManager.getConnection(dbURL);
                statement = connection.createStatement();
                resultSet = statement.executeQuery(sqlStr);
                if(resultSet.next()) {
                    return new String[] {
                        resultSet.getString("ID"),
                        resultSet.getString("accountName"),
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
    
    public boolean[] checkLogin(String uName, String pass) {
            try {
                String sqlStr = "SELECT * FROM Accounts WHERE email='"+uName+"' AND password='"+pass+"'";
                connection = DriverManager.getConnection(dbURL);
                statement = connection.createStatement();
                resultSet = statement.executeQuery(sqlStr);
                if(resultSet.next()) {
                    return new boolean[] {
                        true,
                        resultSet.getBoolean("admin")
                    };
                }
            } catch(SQLException e) {
                System.out.println(e);
            }
            return new boolean[] {false , false};
    }
    
    public void addUser(String email, String name, String password) {
        try {
            String sqlStr = "INSERT INTO Accounts (accountName, email, password, subscriptionID, moviesRented, autoRenew, accountStatus) VALUES ('"+name+"', '"+email+"', '"+password+"', 4, '', 'false', 'none')";
            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            statement.executeUpdate(sqlStr);  
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    int getTableLength(String table) {
            int result = 0;
            try {
                String sqlStr = "SELECT COUNT(*) FROM "+table;
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
   
    public void addMovie(String[] movie) {
        try {
            String sqlStr = "INSERT INTO Movies (length, name, genre, description, rating) VALUES ("+movie[0]+", '"+movie[1]+"', '"+movie[2]+"', '"+movie[3]+"', "+movie[4]+")";
            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
            statement.executeUpdate(sqlStr);  
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
   public String[] getSubscriptions() {
       try {
           String sqlStr = "SELECT * FROM Subscriptions WHERE NOT ID = 4";
           connection = DriverManager.getConnection(dbURL);
           statement = connection.createStatement();
           resultSet = statement.executeQuery(sqlStr);
           String[] buffer = {"","","","","",""};
           int i = 0;
           while (resultSet.next()) {
                   buffer[i] = resultSet.getString("subscriptionType");
                   buffer[i+1] = resultSet.getString("subscriptionCost");
                   i = i + 2;
           }
           return buffer;
       }
       catch(Exception e){
           System.out.println("Database Error: "+e);
       }
       return new String[] {};
   } 
   
   public String getSubNameByID(String id) throws SQLException {
       String sqlStr = "SELECT subscriptionType FROM Subscriptions WHERE ID = "+id;
       connection = DriverManager.getConnection(dbURL);
       statement = connection.createStatement();
       resultSet = statement.executeQuery(sqlStr);
       if(resultSet.next()){
           return "Subscription type: "+ resultSet.getString("subscriptionType");
       }
       else if("4".equals(id)) {
           return "Not Subscribed";
       }
       else {
           return "subscription ID error";
       }

   }
   
   public boolean checkMovie(String userIn) throws SQLException {
       String sqlStr = "SELECT name FROM Movies";
       connection = DriverManager.getConnection(dbURL);
       statement = connection.createStatement();
       resultSet = statement.executeQuery(sqlStr);
       ArrayList movies = new ArrayList();
       while (resultSet.next()) {
           movies.add(resultSet.getString("name"));
       }   
        for (Iterator it = movies.iterator(); it.hasNext();) {
            if (userIn.equals((String) it.next())){
                System.out.println("Match Found");
                return true;               
            }
        }
        return false;
   }
   
   public void rentMovie(String moviesRented, String userIn, String accountID) throws SQLException{
       String updateStr = moviesRented+userIn+" | ";
       String sqlStr = "UPDATE Accounts SET moviesRented = "+"'"+updateStr+"'"+" WHERE ID = "+accountID;
       System.out.println(sqlStr);
       connection = DriverManager.getConnection(dbURL);
       statement = connection.createStatement();
       statement.executeUpdate(sqlStr);
   }
   
   public void subscribe(int id, String accountName) throws SQLException {
       String sqlStr = "UPDATE Accounts SET subscriptionID ="+id+" WHERE ID = "+accountName;
       connection = DriverManager.getConnection(dbURL);
       statement = connection.createStatement();
       statement.executeUpdate(sqlStr);
   }
}
