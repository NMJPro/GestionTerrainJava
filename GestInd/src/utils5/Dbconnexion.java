/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author axel tsotie
 */
public class Dbconnexion {
    private static Connection con=null;
       public static Connection getConnection(String log,String pass )throws ClassNotFoundException {
      try{
                   Class.forName("com.mysql.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/locationterrain";
                    con = DriverManager.getConnection(url,log,pass);
         }catch(SQLException exp){
                exp.printStackTrace();
                }
        return con;
    }
       public static Connection getConnection()throws ClassNotFoundException {
      try{
                   Class.forName("com.mysql.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/ventesdb";
                    con = DriverManager.getConnection(url,"root","");
         }catch(SQLException exp){
                exp.printStackTrace();
                }
        return con;
    }
}
