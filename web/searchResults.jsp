
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS/searchResultsStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
       <%@include file="navigation_overview.jsp" %>   
       <%@include  file="genre_overview.jsp" %>
         <div class="grid-container">  
            <c:forEach var="book" items="${searchResultList}">   
                <div class="grid-item">
                    <div class="name">${book.title}</div>
                    <div class="price">${book.price}$</div>                        
                </div>     
            </c:forEach>                    
        </div>
    </body>
</html>
