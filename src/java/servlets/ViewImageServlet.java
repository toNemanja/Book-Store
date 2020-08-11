package servlets;

import application.Image;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import imageDAO.ImageSelect;

@WebServlet(name = "ViewImageServlet", urlPatterns = {"/ViewImageServlet"})
public class ViewImageServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        session.setAttribute("imageList", ImageSelect.selectImages());
        RequestDispatcher rd = request.getRequestDispatcher("book_overview_1.jsp");
        rd.forward(request, response);
    }

}
