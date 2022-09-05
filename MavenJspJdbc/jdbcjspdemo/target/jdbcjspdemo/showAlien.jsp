<%@ page import="com.jua.web.model.Alien"%>

<html>
<body>
       <%
            Alien a =(Alien)session.getAttribute("alien");
            out.println(a);
       %>
</body>
</html>