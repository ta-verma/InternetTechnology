<%-- 
    Document   : index
    Created on : 24 Oct, 2019, 2:47:04 PM
    Author     : c3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><center>
        <form action="" method="post">
        Enter Number:<input type="number" name="val" ><br/>
        <input type="submit" value="sub">
</form>
        </center>
    
    <% if(request.getParameter("val")!= null)
    {int val=Integer.parseInt((request.getParameter("val")));
			
			for(int i=1;i<=val;i++)
			{   for(int j=1;j<=i;j++)
				out.print(j);
                                out.println("<br>");
			}
    }	%>
    
  
   
    
    </body>
</html>
