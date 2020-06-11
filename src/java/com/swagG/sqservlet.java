package com.swagG;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class sqservlet extends HttpServlet {

    /**
     *
     * @param req
     * @param res
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException ,ServletException 
    {   int k =0;
Cookie coco[]= req.getCookies();  //as this is giving cookies so we have to make an array of cookie

for(Cookie c : coco)
{
    if(c.getName().equals("k"))
        k= Integer.parseInt(c.getValue());
}
//int k = (int)req.getAttribute("k");
k=k*k;
  res.getWriter().print("Result :"+k);
}

    
}

