<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jst1/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DVD Library Application: Add DVD Form</title>
    </head>
    <body>
        <%-- Generate main body --%>
        <h1>Add DVD (JSTL)</h1>
        <c:if test="${not empty errorMsgs}">
            <p>
                <font color='red'>Please correct the following errors:
                    <ul>
                        <c:forEach var="message" items="${errorMsgs}">
                            <li>${message}</li>
                        </c:forEach>
                    </ul>
                </font>
            </p>
        </c:if>
        <form action='add_dvd.do' method='POST'>
            <%-- Repopulate the title field --%>
            Title: <input type='text' name='title' value='${param.title}' /><br/><br/>
            <%-- Repopulate the year field --%>
            Year: <input type='text' name='year' value='${param.year}' /><br/><br/>
            <%-- Repopulate the Genre drop-down menu --%>
            Genre: <select name='genre'>
                <c:forEach var="genre_item" items="${library.genres}">
                    <option value='${genre_item}'
                    <C:if test="${genre_item eq param.genre}">selected</c:if>
                    >${genre_item}</option> 
                </c:forEach>
            </select>
            
            or new genre: <input type='text' name='newGenre' value='${param.newGenre}' />
            <input type='Submit' value='Add DVD' />
        </form>              
    </body>
</html>
