package com.siddhu.login;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.siddhu.dao.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet{

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{

        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

        LoginDao dao = new LoginDao();


        if(dao.check(uname, pass)){

            HttpSession session = request.getSession();
            session.setAttribute("username", uname);
            response.sendRedirect("welcome.jsp");
        }
        else{
            response.sendRedirect("login.jsp");
        }
        
    }
    
}
