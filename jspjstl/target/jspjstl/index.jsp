<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
    
    
       <c:forEach items="${studs}" var="s">
                ${s.name}<br>
       </c:forEach>
</body>
</html>
