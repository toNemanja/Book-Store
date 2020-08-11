
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS/userOrderStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <%@include file="navigation_overview.jsp" %>   
    <body>


        <h2 class="order-title-h2">Your order</h2>
        <table style="width:100%"  
            cellpadding="0" cellspacing="0"  id="table" class="order-tables">
            <tr>
                <th>Title</th>
                <th>Price</th>
                <th>Amount</th>
                <th>Total</th>
            </tr>
              <c:forEach var="artical" items="${ArticalList}">
                  <tr>
                <td>${artical.bookTitle}</td>
                <td>${artical.bookPrice}</td>
                <td>${artical.numberOfOrder}</td>
                <td>${artical.totalPerBook}</td> 
                  
                </tr>              
        </c:forEach>
        </table>      
        <h2 class="order-title-h2">Your delivery info</h2>
        <table style="width:100%"  border="0"
               cellpadding="0" cellspacing="0" bordercolor='#ffffff' class="order-tables">
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>City</th>
                <th>Address</th>
                <th>Phone</th>
            </tr>

            <c:forEach var="users" items="${UserList}">
                <tr>
                    <td>${users.firstName}</td>
                    <td>${users.lastName}</td>
                    <td>${users.city}</td>
                    <td>${users.adress}</td>
                    <td>${users.phone}</td>
                </tr>
            </c:forEach>
        </table>
         <div id="user-order-buttons">
        <form action="ConfirmOrderServlet" method="GET">
            <button type="submit" id="confirm-order-button">Confirm order</button>
        </form>
             <form action="CancelOrder" method="GET">
                 <button type="submit" id="cancel-order-button">Cancel order</button>
             </form>
        
        </div>
         <%@include file="footer.jsp" %>  
    </body>
</html>
