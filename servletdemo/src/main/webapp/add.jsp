<%page import="java.sql.Statement,java.util.Random" %>

<%page import="java.util.ArrayList"%>
<%page include file="header.jsp"%>


<html>
<body bgcolor="green">
        <%
            int i = Integer.parseInt(request.getParameter("num1"));
            int j = Integer.parseInt(request.getParameter("num2"));

            int k = i + j;

            out.println("Output is : "+k);
            
            
        %>
        
</body>
</html> 