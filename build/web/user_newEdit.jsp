
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS/userStyle.css" rel="stylesheet" type="text/css"/>      
    </head>
    <body>
        <%@include file="navigation_overview.jsp" %>  
        <div id="user-form-div">
            <label id="userNewEdit-h2">Enter your personal information</label><br>
            <form action="createuser" method="POST" id="user-form">
                 <div class="user-input-div">
                <label>First Name:</label>  <br>
                <input type="text" value="${firstName}" name="firstName"
                       size="310" class="user-input" required> <br>
                 </div>
                <div class="user-input-div">
                    <label>Last Name:</label> <br> 
                    <input type="text" value="${lastName}" name="lastName" 
                           size="310" class="user-input"  required> <br>
                </div>
                           <div class="user-input-div">
                <label>City:</label> <br> 
                <input type="text" value="${city}" name="city"
                       size="310" class="user-input" required> <br>
                           </div>
                <div class="user-input-div">
                    <label>Address:</label> <br> 
                    <input type="text" value="${adress}" name="adress"
                           size="310"  class="user-input" required> <br>
                </div>
                <div class="user-input-div">
                    <label>Phone:</label> <br> 
                    <input tpe="text" value="${phone}" name="phone" 
                           size="310" class="user-input" required> <br>
                </div >
                <div id="userNewEdit-buttons"> 
                    <button type="submit" id="next-userNewEdit-button">Next</button>
                    <button type="submit" id="back-userNewEdit-button">Back</button>
                </div>
            </form>

        </div>
    </body>
</html>
