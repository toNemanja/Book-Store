
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS/genreStyle.css" rel="stylesheet" type="text/css"/>
    </head>    
    <body>
        <div id="genre-div">
            <c:forEach var="genre" items="${genreList}">
                <ul>
                    <form action="genreBasedBook" metod="GET">
                        <input type="hidden" value="${genre.title}" name="genre_title">
                        <button type="submit" id="genre-button">${genre.title}</button>
                        <hr id="hr-genre">
                    </form>

                </ul>
            </c:forEach>
        </div>
    </body>
</html>
