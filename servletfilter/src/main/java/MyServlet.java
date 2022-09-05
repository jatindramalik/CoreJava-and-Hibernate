import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addAlien")
public class MyServlet extends HttpServlet {

    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{

        int aid = Integer.parseInt(req.getParameter("aid"));
        String aname = req.getParameter("aname");

        PrintWriter out = res.getWriter();
        out.println("welcome : " + aname);
    }
    
}
