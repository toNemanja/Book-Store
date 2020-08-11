
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping cart</title>
        <link href="CSS/cartStyle.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/bookStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
         <%@include file="navigation_overview.jsp" %>  
       
        <div id="full-cart">
        <hr class="table-hr">
        <table style="width:100%"   id="table">
            <tr>
                <th>Title</th>
                <th>Price</th>
                <th>Amount</th>
                <th>Total</th>
            </tr>
            <c:forEach var="artical" items="${articalList}">              
                <tr>
                    <td>${artical.title}</td>
                    <td>${artical.price}</td>
                    <td><input type="text" name="artical_NumberOfOrder" value="${artical.numberOfOrder}"
                               onfocusout="myFunction(this.value,${artical.price},${artical.id},${artical.total})"></td>
                    <td>${artical.total}</td>
                <input type="hidden" value="${artical.total}" name="artical_total">
                <td> <form action="deletefromcart" method="POST">
                        <input type="hidden" value="${artical.id}" name="articalID">
                        <input type="hidden" value="${artical.price}" id="price" name="artical_price">
                        <button type="submit" id="deleteFromCart">Delete</button>
                    </form>                   
                </td>     
               
            </tr>
            
        </c:forEach> <br> 
    </table>

    <div id="total-payment">Total payment:<br>${total}<br></div>  
    <div id="testDiv" >
        <form action="book_overview.jsp">
            <button type="submit" class="cart-buttons">Back to store</button>
        </form>
        <form action="ArticalCheck">
            <button type="submit" id="checkout-button" class="cart-buttons">Checkout</button>
        </form>

    </div>
        </div>

</body>
<script>
    function myFunction(value, price, id, total) {
        document.location.href = "ArticalTotalOnChange?artical_NumberOfOrder=" + value +
                "&artical_price=" + price + "&articalID=" + id + "&artical_total=" + total;
    }
</script>
</html>
