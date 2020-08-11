
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book store</title>
        <link href="CSS/homeStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file="navigation_overview.jsp" %>   
       
       <h3 class="home-titles">Recently added</h3>
        <div class="flex-div">
            
            <c:forEach var="book" items="${bookList}">
                <div id="try">
                <div><img src="Images/book${book.imageId}.png" alt="book"
                      height="190px" width="150px"/></div>
                <div id="book-title">${book.title}</div>
                <div id="price">${book.price}$</div> 
                </div>
            </c:forEach>           
        </div>
        <form action="BookOverview" method="GET">
            <button type="submit" id="see-more-button">See more</button>
        </form>
         <hr class="hr-home">
       
       <h3 class="home-titles">Top sellers</h3>
         <div class="flex-div">            
            <c:forEach var="book" items="${bookList}">
                <div>
                <div><img src="Images/book${book.imageId}.png" alt="book"
                      height="190px" width="150px"/></div>
                <div id="book-title">${book.title}</div>
                <div id="price">${book.price}$</div> 
                </div>
            </c:forEach>           
        </div>
        <form action="BookOverview" method="GET">
            <button type="submit" id="see-more-button">See more</button>
        </form>
         <hr class="hr-home">
        <div id="paralax" style="height:500px;background-color:red;font-size:36px"> 
            <p id="inPara">Scroll Up and Down this page to see the parallax scrolling effect.
            This div is just here to enable scrolling.
            Tip: Try to remove the background-attachment property to remove the scrolling effect.</p>
        
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
