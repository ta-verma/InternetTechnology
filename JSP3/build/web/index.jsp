<%-- 
    Document   : index
    Created on : 2 Nov, 2019, 12:49:17 PM
    Author     : DNO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP3</title>
    </head>
    <body><br><br>
        <form  method="post">
            <input type="hidden" name="validate" value="true">

            
            Name: &ensp;&ensp;&ensp;&ensp;<input type="text" name="user" value="<c:out value="${param.user}" />">
            <c:if test="${param.validate && empty param.user}"> &ensp;       
                <font color="red">Please Enter Your Name</font>
            </c:if><br><br>

            
            Birth Date:&Tab;<input type="text" name="dob" placeholder="DD/MM/YYYY" value="<c:out value="${param.dob}" />">
            <c:if test="${param.validate && empty param.dob}"> &ensp;
                <font color="red">Please Enter Your Birth Date </font>
            </c:if><br>

            
            <br>Email Address:&ensp; <input type="text" name="email"  value="<c:out value="${param.email}" />">
            <c:if test="${param.validate && empty param.email}">&ensp;
                <font color="red">Please Enter Your Email Address</font>
            </c:if><br><br>


            
            Gender:
            <input type="radio" name="gender" value="m" checked>   Male
            <input type="radio" name="gender" value="f">  Female
            <!-- <c:if test="${param.validate &&  (param.gender != 'm' || param.gender != 'f')}"> &ensp;
                <font color="red">Please select a Gender</font>
            </c:if> --><br><br>

            
            Lucky number:&emsp;<input type="text" name="lucky" placeholder="between 1 and 10" value="<c:out value="${param.lucky}" />">
            <c:if test="${param.validate &&(param.lucky< 1 || param.lucky > 10)}"> &ensp;
                <font color="red"> Please Enter a Lucky Number between 1 and 10 </font>
            </c:if><br><br>

            

            Favorite Foods:&emsp;               
            <input type="checkbox" name="food1" value="in"  >Indian&ensp;
            <input type="checkbox" name="food2" value="it"  >Italian&ensp;
            <input type="checkbox" name="food3" value="ch"  >Chinese
            <!-- <c:if test="${param.validate &&  (param.food1 != 'in' || param.food2 != 'it' || param.food3 != 'ch')}"> &ensp;
                <font color="red">Please select a Favorite Food</font>
            </c:if>
            <br><br> -->
            <input type="submit" value="Submit">
        </form>
    </body>
</html>