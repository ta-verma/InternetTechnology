<%-- 
    Document   : print
    Created on : 2 Nov, 2019, 3:09:41 PM
    Author     : DNO
--%>

<%@page import="java.util.Calendar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(request.getParameter("name")!=null){
            String val = ((request.getParameter("name")));
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

        <c:out value="${param.s}"></c:out>
    </body>
</html>
