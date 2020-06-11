/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swagG;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kashish
 */
public class md {
 Connection con;
 public Connection getc() throws ClassNotFoundException, SQLException
 {
     try{
    Class.forName("com.mysql.jdbc.Driver");    //this is method which register the deriver//  
  
  
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Demo12345");
  
       
 }
     catch(Exception e )
     {
         System.out.println(e);
     }
     return con;
}
}
