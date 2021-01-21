package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_hidden_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_button_onclick;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_form_method_commandName_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_input_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_input_type_path_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_hidden_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_button_onclick = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_form_method_commandName_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_input_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_input_type_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_hidden_path_nobody.release();
    _jspx_tagPool_f_button_onclick.release();
    _jspx_tagPool_f_form_method_commandName_action.release();
    _jspx_tagPool_f_input_path_nobody.release();
    _jspx_tagPool_f_input_type_path_nobody.release();
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
      out.write("\n");
      out.write("                        <div class=\"product-body\">\n");
      out.write("                            ");
      if (_jspx_meth_f_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
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

  private boolean _jspx_meth_f_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_f_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_f_form_method_commandName_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_f_form_0.setPageContext(_jspx_page_context);
    _jspx_th_f_form_0.setParent(null);
    _jspx_th_f_form_0.setAction("luukhachhang.htm");
    _jspx_th_f_form_0.setMethod("post");
    _jspx_th_f_form_0.setCommandName("khachHang");
    int[] _jspx_push_body_count_f_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_f_form_0 = _jspx_th_f_form_0.doStartTag();
      if (_jspx_eval_f_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <table>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td><h1 class=\"product-name\"></h1></td>\n");
          out.write("                                         <td><h1 class=\"product-name\">&nbsp; </h1></td>\n");
          out.write("                                        <td><h1 class=\"product-name\">");
          if (_jspx_meth_f_hidden_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("</h1></td>\n");
          out.write("\n");
          out.write("                                    </tr>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td><h1 class=\"product-name\"> Tên Khách Hàng:</h1></td>\n");
          out.write("                                        <td><h1 class=\"product-name\">&nbsp; </h1></td>\n");
          out.write("                                        <td><h1 class=\"product-name\">");
          if (_jspx_meth_f_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("</h1></td>\n");
          out.write("\n");
          out.write("                                    </tr>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td><h5 class=\"product-price\">Tên Tài Khoản:</h5></td>\n");
          out.write("                                         <td><h1 class=\"product-name\">&nbsp; </h1></td>\n");
          out.write("                                        <td><h5 class=\"product-price\">");
          if (_jspx_meth_f_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("</h5></td>\n");
          out.write("\n");
          out.write("                                    </tr>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td><h5 class=\"product-price\">Mật khẩu:</h5></td>\n");
          out.write("                                         <td><h1 class=\"product-name\">&nbsp; </h1></td>\n");
          out.write("                                        <td><h5 class=\"product-price\">");
          if (_jspx_meth_f_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("</h5></td>\n");
          out.write("                                    </tr>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td><h5 class=\"product-price\">Nhập Lại Mật Khẩu:</h5></td>\n");
          out.write("                                         <td><h1 class=\"product-name\">&nbsp; </h1></td>\n");
          out.write("                                        <td><h5 class=\"product-price\">");
          if (_jspx_meth_f_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("</h5></td>\n");
          out.write("\n");
          out.write("                                    </tr>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td><h5 class=\"product-price\">Số Điện Thoại:</h5></td>\n");
          out.write("                                         <td><h1 class=\"product-name\">&nbsp; </h1></td>\n");
          out.write("                                        <td><h5 class=\"product-price\">");
          if (_jspx_meth_f_input_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("</h5></td>\n");
          out.write("\n");
          out.write("                                    </tr>\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td><h5 class=\"product-price\">Email:</h5></td>\n");
          out.write("                                        <td><h1 class=\"product-name\">&nbsp;</h1></td>\n");
          out.write("                                        <td><h5 class=\"product-price\">");
          if (_jspx_meth_f_input_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("</h5></td>\n");
          out.write("                                    </tr>\n");
          out.write("                                    \n");
          out.write("                                </table>\n");
          out.write("                                ");
          if (_jspx_meth_f_button_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_f_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_f_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_form_0.doFinally();
      _jspx_tagPool_f_form_method_commandName_action.reuse(_jspx_th_f_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_f_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_f_hidden_0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _jspx_tagPool_f_hidden_path_nobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_f_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_f_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_hidden_0.setPath("maKh");
    int[] _jspx_push_body_count_f_hidden_0 = new int[] { 0 };
    try {
      int _jspx_eval_f_hidden_0 = _jspx_th_f_hidden_0.doStartTag();
      if (_jspx_th_f_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_hidden_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_hidden_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_hidden_0.doFinally();
      _jspx_tagPool_f_hidden_path_nobody.reuse(_jspx_th_f_hidden_0);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_0.setPageContext(_jspx_page_context);
    _jspx_th_f_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_0.setPath("tenKh");
    int[] _jspx_push_body_count_f_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_f_input_0 = _jspx_th_f_input_0.doStartTag();
      if (_jspx_th_f_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_input_0.doFinally();
      _jspx_tagPool_f_input_path_nobody.reuse(_jspx_th_f_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_1.setPageContext(_jspx_page_context);
    _jspx_th_f_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_1.setPath("tenTk");
    int[] _jspx_push_body_count_f_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_f_input_1 = _jspx_th_f_input_1.doStartTag();
      if (_jspx_th_f_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_input_1.doFinally();
      _jspx_tagPool_f_input_path_nobody.reuse(_jspx_th_f_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_2.setPageContext(_jspx_page_context);
    _jspx_th_f_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_2.setDynamicAttribute(null, "type", new String("password"));
    _jspx_th_f_input_2.setPath("matKhau");
    int[] _jspx_push_body_count_f_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_f_input_2 = _jspx_th_f_input_2.doStartTag();
      if (_jspx_th_f_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_input_2.doFinally();
      _jspx_tagPool_f_input_type_path_nobody.reuse(_jspx_th_f_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_3.setPageContext(_jspx_page_context);
    _jspx_th_f_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_3.setDynamicAttribute(null, "type", new String("password"));
    _jspx_th_f_input_3.setPath("nhapLaiMatKhau");
    int[] _jspx_push_body_count_f_input_3 = new int[] { 0 };
    try {
      int _jspx_eval_f_input_3 = _jspx_th_f_input_3.doStartTag();
      if (_jspx_th_f_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_input_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_input_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_input_3.doFinally();
      _jspx_tagPool_f_input_type_path_nobody.reuse(_jspx_th_f_input_3);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_4(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_4 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_4.setPageContext(_jspx_page_context);
    _jspx_th_f_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_4.setPath("soDienThoai");
    int[] _jspx_push_body_count_f_input_4 = new int[] { 0 };
    try {
      int _jspx_eval_f_input_4 = _jspx_th_f_input_4.doStartTag();
      if (_jspx_th_f_input_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_input_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_input_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_input_4.doFinally();
      _jspx_tagPool_f_input_path_nobody.reuse(_jspx_th_f_input_4);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_5(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_5 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_path_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_5.setPageContext(_jspx_page_context);
    _jspx_th_f_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_5.setPath("email");
    int[] _jspx_push_body_count_f_input_5 = new int[] { 0 };
    try {
      int _jspx_eval_f_input_5 = _jspx_th_f_input_5.doStartTag();
      if (_jspx_th_f_input_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_input_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_input_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_input_5.doFinally();
      _jspx_tagPool_f_input_path_nobody.reuse(_jspx_th_f_input_5);
    }
    return false;
  }

  private boolean _jspx_meth_f_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:button
    org.springframework.web.servlet.tags.form.ButtonTag _jspx_th_f_button_0 = (org.springframework.web.servlet.tags.form.ButtonTag) _jspx_tagPool_f_button_onclick.get(org.springframework.web.servlet.tags.form.ButtonTag.class);
    _jspx_th_f_button_0.setPageContext(_jspx_page_context);
    _jspx_th_f_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_button_0.setDynamicAttribute(null, "onclick", new String("return confirm('Bạn có muốn thay đổi thông tin ?')"));
    int[] _jspx_push_body_count_f_button_0 = new int[] { 0 };
    try {
      int _jspx_eval_f_button_0 = _jspx_th_f_button_0.doStartTag();
      if (_jspx_eval_f_button_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Lưu");
          int evalDoAfterBody = _jspx_th_f_button_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_f_button_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_button_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_button_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_button_0.doFinally();
      _jspx_tagPool_f_button_onclick.reuse(_jspx_th_f_button_0);
    }
    return false;
  }
}
