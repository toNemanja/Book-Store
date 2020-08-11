package servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import userOrderDAO.UserOrderDAO;

public class CreateUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String city = request.getParameter("city");
        String adress = request.getParameter("adress");
        int phone = Integer.parseInt(request.getParameter("phone"));
        UserOrderDAO.insertUserOrder(firstName, lastName, city, adress, phone);     
        RequestDispatcher rd = request.getRequestDispatcher("userorderservlet");
        rd.forward(request, response);

    }

}
