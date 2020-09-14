
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

///1.Create a servlet that returns your first and last name in a heading element to the user if navigating to ```/name```.
@WebServlet(name = "BonusServlet", urlPatterns = "/name")
public class BonusServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String firstName = "Binjita";
        String lastName = " Kandel Baral";

        out.println("<h1> Hello, my name is " + firstName + lastName + "  </h1>");
    }
}




//        4. Create a servlet that listens for requests to ```/ping``` and a servlet that listens for requests to
//        ```/pong```. The former servlet should simply return a link that sends a request to the latter, and vice versa!
//        If successfully built, the user should be able to cycle back and forth between two pages by clicking on
//        a ```PING!``` or ```PONG!``` link.

