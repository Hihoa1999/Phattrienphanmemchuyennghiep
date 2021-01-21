package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class giabinhdan_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>E-SHOP HTML Template</title>\n");
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
      out.write("            <!-- container -->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-- row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <!-- section title -->\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"section-title\">\n");
      out.write("                            <h2 class=\"title\">Sản phẩm</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- section title -->\n");
      out.write("                    ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${phongtro}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("s");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                        <!-- Product Single -->\n");
            out.write("                        <div class=\"col-md-3 col-sm-6 col-xs-6\">\n");
            out.write("                            <div class=\"product product-single\">\n");
            out.write("                                <div class=\"product-thumb\">\n");
            out.write("                                    <input type=\"button\" value=\"Chi tiết\" class=\"main-btn quick-view\" onclick=\"location.href = 'detailsanpham.htm?maPt=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.maPt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("'\">\n");
            out.write("                                    <img src=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.anh}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" width=\"200px\" height=\"310px\" alt=\"\">\n");
            out.write("                                </div>\n");
            out.write("                                <div class=\"product-body\">\n");
            out.write("                                    <h3 class=\"product-price colortext\">$");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.gia}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</h3>\n");
            out.write("                                    \n");
            out.write("                                    <h2 class=\"product-name colorname\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.tenPt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</a></h2>\n");
            out.write("                                    <div class=\"product-btns\" >\n");
            out.write("                                        ");
 if (session.getAttribute("ten") != null) {
            out.write("\n");
            out.write("                                        <button class=\"main-btn icon-btn\" onclick=\"location.href = 'uathich.htm?maPt=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.maPt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("&maKh=");
            out.print(session.getAttribute("ma"));
            out.write("'\"><i class=\"fa fa-heart\"></i></button>\n");
            out.write("                                            ");
 } else { 
            out.write("\n");
            out.write("\n");
            out.write("                                        ");
 }
            out.write("\n");
            out.write("                                        <button onclick=\"location.href = 'add.htm?maPt=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.maPt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("'\" class=\"primary-btn add-to-cart\" ><i class=\"fa fa-shopping-cart\"></i> Thêm giỏ hàng</button>\n");
            out.write("                                    </div>\n");
            out.write("                                </div>\n");
            out.write("                            </div>\n");
            out.write("                        </div>\n");
            out.write("                    ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12 col-sm-12\" style=\"text-align: right\"></div>\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"keys\" style=\"display: none\" title=\"/shop\">\n");
      out.write("                    <span>2</span><span>3</span><span>4</span>\n");
      out.write("                </div>\n");
      out.write("                <div style=\" text-align: center ;padding-right: 20px\">\n");
      out.write("                    <mytag:my_tag steps=\"12\" offset=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offset}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" count=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${numberProductDetail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"   uri=\"showsanpham.htm\" next=\"&raquo;\"   previous=\"&laquo;\"/>\n");
      out.write("                </div>\n");
      out.write("                <!-- /Product Single -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
