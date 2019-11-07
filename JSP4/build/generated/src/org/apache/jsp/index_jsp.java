package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP 4</title>\n");
      out.write("    </head>\n");
      out.write("    <body><center>\n");
      out.write("        <form action=\"\" method=\"post\">\n");
      out.write("            Enter Namer:<input type=\"text\" name=\"name\" ><br/><br>\n");
      out.write("            <input type=\"submit\" value=\"submit\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <h1><c:out value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.s}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></c:out></h1>\n");
      out.write("    </center></body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
