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