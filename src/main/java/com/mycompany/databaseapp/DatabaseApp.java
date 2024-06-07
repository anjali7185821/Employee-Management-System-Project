/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.databaseapp;
import java.sql.*;
/**
 *
 * @author anjal
 */
public class DatabaseApp {

    public static void main(String[] args) {
                                                           
     try
     {
         Connection con=null;
         String url="jdbc:mysql://localhost:3306/db001";
         String userName="root";
         String password="";
         con=DriverManager.getConnection(url, userName, password);
         if(con!=null)
         {
         System.out.println("Database Connected");
     }   
     }
     
     catch(Exception e)
     {
       e.printStackTrace();  
     }
    

    }
}
