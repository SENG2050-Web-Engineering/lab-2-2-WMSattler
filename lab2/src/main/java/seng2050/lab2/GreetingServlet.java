package seng2050.lab2;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException{

        String first = req.getParameter("firstName");
        String last = req.getParameter("lastName");

        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang=\"en\">");
        out.println("<head>");
        out.println("<title>Greeting</title>");
        out.println("</head>");
        out.println("<body>");
        
        if (first == null || last == null){
            out.println("<h1>Missing parameters!</h1>");

        }
        else {
            out.println("<h1>Welcome " + first + " " + last + "!</h1>");

        }
        
        out.println("</body>");
        out.println("</html>");
    }
}
