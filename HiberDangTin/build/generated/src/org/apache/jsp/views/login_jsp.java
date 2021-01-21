package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_form_style_role_method_id_commandName_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_id_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_select_type_tabindex_required_path_id_class;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_input_type_tabindex_required_placeholder_path_id_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_button_tabindex_name_id_class;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_form_type_style_role_method_id_commandName_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_button_value_tabindex_name_id_class;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_minlenght_id_class_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_form_style_role_method_id_commandName_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_id_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_select_type_tabindex_required_path_id_class = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_input_type_tabindex_required_placeholder_path_id_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_button_tabindex_name_id_class = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_form_type_style_role_method_id_commandName_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_button_value_tabindex_name_id_class = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_minlenght_id_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_form_style_role_method_id_commandName_action.release();
    _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_id_class_nobody.release();
    _jspx_tagPool_f_select_type_tabindex_required_path_id_class.release();
    _jspx_tagPool_f_input_type_tabindex_required_placeholder_path_id_class_nobody.release();
    _jspx_tagPool_f_button_tabindex_name_id_class.release();
    _jspx_tagPool_f_form_type_style_role_method_id_commandName_action.release();
    _jspx_tagPool_f_button_value_tabindex_name_id_class.release();
    _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_minlenght_id_class_nobody.release();
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
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
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
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, true);
      out.write("\n");
      out.write("            <!-- menu nav -->\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /container -->\n");
      out.write("</div>\n");
      out.write("<!-- /NAVIGATION -->\n");
      out.write("<!-- section -->\n");
      out.write("\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"a\">\n");
      out.write("        <div class=\"col-md-6 col-md-offset-3\">\n");
      out.write("            <div class=\"panel panel-login\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-6\">\n");
      out.write("                            <a href=\"#\" class=\"active\" id=\"login-form-link\">Đăng Nhập</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-6\">\n");
      out.write("                            <a href=\"#\" id=\"register-form-link\">Đăng Ký Thành Viên</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                        ");
      if (_jspx_meth_f_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_f_form_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write("\n");
      out.write("<script src=\"/HiberDangTin/views/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"/HiberDangTin/views/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"/HiberDangTin/views/js/slick.min.js\"></script>\n");
      out.write("<script src=\"/HiberDangTin/views/js/nouislider.min.js\"></script>\n");
      out.write("<script src=\"/HiberDangTin/views/js/jquery.zoom.min.js\"></script>\n");
      out.write("<script src=\"/HiberDangTin/views/js/main.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(function () {\n");
      out.write("\n");
      out.write("        $('#login-form-link').click(function (e) {\n");
      out.write("            $(\"#login-form\").delay(100).fadeIn(100);\n");
      out.write("            $(\"#register-form\").fadeOut(100);\n");
      out.write("            $('#register-form-link').removeClass('active');\n");
      out.write("            $(this).addClass('active');\n");
      out.write("            e.preventDefault();\n");
      out.write("        });\n");
      out.write("        $('#register-form-link').click(function (e) {\n");
      out.write("            $(\"#register-form\").delay(100).fadeIn(100);\n");
      out.write("            $(\"#login-form\").fadeOut(100);\n");
      out.write("            $('#login-form-link').removeClass('active');\n");
      out.write("            $(this).addClass('active');\n");
      out.write("            e.preventDefault();\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_f_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_f_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_f_form_style_role_method_id_commandName_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_f_form_0.setPageContext(_jspx_page_context);
    _jspx_th_f_form_0.setParent(null);
    _jspx_th_f_form_0.setId("login-form");
    _jspx_th_f_form_0.setCommandName("khachHang");
    _jspx_th_f_form_0.setAction("dangnhap.htm");
    _jspx_th_f_form_0.setMethod("get");
    _jspx_th_f_form_0.setDynamicAttribute(null, "role", new String("form"));
    _jspx_th_f_form_0.setDynamicAttribute(null, "style", new String("display: block;"));
    int[] _jspx_push_body_count_f_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_f_form_0 = _jspx_th_f_form_0.doStartTag();
      if (_jspx_eval_f_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"text-center\">\n");
          out.write("                                <h4 class=\"color1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msgsussessdk}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                <h4 class=\"color\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                <h4 class=\"color\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msgcheck}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                <h4 class=\"color\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msgcheck1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                <h5 class=\"color\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msgchecktk}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                <h5 class=\"color\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msgcheckmk}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"form-group\">\n");
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_f_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"form-group\">\n");
          out.write("                                ");
          if (_jspx_meth_f_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"form-group text-center\">\n");
          out.write("                                <input type=\"checkbox\" tabindex=\"3\" class=\"\" name=\"remember\" id=\"remember\">\n");
          out.write("                                <label for=\"remember\"> Ghi Nhớ Đăng Nhập</label>\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"form-group\">\n");
          out.write("                                <div class=\"row\">\n");
          out.write("                                    <div class=\"col-sm-6 col-sm-offset-3\">\n");
          out.write("                                        ");
          if (_jspx_meth_f_button_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"form-group\">\n");
          out.write("                                    <div class=\"row\">\n");
          out.write("                                        <div class=\"col-lg-12\">\n");
          out.write("                                            <div class=\"text-center\">\n");
          out.write("                                                <a href=\"https://phpoll.com/recover\" tabindex=\"5\" class=\"forgot-password\">Quên Mật Khẩu?</a>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                        ");
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
      _jspx_tagPool_f_form_style_role_method_id_commandName_action.reuse(_jspx_th_f_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_id_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_0.setPageContext(_jspx_page_context);
    _jspx_th_f_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_0.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_input_0.setPath("tenTk");
    _jspx_th_f_input_0.setId("username");
    _jspx_th_f_input_0.setTabindex("1");
    _jspx_th_f_input_0.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_0.setDynamicAttribute(null, "placeholder", new String("Username"));
    _jspx_th_f_input_0.setDynamicAttribute(null, "value", new String(""));
    _jspx_th_f_input_0.setDynamicAttribute(null, "required", new String("required"));
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
      _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_id_class_nobody.reuse(_jspx_th_f_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_tabindex_required_placeholder_path_id_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_1.setPageContext(_jspx_page_context);
    _jspx_th_f_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_1.setDynamicAttribute(null, "type", new String("password"));
    _jspx_th_f_input_1.setPath("matKhau");
    _jspx_th_f_input_1.setId("password");
    _jspx_th_f_input_1.setTabindex("2");
    _jspx_th_f_input_1.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_1.setDynamicAttribute(null, "placeholder", new String("Password"));
    _jspx_th_f_input_1.setDynamicAttribute(null, "required", new String("required"));
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
      _jspx_tagPool_f_input_type_tabindex_required_placeholder_path_id_class_nobody.reuse(_jspx_th_f_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_f_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:button
    org.springframework.web.servlet.tags.form.ButtonTag _jspx_th_f_button_0 = (org.springframework.web.servlet.tags.form.ButtonTag) _jspx_tagPool_f_button_tabindex_name_id_class.get(org.springframework.web.servlet.tags.form.ButtonTag.class);
    _jspx_th_f_button_0.setPageContext(_jspx_page_context);
    _jspx_th_f_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_button_0.setName("login-submit");
    _jspx_th_f_button_0.setId("login-submit");
    _jspx_th_f_button_0.setDynamicAttribute(null, "tabindex", new String("4"));
    _jspx_th_f_button_0.setDynamicAttribute(null, "class", new String("form-control btn btn-login"));
    int[] _jspx_push_body_count_f_button_0 = new int[] { 0 };
    try {
      int _jspx_eval_f_button_0 = _jspx_th_f_button_0.doStartTag();
      if (_jspx_eval_f_button_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Đăng Nhập");
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
      _jspx_tagPool_f_button_tabindex_name_id_class.reuse(_jspx_th_f_button_0);
    }
    return false;
  }

  private boolean _jspx_meth_f_form_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_f_form_1 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_f_form_type_style_role_method_id_commandName_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_f_form_1.setPageContext(_jspx_page_context);
    _jspx_th_f_form_1.setParent(null);
    _jspx_th_f_form_1.setId("register-form");
    _jspx_th_f_form_1.setDynamicAttribute(null, "type", new String("reset"));
    _jspx_th_f_form_1.setCommandName("khachHang");
    _jspx_th_f_form_1.setAction("dangKyKhachHang.htm");
    _jspx_th_f_form_1.setMethod("post");
    _jspx_th_f_form_1.setDynamicAttribute(null, "role", new String("form"));
    _jspx_th_f_form_1.setDynamicAttribute(null, "style", new String("display: none;"));
    int[] _jspx_push_body_count_f_form_1 = new int[] { 0 };
    try {
      int _jspx_eval_f_form_1 = _jspx_th_f_form_1.doStartTag();
      if (_jspx_eval_f_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                            <div class=\"form-group\">\n");
          out.write("                                ");
          if (_jspx_meth_f_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_1, _jspx_page_context, _jspx_push_body_count_f_form_1))
            return true;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"form-group\">\n");
          out.write("                                ");
          if (_jspx_meth_f_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_1, _jspx_page_context, _jspx_push_body_count_f_form_1))
            return true;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"form-group\">\n");
          out.write("                                ");
          if (_jspx_meth_f_input_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_1, _jspx_page_context, _jspx_push_body_count_f_form_1))
            return true;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"form-group\">\n");
          out.write("                                ");
          if (_jspx_meth_f_input_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_1, _jspx_page_context, _jspx_push_body_count_f_form_1))
            return true;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"form-group\">\n");
          out.write("                                ");
          if (_jspx_meth_f_input_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_1, _jspx_page_context, _jspx_push_body_count_f_form_1))
            return true;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"form-group\">\n");
          out.write("                                ");
          if (_jspx_meth_f_input_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_1, _jspx_page_context, _jspx_push_body_count_f_form_1))
            return true;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"form-group\">\n");
          out.write("                                ");
          if (_jspx_meth_f_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_1, _jspx_page_context, _jspx_push_body_count_f_form_1))
            return true;
          out.write("\n");
          out.write("                            </div>                           \n");
          out.write("                            <div class=\"form-group\">\n");
          out.write("                                ");
          if (_jspx_meth_f_input_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_1, _jspx_page_context, _jspx_push_body_count_f_form_1))
            return true;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <div class=\"form-group\">\n");
          out.write("                                <div class=\"row\">\n");
          out.write("                                    <div class=\"col-sm-6 col-sm-offset-3\">\n");
          out.write("                                        ");
          if (_jspx_meth_f_button_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_1, _jspx_page_context, _jspx_push_body_count_f_form_1))
            return true;
          out.write("\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_f_form_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_f_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_form_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_form_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_form_1.doFinally();
      _jspx_tagPool_f_form_type_style_role_method_id_commandName_action.reuse(_jspx_th_f_form_1);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_minlenght_id_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_2.setPageContext(_jspx_page_context);
    _jspx_th_f_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_1);
    _jspx_th_f_input_2.setDynamicAttribute(null, "minlenght", new String("6"));
    _jspx_th_f_input_2.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_input_2.setPath("tenKh");
    _jspx_th_f_input_2.setId("username");
    _jspx_th_f_input_2.setTabindex("1");
    _jspx_th_f_input_2.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_2.setDynamicAttribute(null, "placeholder", new String("Tên khách hàng"));
    _jspx_th_f_input_2.setDynamicAttribute(null, "value", new String(""));
    _jspx_th_f_input_2.setDynamicAttribute(null, "required", new String("required"));
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
      _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_minlenght_id_class_nobody.reuse(_jspx_th_f_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_tabindex_required_placeholder_path_id_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_3.setPageContext(_jspx_page_context);
    _jspx_th_f_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_1);
    _jspx_th_f_input_3.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_input_3.setPath("tenTk");
    _jspx_th_f_input_3.setId("username");
    _jspx_th_f_input_3.setTabindex("1");
    _jspx_th_f_input_3.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_3.setDynamicAttribute(null, "placeholder", new String("Tên tài khoản"));
    _jspx_th_f_input_3.setDynamicAttribute(null, "required", new String("required"));
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
      _jspx_tagPool_f_input_type_tabindex_required_placeholder_path_id_class_nobody.reuse(_jspx_th_f_input_3);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_4(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_4 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_tabindex_required_placeholder_path_id_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_4.setPageContext(_jspx_page_context);
    _jspx_th_f_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_1);
    _jspx_th_f_input_4.setDynamicAttribute(null, "type", new String("password"));
    _jspx_th_f_input_4.setPath("matKhau");
    _jspx_th_f_input_4.setId("password");
    _jspx_th_f_input_4.setTabindex("1");
    _jspx_th_f_input_4.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_4.setDynamicAttribute(null, "placeholder", new String("Mật khẩu"));
    _jspx_th_f_input_4.setDynamicAttribute(null, "required", new String("required"));
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
      _jspx_tagPool_f_input_type_tabindex_required_placeholder_path_id_class_nobody.reuse(_jspx_th_f_input_4);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_5(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_5 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_id_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_5.setPageContext(_jspx_page_context);
    _jspx_th_f_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_1);
    _jspx_th_f_input_5.setDynamicAttribute(null, "type", new String("password"));
    _jspx_th_f_input_5.setPath("nhapLaiMatKhau");
    _jspx_th_f_input_5.setId("username");
    _jspx_th_f_input_5.setTabindex("1");
    _jspx_th_f_input_5.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_5.setDynamicAttribute(null, "placeholder", new String("Nhập Lại Mật Khẩu"));
    _jspx_th_f_input_5.setDynamicAttribute(null, "value", new String(""));
    _jspx_th_f_input_5.setDynamicAttribute(null, "required", new String("required"));
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
      _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_id_class_nobody.reuse(_jspx_th_f_input_5);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_6(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_6 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_id_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_6.setPageContext(_jspx_page_context);
    _jspx_th_f_input_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_1);
    _jspx_th_f_input_6.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_input_6.setPath("soDienThoai");
    _jspx_th_f_input_6.setId("username");
    _jspx_th_f_input_6.setTabindex("1");
    _jspx_th_f_input_6.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_6.setDynamicAttribute(null, "placeholder", new String("Số điện thoại"));
    _jspx_th_f_input_6.setDynamicAttribute(null, "value", new String(""));
    _jspx_th_f_input_6.setDynamicAttribute(null, "required", new String("required"));
    int[] _jspx_push_body_count_f_input_6 = new int[] { 0 };
    try {
      int _jspx_eval_f_input_6 = _jspx_th_f_input_6.doStartTag();
      if (_jspx_th_f_input_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_input_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_input_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_input_6.doFinally();
      _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_id_class_nobody.reuse(_jspx_th_f_input_6);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_7(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_7 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_id_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_7.setPageContext(_jspx_page_context);
    _jspx_th_f_input_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_1);
    _jspx_th_f_input_7.setDynamicAttribute(null, "type", new String("email"));
    _jspx_th_f_input_7.setPath("email");
    _jspx_th_f_input_7.setId("email");
    _jspx_th_f_input_7.setTabindex("1");
    _jspx_th_f_input_7.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_7.setDynamicAttribute(null, "placeholder", new String("Email"));
    _jspx_th_f_input_7.setDynamicAttribute(null, "value", new String(""));
    _jspx_th_f_input_7.setDynamicAttribute(null, "required", new String("required"));
    int[] _jspx_push_body_count_f_input_7 = new int[] { 0 };
    try {
      int _jspx_eval_f_input_7 = _jspx_th_f_input_7.doStartTag();
      if (_jspx_th_f_input_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_input_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_input_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_input_7.doFinally();
      _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_id_class_nobody.reuse(_jspx_th_f_input_7);
    }
    return false;
  }

  private boolean _jspx_meth_f_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_f_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_f_select_type_tabindex_required_path_id_class.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_f_select_0.setPageContext(_jspx_page_context);
    _jspx_th_f_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_1);
    _jspx_th_f_select_0.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_select_0.setPath("cauHoi");
    _jspx_th_f_select_0.setId("username");
    _jspx_th_f_select_0.setTabindex("1");
    _jspx_th_f_select_0.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_select_0.setDynamicAttribute(null, "required", new String("required"));
    int[] _jspx_push_body_count_f_select_0 = new int[] { 0 };
    try {
      int _jspx_eval_f_select_0 = _jspx_th_f_select_0.doStartTag();
      if (_jspx_eval_f_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"Con vật bạn yêu thích?\"> Con vật bạn yêu thích?</option>\n");
          out.write("                                    <option value=\"Trường học cấp 3 của bạn là gì?\"> Trường học cấp 3 của bạn là gì?</option>\n");
          out.write("                                    <option value=\"Người bạn mà bạn quý nhất?\"> Người bạn mà bạn quý nhất?</option>\n");
          out.write("                                    <option value=\"Món ăn bạn ưa thích nhất?\"> Món ăn bạn ưa thích nhất?</option>\n");
          out.write("                                    <option value=\"Mơ ước của bạn là gì?\"> Mơ ước của bạn là gì?</option>\n");
          out.write("                                    <option value=\"Tên đầy đủ của bạn là gì?\"> Tên đầy đủ của bạn là gì?</option>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_f_select_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_f_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_select_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_select_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_select_0.doFinally();
      _jspx_tagPool_f_select_type_tabindex_required_path_id_class.reuse(_jspx_th_f_select_0);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_8(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_8 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_id_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_8.setPageContext(_jspx_page_context);
    _jspx_th_f_input_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_1);
    _jspx_th_f_input_8.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_input_8.setPath("cauTraLoi");
    _jspx_th_f_input_8.setId("username");
    _jspx_th_f_input_8.setTabindex("1");
    _jspx_th_f_input_8.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_8.setDynamicAttribute(null, "placeholder", new String("Câu Trả Lời"));
    _jspx_th_f_input_8.setDynamicAttribute(null, "value", new String(""));
    _jspx_th_f_input_8.setDynamicAttribute(null, "required", new String("required"));
    int[] _jspx_push_body_count_f_input_8 = new int[] { 0 };
    try {
      int _jspx_eval_f_input_8 = _jspx_th_f_input_8.doStartTag();
      if (_jspx_th_f_input_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_input_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_input_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_input_8.doFinally();
      _jspx_tagPool_f_input_value_type_tabindex_required_placeholder_path_id_class_nobody.reuse(_jspx_th_f_input_8);
    }
    return false;
  }

  private boolean _jspx_meth_f_button_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:button
    org.springframework.web.servlet.tags.form.ButtonTag _jspx_th_f_button_1 = (org.springframework.web.servlet.tags.form.ButtonTag) _jspx_tagPool_f_button_value_tabindex_name_id_class.get(org.springframework.web.servlet.tags.form.ButtonTag.class);
    _jspx_th_f_button_1.setPageContext(_jspx_page_context);
    _jspx_th_f_button_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_1);
    _jspx_th_f_button_1.setName("register-submit");
    _jspx_th_f_button_1.setId("register-submit");
    _jspx_th_f_button_1.setDynamicAttribute(null, "tabindex", new String("4"));
    _jspx_th_f_button_1.setDynamicAttribute(null, "class", new String("form-control btn btn-register"));
    _jspx_th_f_button_1.setValue("Register Now");
    int[] _jspx_push_body_count_f_button_1 = new int[] { 0 };
    try {
      int _jspx_eval_f_button_1 = _jspx_th_f_button_1.doStartTag();
      if (_jspx_eval_f_button_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Ghi Danh");
          int evalDoAfterBody = _jspx_th_f_button_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_f_button_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_button_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_button_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_button_1.doFinally();
      _jspx_tagPool_f_button_value_tabindex_name_id_class.reuse(_jspx_th_f_button_1);
    }
    return false;
  }
}
