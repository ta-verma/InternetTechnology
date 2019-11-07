<%-- 
    Document   : index
    Created on : 24 Oct, 2019, 2:47:04 PM
    Author     : c3
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <center>
        <form action="" method="post">
            Enter Number:<input type="number" name="val" ><br/>
            <input type="submit" value="sub">
        </form>
    </center>


    <br><br><br>



    <c:forEach var="i" begin="1" end="${param.val}">  
        <c:forEach var="j" begin="1" end="${i}">
            <c:out value="${j}"/> 

        </c:forEach>
        <br>
    </c:forEach>



</html>
