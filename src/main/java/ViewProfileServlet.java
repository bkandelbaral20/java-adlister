import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        creating session
        HttpSession session = request.getSession();
        boolean login = Objects.isNull(session.getAttribute("user"));
        if (login) {
            response.sendRedirect("/login");
        } else {
            request.getRequestDispatcher("/profile.jsp").forward(request, response);
        }

    }
}
