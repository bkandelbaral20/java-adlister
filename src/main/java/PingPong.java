
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//  4. Create a servlet that listens for requests to ```/ping``` and a servlet that listens for requests to
//        ```/pong```. The former servlet should simply return a link that sends a request to the latter, and vice versa!
//        If successfully built, the user should be able to cycle back and forth between two pages by clicking on
//        a ```PING!``` or ```PONG!``` link.


@WebServlet(name="PingPong", urlPatterns = "/hello")
public class PingPong extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String ping1 = req.getParameter("<a href =\"url\"> Ping <a>");
        String pong2 = req.getParameter("<a href =\"url\"> Pong <a>");

        out.println("<h1> Hello " + ping1 + pong2 + " </h1>");
    }
}



