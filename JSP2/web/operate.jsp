<%-- 
    Document   : index
    Created on : 24 Oct, 2019, 4:10:25 PM
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
    <body>
        <% if(request.getParameter("val1")!=null && request.getParameter("val2")!=null)
            {
                int val1 = Integer.parseInt(request.getParameter("val1"));
                int val2 = Integer.parseInt(request.getParameter("val2"));
                int val3;
                int choice = Integer.parseInt(request.getParameter("cal"));
                
                switch(choice)
                {
                    case 1 :  val3 = val1 + val2;  out.println(val3); break;
                    case 2 :  val3 = val1 - val2;  out.println(val3); break;
                    case 3 :  val3 = val1 * val2;  out.println(val3); break;
                }
                
               
            }
                
        %>
        
        
        <c:if test = "${param.val1 != null}">
            <c:if test="${param.cal == 1}">
                <c:out value="${param.val1 + param.val2}"/>
            </c:if>
            <c:if test="${param.cal == 2}">
                <c:out value="${param.val1 - param.val2}"/>
            </c:if>
            <c:if test="${param.cal == 3}">
                <c:out value="${param.val1 * param.val2}"/>
            </c:if>
        </c:if>
        
        
    </body>
</html>
