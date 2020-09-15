
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
