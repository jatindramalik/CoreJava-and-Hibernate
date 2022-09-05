package com.jua.web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jua.web.dao.AlienDao;
import com.jua.web.model.Alien;

@WebServlet("/getAlien")
public class GetAlienController extends HttpServlet{

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{

        int aid =Integer.parseInt(request.getParameter("aid"));
        AlienDao dao = new AlienDao();
        Alien a = dao.getAlien(aid);

        HttpSession session = request.getSession();
        session.setAttribute("alien", a);
        response.sendRedirect("showAlien.jsp");
        
    }
    
}
