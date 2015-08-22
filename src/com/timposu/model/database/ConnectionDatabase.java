/*
* dibuat oleh Ucup Timposu
* Blog: www.timposu.com
* Email : ucup.timposu@gmail.com
* Silahkan kode ini dipelajari dan dikembangkan..
*
**/

package com.timposu.model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ucup
 */
public class ConnectionDatabase {
    
    private static Connection connection;
    
    public static Connection getConnection(){
        
        if (connection == null){
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
               
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/latihan","ucup","xxxxxx");
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
        }
        
    return connection;
    }
    
    public static void main(String[] args) {
        
      ConnectionDatabase.getConnection();
    }

}
