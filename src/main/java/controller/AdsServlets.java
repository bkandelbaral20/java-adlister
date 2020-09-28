package controller;

import model.Ad;
import model.Ads;
import model.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdsServlets", urlPatterns = "/ads")
public class AdsServlets extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        // Use the factory to get the dao object
//        Products productsDao = DaoFactory.getProductsDao();
//        // Use a method on the dao to get all the products
//        List<Product> products = productsDao.all();
//        // Pass the data to the jsp
//        request.setAttribute("products", products);
//        request.getRequestDispatcher("/products/index.jsp").forward(request, resp);

        Ads adsDao = DaoFactory.getAdsDao();
        List<Ad> ads = adsDao.all();

        request.setAttribute("advertisement",ads);
    request.getRequestDispatcher("/ads/index.jsp").forward(request,response);

    }
}