import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// 2. Create a servlet that returns a simple form if the user navigates to ```/order-form```. In servering up HTML,
//        you may need to include ```response.setHeader("content-type", "text/html");```. The form should include an input
//        for the name of a product and an input for how many of the product they want to order. The method of the form
//        should be ```POST``` and the action should be ```/order-summary```.

@WebServlet(name = "UserForm", urlPatterns = "/order-form")
public class UserForm extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        res.setHeader("content-type", "text/html");
        PrintWriter out = res.getWriter();

        out.println("<form action= \"order-summary\"  method= \"POST \"> " +
                "  \n" +
                "Product:<input type=text name=\"Product\"/><br/><br/>  \n" +
                "Quantity:<input type=text name=\"Quantity\"/><br/><br/>  \n" +
                "  \n" +
                "<input type=\"submit\" value=\"submit\"/>  \n" +
                "  \n" +
                "</form>  ");
    }
}