package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"product-body\">\n");
      out.write("                            <table>  \n");
      out.write("                                <tr>\n");
      out.write("                                    <td><h1 class=\"product-name\"> Tên Khách Hàng:</h1></td>\n");
      out.write("                                    <td><h1 class=\"product-name\">&nbsp; </h1></td>\n");
      out.write("                                    <td><h1 class=\"product-name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${khachHang.tenKh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1></td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><h5 class=\"product-price\">Tên Tài Khoản:</h5></td>\n");
      out.write("                                    <td><h1 class=\"product-name\">&nbsp; </h1></td>\n");
      out.write("                                    <td><h5 class=\"product-price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${khachHang.tenTk}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5></td>\n");
      out.write("\n");
      out.write("                                </tr>                                \n");
      out.write("                                <tr>\n");
      out.write("                                    <td><h5 class=\"product-price\">Số Điện Thoại:</h5></td>\n");
      out.write("                                    <td><h1 class=\"product-name\">&nbsp; </h1></td>\n");
      out.write("                                    <td><h5 class=\"product-price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${khachHang.soDienThoai}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5></td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><h5 class=\"product-price\">Email:</h5></td>\n");
      out.write("                                    <td><h1 class=\"product-name\">&nbsp;</h1></td>\n");
      out.write("                                    <td><h5 class=\"product-price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${khachHang.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5></td>\n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                            </table>\n");
      out.write("                            <div class=\"product-btns\">\n");
      out.write("                                <button class=\"primary-btn add-to-cart\" onclick=\"location.href = 'capnhapkhachhang.htm?maKh=");
      out.print(session.getAttribute("ma"));
      out.write("'\">Sửa thông tin</button>\n");
      out.write("                            </div>\n");
      out.write("                            <button class=\"btn btn-link\"><a href=\"taomoiPt.htm\">Đăng tin</a></button>\n");
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
}
