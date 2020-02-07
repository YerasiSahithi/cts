package dispatcher;

import java.io.IOException;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  


/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {  
	  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("userName");  
    String p=request.getParameter("userPass");  
          
    if(p.equals("servlet"))
    		{  
        RequestDispatcher rd=request.getRequestDispatcher("welcome");  
        rd.forward(request, response);  
    }  
    else{  
        out.print("Sorry UserName or Password Error!");  
        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
        rd.include(request, response);  
                      
        }  
    }  
  
}  
