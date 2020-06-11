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


public class myservlet extends HttpServlet {

    /**
     *
     * @param req
     * @param res
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
    {
        // service method name is necessary        
    int i = Integer .parseInt( req.getParameter("one"));
        int j = Integer .parseInt( req.getParameter("two"));
     int k = i+j;
  
  
   

Cookie cookie=new Cookie("k",k + "");  //+""is a shortcut for converting int into string
res.addCookie(cookie);
res.sendRedirect("sq");
//request dispatcher is a interface//this is for getting servlet from another servlet
//RequestDispatcher rd= req.getRequestDispatcher("sq");
//rd.forward(req,res);
    }

}

    


