<%@ page isELIgnored="false"%>

<html>
<body>

    <%  
        response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
        if(session.getAttribute("username")==null){
            response.sendRedirect("login.jsp");
        }
    %>

<h2>Welcome ${username}</h2>

<a href="videos.jsp">Videos Here</a>

<form action="Logout">
    <input type="submit" value="Logout">
</form>

</body>
</html>