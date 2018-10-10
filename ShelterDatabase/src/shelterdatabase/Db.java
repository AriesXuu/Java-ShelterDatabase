/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shelterdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Ciaran
 */
public class Db {
    static private Connection c;
    
    public static Connection getCon() throws Exception{
        if (c == null){
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/shelterdb","root","xuyeqii");
        }
        return c;
    }
        public static void setDate (String s) throws Exception{
        Db.getCon().createStatement().executeUpdate(s);
        }
        
        public static ResultSet getDate(String sq) throws Exception{
            return Db.getCon().createStatement().executeQuery(sq);
        }
}
