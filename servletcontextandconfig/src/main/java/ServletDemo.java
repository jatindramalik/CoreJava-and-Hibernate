import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet{

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{

        ServletConfig config = getServletConfig();
        String str = config.getInitParameter("name");

        PrintWriter out = response.getWriter();
        out.println("Hiii  :" +str);
    }
    
}
