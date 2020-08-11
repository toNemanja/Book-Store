

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="bookaddadmin" method="POST" enctype="multipart/form-data">
            Title:<input type="text" value="${title}" name="title" required> <br>
            Description: <input type="text" value="${description}" name="description"
                                size="200" id="description-input" required><br>
            Price: <input type="text" value="${price}" name="price" required><br>
            Genre:<select name="selectGenre" multiple>
                     <c:forEach var="genre" items="${genreList}">
                    <option value="${genre.id}" >${genre.title}</option>
                     </c:forEach>                  
                  </select> <br>
            Author: <input type="text" name="author"><br>
            Number of pages: <input type="text" name="numberOfPages"><br>
            Binding: <input type="text" name="binding"><br>
            Dimensions: <input type="text" name="dimensions"><br>
            Release Date: <input type="text" name="releaseDate"> <br>
            Picture: <input type="file" name="myimg" required><br>
            <button type="submit">Add</button>

        </form>

    </body>
    <style>
        #description-input{
            height: 100px;
        }
    </style>
</html>
