<%@ page import="java.sql.*"%>

<html>
<body>
        101<br>
        Gugly<br>
        47
        <%
          String url = "jdbc:mysql://localhost:3306/jatin";
          String uname = "root";
          String pass = "password";
          String sql = "select * from alien where aid=106";
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url,uname,pass);
          Statement st = con.createStatement();

          ResultSet rs = st.executeQuery(sql);
          rs.next();
        %>
        Aid :<%= rs.getString(1) %><br>
        Name :<%= rs.getString(2) %><br>
        Tech :<%= rs.getString(3) %>
</body>
</html>
