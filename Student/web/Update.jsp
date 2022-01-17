<%-- 
    Document   : Update.jsp
    Created on : Jun 24, 2021, 10:56:38 PM
    Author     : Amirah Hasya 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<sql:setDataSource var="myDatasource" 
driver="org.apache.derby.jdbc.ClientDriver" 
url="jdbc:derby://localhost:1527/Studenttt" user="app" 
password="app"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update JSP Page</title>
    </head>
    <body>
        <c:set var="id" value="${param.id}"/> 
        <c:set var="name" value="${param.name}"/> 
        <c:set var="branch" value="${param.branch}"/>
        <c:if test="${(id!=null)&&(name!=null)&&(branch!=null)}" var="result">
            <sql:update var="res" dataSource="myDatasource">
            UPDATE STUDENT SET NAME = ?, BRANCH = ? WHERE ID = ?
            <sql:param value="${name}"/> 
            <sql:param value="${branch}"/> 
            <sql:param value="${id}"/> 
            </sql:update>
            
        </c:if>
        <form action="Update.jsp" method="POST">
            <table>
                <tr>
                    <td>ID :</td>
                    <td><select name="id"> 
                        <sql:query var="result" dataSource="myDatasource">
                            SELECT ID FROM STUDENT
                        </sql:query>
                        <c:forEach var="row" items="${result.rowsByIndex}"> 
                        <c:forEach var="column" items="${row}"> 
                        <option> <c:out value="${column}"/></option> 
                        </c:forEach> 
                        </c:forEach> 
                        </select></td>
                </tr>
                <tr>
                    <td>NAME :</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>BRANCH :</td>
                    <td><input type="text" name="branch"></td>
                </tr>
                <tr><td><input type="submit" value="Submit"></td></tr>
            </table>
            <sql:query var="result" dataSource="myDatasource">
                SELECT * FROM APP.STUDENT
            </sql:query>
    
            <table border="1">
                <!-- column headers -->
                <tr>
                    <c:forEach var="columnName" items="${result.columnNames}">
                        <th><c:out value="${columnName}"/></th>
                        </c:forEach>
                </tr>
                <!-- column data -->
                <c:forEach var="row" items="${result.rowsByIndex}">
                    <tr>
                        <c:forEach var="column" items="${row}">
                            <td><c:out value="${column}"/></td>
                        </c:forEach>
                    </tr>
                </c:forEach>
            </table>
    </body>
</html>
