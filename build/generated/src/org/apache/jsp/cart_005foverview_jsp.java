package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_005foverview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navigation_overview.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Shopping cart</title>\n");
      out.write("        <link href=\"CSS/cartStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/bookStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
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
      out.write("       \n");
      out.write("        <div id=\"full-cart\">\n");
      out.write("        <hr class=\"table-hr\">\n");
      out.write("        <table style=\"width:50%\"   id=\"table\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Title</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Amount</th>\n");
      out.write("                <th>Total</th>\n");
      out.write("            </tr>\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" <br> \n");
      out.write("    </table>\n");
      out.write("    <hr class=\"table-hr\">\n");
      out.write("\n");
      out.write("    <div id=\"total-payment\">Total payment:<br>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br></div>  \n");
      out.write("    <div id=\"testDiv\" >\n");
      out.write("        <form action=\"book_overview.jsp\">\n");
      out.write("            <button type=\"submit\" class=\"cart-buttons\">Back to store</button>\n");
      out.write("        </form>\n");
      out.write("        <form action=\"ArticalCheck\">\n");
      out.write("            <button type=\"submit\" id=\"checkout-button\" class=\"cart-buttons\">Checkout</button>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("    function myFunction(value, price, id, total) {\n");
      out.write("        document.location.href = \"ArticalTotalOnChange?artical_NumberOfOrder=\" + value +\n");
      out.write("                \"&artical_price=\" + price + \"&articalID=\" + id + \"&artical_total=\" + total;\n");
      out.write("    }\n");
      out.write("</script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("artical");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${articalList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("              \n");
          out.write("                <tr>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${artical.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${artical.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                    <td><input type=\"text\" name=\"artical_NumberOfOrder\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${artical.numberOfOrder}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                               onfocusout=\"myFunction(this.value,");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${artical.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(',');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${artical.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(',');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${artical.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\"></td>\n");
          out.write("                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${artical.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${artical.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"artical_total\">\n");
          out.write("                <td> <form action=\"deletefromcart\" method=\"POST\">\n");
          out.write("                        <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${artical.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"articalID\">\n");
          out.write("                        <input type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${artical.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" id=\"price\" name=\"artical_price\">\n");
          out.write("                        <button type=\"submit\" id=\"deleteFromCart\">Delete</button>\n");
          out.write("                    </form>                   \n");
          out.write("                </td>     \n");
          out.write("               \n");
          out.write("            </tr>\n");
          out.write("            \n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
