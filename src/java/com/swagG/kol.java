package com.swagG;


import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.Statement;


public class kol extends HttpServlet {

    
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
    {
        String name = req.getParameter("name");
        String mobile = req.getParameter("mobile");
                 String mail = req.getParameter("mail");
        String comment = req.getParameter("comment");

  
        md d= new md();
try(PrintWriter out = res.getWriter()){ 
   
    Connection con = d.getc();
   Statement st= con.createStatement();
   st.executeUpdate("insert into appoint(name,mail,mobile,comment)values('"+name+"','"+mail+"','"+mobile+"','"+comment+"')"); 
  out.println("Dont worry your appointment has been booked ");
}

catch(Exception e){
    System.out.print(e);
    
}
}



    }