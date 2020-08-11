
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS/navigationStyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="logo-div">
            <img src="Images/logo-makart.png" alt="logo" width="150" height="100"/>  
            <form action="Search" method="GET" id="search-form">
                <input type="search" placeholder="Search" name="searchInput" size="80" id="search-input">
                <button type="submit" id="search-button">Search</button>
                <img src="Images/mail.png" alt="email" width="32" height="20" id="search-image-mail"/>
                <p id="mail-p">makart-books@makart.rs</p>                        
                <img src="Images/phone.png" alt="phone" width="30" height="25" id="search-image-phone"/>
                <p id="phone-p">067/987-32-41</p>
            </form>                
        </div>
        
        <div id="nav-bar-div">
            <nav id="nav-bar">
                <a href="home_overview.jsp" class="nav-a-tag">Home</a>
                <a href="BookOverview" class="nav-a-tag">Books</a>
                <a href="showartical" class="nav-a-tag">Cart</a>    
                <a href="" class="nav-a-tag">We recommend</a>
                <a href="" class="nav-a-tag"> On sale</a>
                <a hre="" class="nav-a-tag">Gift</a>
                <a href="" class="nav-a-tag">Coming soon</a>
            </nav> 
        </div>
    </body>
</html>
