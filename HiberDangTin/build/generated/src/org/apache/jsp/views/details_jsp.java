package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class details_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatNumber_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatNumber_value_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>MY HOME Page</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Hind:400,700\" rel=\"stylesheet\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"/HiberDangTin/views/css/bootstrap.min.css\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"/HiberDangTin/views/css/slick.css\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"/HiberDangTin/views/css/slick-theme.css\" />\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"/HiberDangTin/views/css/nouislider.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"/HiberDangTin/views/css/font-awesome.min.css\">\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"/HiberDangTin/views/css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, true);
      out.write("\n");
      out.write("            </header>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, true);
      out.write("\n");
      out.write("                <!-- menu nav -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /container -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /NAVIGATION -->\n");
      out.write("    <!-- section -->\n");
      out.write("    <div class=\"section\">\n");
      out.write("        <!-- container -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- row -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <!--  Product Details -->\n");
      out.write("                <div class=\"product product-details clearfix\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div id=\"product-main-view\">\n");
      out.write("                            <div class=\"product-view\">\n");
      out.write("                                <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phongtro.anh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"product-body\">\n");
      out.write("                            <h2 class=\"product-name\">Tên phòng trọ : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phongtro.tenPt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                            <h3 class=\"product-price\">Giá phòng trọ : ");
      if (_jspx_meth_fmt_formatNumber_0(_jspx_page_context))
        return;
      out.write(" VNĐ</h3>\n");
      out.write("                            <p><strong>Tỉnh Thành:</strong> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phongtro.maTinh.tenTinh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <p><strong>Mô tả:</strong> E-SHOP</p>\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phongtro.mota}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            <form action=\"sub.htm\" method=\"post\">\n");
      out.write("                            <div class=\"product-btns\">\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /Product Details -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /container -->\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write("\n");
      out.write("    <script src=\"/HiberDangTin/views/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"/HiberDangTin/views/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"/HiberDangTin/views/js/slick.min.js\"></script>\n");
      out.write("    <script src=\"/HiberDangTin/views/js/nouislider.min.js\"></script>\n");
      out.write("    <script src=\"/HiberDangTin/views/js/jquery.zoom.min.js\"></script>\n");
      out.write("    <script src=\"/HiberDangTin/views/js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_fmt_formatNumber_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent(null);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phongtro.gia}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }
}
