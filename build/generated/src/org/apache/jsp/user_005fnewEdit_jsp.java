package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fnewEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navigation_overview.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"CSS/userStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"CSS/navigationStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"logo-div\">\n");
      out.write("            <img src=\"Images/logo-makart.png\" alt=\"logo\" width=\"150\" height=\"100\"/>  \n");
      out.write("            <form action=\"Search\" method=\"GET\" id=\"search-form\">\n");
      out.write("                <input type=\"search\" placeholder=\"Search\" name=\"searchInput\" size=\"80\" id=\"search-input\">\n");
      out.write("                <button type=\"submit\" id=\"search-button\">Search</button>\n");
      out.write("                <img src=\"Images/mail.png\" alt=\"email\" width=\"32\" height=\"20\" id=\"search-image-mail\"/>\n");
      out.write("                <p id=\"mail-p\">makart-books@makart.rs</p>                        \n");
      out.write("                <img src=\"Images/phone.png\" alt=\"phone\" width=\"30\" height=\"25\" id=\"search-image-phone\"/>\n");
      out.write("                <p id=\"phone-p\">067/987-32-41</p>\n");
      out.write("            </form>                \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div id=\"nav-bar-div\">\n");
      out.write("            <nav id=\"nav-bar\">\n");
      out.write("                <a href=\"home_overview.jsp\" class=\"nav-a-tag\">Home</a>\n");
      out.write("                <a href=\"BookOverview\" class=\"nav-a-tag\">Books</a>\n");
      out.write("                <a href=\"showartical\" class=\"nav-a-tag\">Cart</a>         \n");
      out.write("            </nav> \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("  \n");
      out.write("        <div id=\"user-form-div\">\n");
      out.write("           <label id=\"userNewEdit-h2\">Enter your personal information</label><br>\n");
      out.write("        <form action=\"createuser\" method=\"POST\" id=\"user-form\">\n");
      out.write("            \n");
      out.write("            <label>First Name:</label>  <br>\n");
      out.write("            <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"firstName\"\n");
      out.write("                   size=\"310\" class=\"user-input\" required> <br>\n");
      out.write("            \n");
      out.write("            <label>Last Name:</label> <br> \n");
      out.write("            <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"lastName\" \n");
      out.write("                   size=\"310\" class=\"user-input\"  required> <br>\n");
      out.write("            \n");
      out.write("            <label>City:</label> <br> \n");
      out.write("            <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"city\"\n");
      out.write("                   size=\"310\" class=\"user-input\" required> <br>\n");
      out.write("            \n");
      out.write("            <label>Address:</label> <br> \n");
      out.write("            <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${adress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"adress\"\n");
      out.write("                   size=\"310\"  class=\"user-input\" required> <br>\n");
      out.write("            \n");
      out.write("            <label>Phone:</label> <br> \n");
      out.write("            <input tpe=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"phone\" \n");
      out.write("                   size=\"310\" class=\"user-input\" required> <br>\n");
      out.write("            \n");
      out.write("            <div id=\"userNewEdit-buttons\"> \n");
      out.write("            <button type=\"submit\" id=\"next-userNewEdit-button\">Next</button>\n");
      out.write("            <button type=\"submit\">Back</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
