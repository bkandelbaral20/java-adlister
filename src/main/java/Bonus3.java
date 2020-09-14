import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Create a servlet that listens for POST requests to ```/order-summary``` and souts out the name of the product
// ordered by the user and the quantity. HINT: you will probably need to use the request object to get the parameters!

@WebServlet(name="Bonus3", urlPatterns = "/order-summary")
public class Bonus3 extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String product = req.getParameter("Product");
        String numberOf = req.getParameter("Quantity");


        out.println("<h1>The name of product is " + product  +
               "\n The number of product is " + numberOf +  "  </h1>");



    }
}

