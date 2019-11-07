<%-- 
    Document   : index
    Created on : 18 Oct, 2019, 3:38:19 PM
    Author     : c3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%  String s= "Hello";
            int a =10;
             pageContext.setAttribute("msg", s, PageContext.SESSION_SCOPE); 
         %>
         
         <c:out value = "${'<tag> , &'}"/>
         
         <% String def= (String)pageContext.getAttribute("msg",PageContext.SESSION_SCOPE);
         %>
         
         ${param.tarun}
         </body>
         
        
         
    
</html>
