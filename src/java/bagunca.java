import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/calcul"})
public class bagunca extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       float mie1 = Float.parseFloat(request.getParameter("merda1"));
       float mie2 = Float.parseFloat(request.getParameter("merda2"));
       String mie3 = request.getParameter("merda3");
       String mie4 = request.getParameter("merda4");
       
       float continha = mie1 * mie2;
       
       request.setAttribute("mimi1", continha);
       request.setAttribute("mimi2", mie2);
       request.setAttribute("mimi3", mie3);
       request.setAttribute("mimi4", mie4);
       
       request.getRequestDispatcher("matutu.jsp").forward(request, response);
       }
}
