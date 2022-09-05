<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<html>
<body>
    
<sql:setDataSource var="db" drver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/jatin" user="root" pass="password"/>
<sql:query var="rs" setDataSource="${db}>select * from alien</sql:query>
<
    
       <c:forEach items="${studs}" var="s">
                ${s.name}<br>
       </c:forEach>
</body>
</html>
