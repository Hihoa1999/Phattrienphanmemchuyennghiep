package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<footer id=\"footer\" class=\"section section-grey\">\n");
      out.write("    <!-- container -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <!-- row -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <!-- footer widget -->\n");
      out.write("            <div class=\"col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <!-- footer logo -->\n");
      out.write("                    <div class=\"footer-logo\">\n");
      out.write("                        <a class=\"logo\" href=\"#\">\n");
      out.write("                            <img src=\"/HiberDangTin/views/img/logomh.png\" alt=\"\">\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /footer logo -->\n");
      out.write("\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna</p>\n");
      out.write("\n");
      out.write("                    <!-- footer social -->\n");
      out.write("                    <ul class=\"footer-social\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-instagram\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-pinterest\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <!-- /footer social -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /footer widget -->\n");
      out.write("\n");
      out.write("            <!-- footer widget -->\n");
      out.write("            <div class=\"col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <h3 class=\"footer-header\">My Account</h3>\n");
      out.write("                    <ul class=\"list-links\">\n");
      out.write("                        <li><a href=\"#\">My Account</a></li>\n");
      out.write("                        <li><a href=\"#\">My Wishlist</a></li>\n");
      out.write("                        <li><a href=\"#\">Compare</a></li>\n");
      out.write("                        <li><a href=\"#\">Checkout</a></li>\n");
      out.write("                        <li><a href=\"#\">Login</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /footer widget -->\n");
      out.write("\n");
      out.write("            <div class=\"clearfix visible-sm visible-xs\"></div>\n");
      out.write("\n");
      out.write("            <!-- footer widget -->\n");
      out.write("            <div class=\"col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <h3 class=\"footer-header\">Customer Service</h3>\n");
      out.write("                    <ul class=\"list-links\">\n");
      out.write("                        <li><a href=\"#\">About Us</a></li>\n");
      out.write("                        <li><a href=\"#\">Shiping & Return</a></li>\n");
      out.write("                        <li><a href=\"#\">Shiping Guide</a></li>\n");
      out.write("                        <li><a href=\"#\">FAQ</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /footer widget -->\n");
      out.write("\n");
      out.write("            <!-- footer subscribe -->\n");
      out.write("            <div class=\"col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("                <div class=\"footer\">\n");
      out.write("                    <h3 class=\"footer-header\">Stay Connected</h3>\n");
      out.write("                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor.</p>\n");
      out.write("                    <form>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <input class=\"input\" placeholder=\"Enter Email Address\">\n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"primary-btn\">Join Newslatter</button>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /footer subscribe -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /row -->\n");
      out.write("        <hr>\n");
      out.write("        <!-- row -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8 col-md-offset-2 text-center\">\n");
      out.write("                <!-- footer copyright -->\n");
      out.write("                <div class=\"footer-copyright\">\n");
      out.write("                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"fa fa-heart-o\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /footer copyright -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /row -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /container -->\n");
      out.write("</footer>\n");
      out.write("<!-- /FOOTER -->\n");
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
