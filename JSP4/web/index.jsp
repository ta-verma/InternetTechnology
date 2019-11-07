<%-- 
    Document   : index
    Created on : 2 Nov, 2019, 2:31:49 PM
    Author     : DNO
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP 4</title>
    </head>
    <body><center>
        <form action="" method="post">
            Enter Namer:<input type="text" name="uname" ><br/><br>
            <input type="submit" value="submit">
        </form>
        
        <%
            if(request.getParameter("uname")!=null){
            String val = ((request.getParameter("uname")));
            Calendar c = Calendar.getInstance();
            int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
            String s;
            if (timeOfDay >= 0 && timeOfDay < 12) {
                s = "Good Moring";
            } else if (timeOfDay >= 12 && timeOfDay < 16) {
                s = "Good Afternoon";
            } else if (timeOfDay >= 16 && timeOfDay < 21) {
                s = "Good Evening";
            } else if (timeOfDay >= 21 && timeOfDay < 24) {
                s = "Good Night";
            } else {
                s = "";
            }
            s = s + ", " + val;
            
            out.println(s);}
        %>
        <br><br>
        <h1><c:out value="${param.s}"></c:out></h1>
    </center></body>
</html>
