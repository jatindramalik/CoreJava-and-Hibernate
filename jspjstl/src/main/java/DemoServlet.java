import java.io.IOException;

import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        List<Student> students = Arrays.asList(new Student(1, "jatin"),new Student(2, "jua"),new Student(3, "siddhu"));
        

        request.setAttribute("studs", students);

        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
    
}
