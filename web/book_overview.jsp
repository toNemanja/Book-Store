
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS/bookStyle.css" rel="stylesheet" type="text/css"/>
     
    </head>
    <body>
        
      <%@include file="navigation_overview.jsp" %>   
      <form action="adminAddBook" method="POST">
            <button type="submit">Add books</button>
        </form>
        <form action="ViewImageServlet" method="GET">
            <button type="submit">Show pictures</button>           
        </form>
        
        <%@include  file="genre_overview.jsp" %>
        
        <div class="grid-container">  
            <c:forEach var="book" items="${book_list}">   
                <div class="grid-item">
                    <div><img src="Images/book${book.imageId}.png" alt="book"
                      height="190px" width="150px"/></div>
                    <div class="name">${book.title}</div>
                    <div class="price">${book.price}$</div>                  
                    <div class="cart"> 
                     <form action="addToCart" method="POST">
                            <input type="hidden" value="${book.title}" name="book_title">
                            <input type="hidden" value="${book.price}" name="book_price">
                            <button type="submit" id="button-cart">Add to cart</button>
                     </form>
                    </div>   
                </div>     
            </c:forEach>                    
        </div>
     <%@include file="footer.jsp" %>   
    </body>
</html>
