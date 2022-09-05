<html>
<body>

    <% 
    response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
        if(session.getAttribute("username")==null){
            response.sendRedirect("login.jsp");
        }
    %>
<h2>Hello There is no more videos</h2>
</body>
</html>