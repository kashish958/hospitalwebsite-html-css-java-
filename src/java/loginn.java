
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


public class loginn extends HttpServlet {

    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
    {
        String uname = req.getParameter("uname");
        String pass = req.getParameter("pass");
         
  if(uname.equals("kashish")&&pass.equals("12345"))
  {
       HttpSession session = req.getSession();
       session.setAttribute("username",uname); 
      res.sendRedirect("index.jsp");
      
  }
  else
  {
      res.sendRedirect("login.jsp");
      
  }

  //      md d= new md();
//try(PrintWriter out = res.getWriter()){ 
   
    ///Connection con = d.getc();
  // Statement st= con.createStatement();
   //st.executeUpdate("insert into fromuser(user,pass)values('"+uname+"','"+pass+"')"); 
  //out.println("every fine");
}

//catch(Exception e){
  //  System.out.print(e);
    
}




    