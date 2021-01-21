package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class themmoiPt_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_button_type_class;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_form_method_commandName_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_input_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_select_type_required_path_class;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_select_path_items_itemValue_itemLabel_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_input_type_required_path_class_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_button_type_class = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_form_method_commandName_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_input_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_select_type_required_path_class = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_select_path_items_itemValue_itemLabel_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_input_type_required_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_button_type_class.release();
    _jspx_tagPool_f_form_method_commandName_action.release();
    _jspx_tagPool_f_input_path_nobody.release();
    _jspx_tagPool_f_select_type_required_path_class.release();
    _jspx_tagPool_f_select_path_items_itemValue_itemLabel_class_nobody.release();
    _jspx_tagPool_f_input_type_required_path_class_nobody.release();
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
      out.write("<div class=\"content\" style=\"width: 50rem\" >\n");
      out.write("                    ");
      if (_jspx_meth_f_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("        \n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write("\n");
      out.write("<script src=\"/HiberDangTin/views/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"/HiberDangTin/views/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"/HiberDangTin/views/js/slick.min.js\"></script>\n");
      out.write("<script src=\"/HiberDangTin/views/js/nouislider.min.js\"></script>\n");
      out.write("<script src=\"/HiberDangTin/views/js/jquery.zoom.min.js\"></script>\n");
      out.write("<script src=\"/HiberDangTin/views/js/main.js\"></script>\n");
      out.write("<script src=\"/HiberDangTin/views/js/jasny-bootstrap.min.js\"></script>\n");
      out.write("<script src=\"/HiberDangTin/views/js/perfect-scrollbar.jquery.min.js\"></script>\n");
      out.write("<!-- Plugin for the momentJs  -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/moment.min.js\"></script>\n");
      out.write("<!--  Plugin for Sweet Alert -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/sweetalert2.js\"></script>\n");
      out.write("<!-- Forms Validations Plugin -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/jquery.validate.min.js\"></script>\n");
      out.write("<!-- Plugin for the Wizard, full documentation here: https://github.com/VinceG/twitter-bootstrap-wizard -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/jquery.bootstrap-wizard.js\"></script>\n");
      out.write("<!--\tPlugin for Select, full documentation here: http://silviomoreto.github.io/bootstrap-select -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/bootstrap-selectpicker.js\"></script>\n");
      out.write("<!--  Plugin for the DateTimePicker, full documentation here: https://eonasdan.github.io/bootstrap-datetimepicker/ -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/bootstrap-datetimepicker.min.js\"></script>\n");
      out.write("<!--  DataTables.net Plugin, full documentation here: https://datatables.net/  -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/jquery.dataTables.min.js\"></script>\n");
      out.write("<!--\tPlugin for Tags, full documentation here: https://github.com/bootstrap-tagsinput/bootstrap-tagsinputs  -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/bootstrap-tagsinput.js\"></script>\n");
      out.write("\n");
      out.write("<!--  Full Calendar Plugin, full documentation here: https://github.com/fullcalendar/fullcalendar    -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/fullcalendar.min.js\"></script>\n");
      out.write("<!-- Vector Map plugin, full documentation here: http://jvectormap.com/documentation/ -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/jquery-jvectormap.js\"></script>\n");
      out.write("<!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/nouislider.min.js\"></script>\n");
      out.write("<!-- Include a polyfill for ES6 Promises (optional) for IE11, UC Browser and Android browser support SweetAlert -->\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js\"></script>\n");
      out.write("<!-- Library for adding dinamically elements -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/arrive.min.js\"></script>\n");
      out.write("<!--  Google Maps Plugin    -->\n");
      out.write("<!-- Chartist JS -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/chartist.min.js\"></script>\n");
      out.write("<!--  Notifications Plugin    -->\n");
      out.write("<script src=\"/HiberDangTin/views/js/bootstrap-notify.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $().ready(function () {\n");
      out.write("            $sidebar = $('.sidebar');\n");
      out.write("\n");
      out.write("            $sidebar_img_container = $sidebar.find('.sidebar-background');\n");
      out.write("\n");
      out.write("            $full_page = $('.full-page');\n");
      out.write("\n");
      out.write("            $sidebar_responsive = $('body > .navbar-collapse');\n");
      out.write("\n");
      out.write("            window_width = $(window).width();\n");
      out.write("\n");
      out.write("            fixed_plugin_open = $('.sidebar .sidebar-wrapper .nav li.active a p').html();\n");
      out.write("\n");
      out.write("            if (window_width > 767 && fixed_plugin_open == 'Dashboard') {\n");
      out.write("                if ($('.fixed-plugin .dropdown').hasClass('show-dropdown')) {\n");
      out.write("                    $('.fixed-plugin .dropdown').addClass('open');\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $('.fixed-plugin a').click(function (event) {\n");
      out.write("                // Alex if we click on switch, stop propagation of the event, so the dropdown will not be hide, otherwise we set the  section active\n");
      out.write("                if ($(this).hasClass('switch-trigger')) {\n");
      out.write("                    if (event.stopPropagation) {\n");
      out.write("                        event.stopPropagation();\n");
      out.write("                    } else if (window.event) {\n");
      out.write("                        window.event.cancelBubble = true;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('.fixed-plugin .active-color span').click(function () {\n");
      out.write("                $full_page_background = $('.full-page-background');\n");
      out.write("\n");
      out.write("                $(this).siblings().removeClass('active');\n");
      out.write("                $(this).addClass('active');\n");
      out.write("\n");
      out.write("                var new_color = $(this).data('color');\n");
      out.write("\n");
      out.write("                if ($sidebar.length != 0) {\n");
      out.write("                    $sidebar.attr('data-color', new_color);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if ($full_page.length != 0) {\n");
      out.write("                    $full_page.attr('filter-color', new_color);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if ($sidebar_responsive.length != 0) {\n");
      out.write("                    $sidebar_responsive.attr('data-color', new_color);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('.fixed-plugin .background-color .badge').click(function () {\n");
      out.write("                $(this).siblings().removeClass('active');\n");
      out.write("                $(this).addClass('active');\n");
      out.write("\n");
      out.write("                var new_color = $(this).data('background-color');\n");
      out.write("\n");
      out.write("                if ($sidebar.length != 0) {\n");
      out.write("                    $sidebar.attr('data-background-color', new_color);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('.fixed-plugin .img-holder').click(function () {\n");
      out.write("                $full_page_background = $('.full-page-background');\n");
      out.write("\n");
      out.write("                $(this).parent('li').siblings().removeClass('active');\n");
      out.write("                $(this).parent('li').addClass('active');\n");
      out.write("\n");
      out.write("\n");
      out.write("                var new_image = $(this).find(\"img\").attr('src');\n");
      out.write("\n");
      out.write("                if ($sidebar_img_container.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {\n");
      out.write("                    $sidebar_img_container.fadeOut('fast', function () {\n");
      out.write("                        $sidebar_img_container.css('background-image', 'url(\"' + new_image + '\")');\n");
      out.write("                        $sidebar_img_container.fadeIn('fast');\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if ($full_page_background.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {\n");
      out.write("                    var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');\n");
      out.write("\n");
      out.write("                    $full_page_background.fadeOut('fast', function () {\n");
      out.write("                        $full_page_background.css('background-image', 'url(\"' + new_image_full_page + '\")');\n");
      out.write("                        $full_page_background.fadeIn('fast');\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if ($('.switch-sidebar-image input:checked').length == 0) {\n");
      out.write("                    var new_image = $('.fixed-plugin li.active .img-holder').find(\"img\").attr('src');\n");
      out.write("                    var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');\n");
      out.write("\n");
      out.write("                    $sidebar_img_container.css('background-image', 'url(\"' + new_image + '\")');\n");
      out.write("                    $full_page_background.css('background-image', 'url(\"' + new_image_full_page + '\")');\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if ($sidebar_responsive.length != 0) {\n");
      out.write("                    $sidebar_responsive.css('background-image', 'url(\"' + new_image + '\")');\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('.switch-sidebar-image input').change(function () {\n");
      out.write("                $full_page_background = $('.full-page-background');\n");
      out.write("\n");
      out.write("                $input = $(this);\n");
      out.write("\n");
      out.write("                if ($input.is(':checked')) {\n");
      out.write("                    if ($sidebar_img_container.length != 0) {\n");
      out.write("                        $sidebar_img_container.fadeIn('fast');\n");
      out.write("                        $sidebar.attr('data-image', '#');\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if ($full_page_background.length != 0) {\n");
      out.write("                        $full_page_background.fadeIn('fast');\n");
      out.write("                        $full_page.attr('data-image', '#');\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    background_image = true;\n");
      out.write("                } else {\n");
      out.write("                    if ($sidebar_img_container.length != 0) {\n");
      out.write("                        $sidebar.removeAttr('data-image');\n");
      out.write("                        $sidebar_img_container.fadeOut('fast');\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    if ($full_page_background.length != 0) {\n");
      out.write("                        $full_page.removeAttr('data-image', '#');\n");
      out.write("                        $full_page_background.fadeOut('fast');\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    background_image = false;\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('.switch-sidebar-mini input').change(function () {\n");
      out.write("                $body = $('body');\n");
      out.write("\n");
      out.write("                $input = $(this);\n");
      out.write("\n");
      out.write("                if (md.misc.sidebar_mini_active == true) {\n");
      out.write("                    $('body').removeClass('sidebar-mini');\n");
      out.write("                    md.misc.sidebar_mini_active = false;\n");
      out.write("\n");
      out.write("                    $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar();\n");
      out.write("\n");
      out.write("                } else {\n");
      out.write("\n");
      out.write("                    $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar('destroy');\n");
      out.write("\n");
      out.write("                    setTimeout(function () {\n");
      out.write("                        $('body').addClass('sidebar-mini');\n");
      out.write("\n");
      out.write("                        md.misc.sidebar_mini_active = true;\n");
      out.write("                    }, 300);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                // we simulate the window Resize so the charts will get updated in realtime.\n");
      out.write("                var simulateWindowResize = setInterval(function () {\n");
      out.write("                    window.dispatchEvent(new Event('resize'));\n");
      out.write("                }, 180);\n");
      out.write("\n");
      out.write("                // we stop the simulation of Window Resize after the animations are completed\n");
      out.write("                setTimeout(function () {\n");
      out.write("                    clearInterval(simulateWindowResize);\n");
      out.write("                }, 1000);\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        // Javascript method's body can be found in assets/js/demos.js\n");
      out.write("        md.initDashboardPageCharts();\n");
      out.write("\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(function () {\n");
      out.write("        $('#btnUploadanh').click(function () {\n");
      out.write("            $('#fileuploadanh').trigger('click');\n");
      out.write("        });\n");
      out.write("        $('#fileuploadanh').change(function () {\n");
      out.write("            if (window.FormData !== undefined)\n");
      out.write("            {\n");
      out.write("                var fileupload = $('#fileuploadanh').get(0);\n");
      out.write("                var files = fileupload.files;\n");
      out.write("                var formdata = new FormData();\n");
      out.write("                formdata.append('file', files[0]);\n");
      out.write("                $.ajax({\n");
      out.write("                    type: 'POST',\n");
      out.write("                    url: 'uploadanhsp.htm',\n");
      out.write("                    contentType: false,\n");
      out.write("                    processData: false,\n");
      out.write("                    data: formdata,\n");
      out.write("                    success: function (url)\n");
      out.write("                    {\n");
      out.write("                        $('#anh').val(url);\n");
      out.write("                        $('#show').attr('src', url);\n");
      out.write("                    },\n");
      out.write("                    error: function (msg)\n");
      out.write("                    {\n");
      out.write("                        alert(msg.statusText);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        });\n");
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
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_f_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_f_form_method_commandName_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_f_form_0.setPageContext(_jspx_page_context);
    _jspx_th_f_form_0.setParent(null);
    _jspx_th_f_form_0.setAction("luumoipt.htm");
    _jspx_th_f_form_0.setMethod("post");
    _jspx_th_f_form_0.setCommandName("phongtro");
    int[] _jspx_push_body_count_f_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_f_form_0 = _jspx_th_f_form_0.doStartTag();
      if (_jspx_eval_f_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label for=\"inputAddress\">Tên sản phẩm</label>\n");
          out.write("                            ");
          if (_jspx_meth_f_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label for=\"inputAddress2\">Ảnh sản phẩm</label>\n");
          out.write("                            ");
          if (_jspx_meth_f_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                            \n");
          out.write("                            \n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label for=\"inputAddress2\">Giá sản phẩm</label>\n");
          out.write("                            ");
          if (_jspx_meth_f_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label for=\"inputAddress2\">Địa Chỉ</label>\n");
          out.write("                            ");
          if (_jspx_meth_f_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label for=\"inputAddress2\">Dịch Vụ</label>\n");
          out.write("                            ");
          if (_jspx_meth_f_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label for=\"inputAddress2\">Mô tả</label>\n");
          out.write("                            ");
          if (_jspx_meth_f_input_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label for=\"inputAddress2\">Nhóm Phòng Trọ</label>\n");
          out.write("                            ");
          if (_jspx_meth_f_select_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label for=\"inputAddress2\">Tỉnh thành</label>\n");
          out.write("                            ");
          if (_jspx_meth_f_select_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label for=\"inputAddress2\">Liên Hê</label>\n");
          out.write("                            ");
          if (_jspx_meth_f_select_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label for=\"inputAddress2\">Người Đăng</label>\n");
          out.write("                            ");
          if (_jspx_meth_f_select_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"form-group\">\n");
          out.write("                            <label for=\"inputAddress3\">Trạng thái</label>\n");
          out.write("                            ");
          if (_jspx_meth_f_input_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        ");
          if (_jspx_meth_f_button_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_form_0, _jspx_page_context, _jspx_push_body_count_f_form_0))
            return true;
          out.write("\n");
          out.write("                    ");
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

  private boolean _jspx_meth_f_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_required_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_0.setPageContext(_jspx_page_context);
    _jspx_th_f_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_0.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_input_0.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_0.setPath("tenPt");
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
      _jspx_tagPool_f_input_type_required_path_class_nobody.reuse(_jspx_th_f_input_0);
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
    _jspx_th_f_input_1.setPath("anh");
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
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_required_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_2.setPageContext(_jspx_page_context);
    _jspx_th_f_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_2.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_input_2.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_2.setPath("gia");
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
      _jspx_tagPool_f_input_type_required_path_class_nobody.reuse(_jspx_th_f_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_required_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_3.setPageContext(_jspx_page_context);
    _jspx_th_f_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_3.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_input_3.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_3.setPath("diaChi");
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
      _jspx_tagPool_f_input_type_required_path_class_nobody.reuse(_jspx_th_f_input_3);
    }
    return false;
  }

  private boolean _jspx_meth_f_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_f_select_0 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_f_select_type_required_path_class.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_f_select_0.setPageContext(_jspx_page_context);
    _jspx_th_f_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_select_0.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_select_0.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_select_0.setPath("dichVu");
    _jspx_th_f_select_0.setDynamicAttribute(null, "required", new String("required"));
    int[] _jspx_push_body_count_f_select_0 = new int[] { 0 };
    try {
      int _jspx_eval_f_select_0 = _jspx_th_f_select_0.doStartTag();
      if (_jspx_eval_f_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <option value=\"Cho thuê phòng trọ\"> Cho thuê phòng trọ</option>\n");
          out.write("                                    <option value=\"Cho thuê nhà nguyên căn\"> Cho thuê nhà nguyên căn</option>\n");
          out.write("                                    <option value=\"Tìm người ở ghép\"> Tìm người ở ghép</option>\n");
          out.write("                                    <option value=\"Cho thuê mặt bằng\"> Cho thuê mặt bằng</option>                                   \n");
          out.write("                            ");
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
      _jspx_tagPool_f_select_type_required_path_class.reuse(_jspx_th_f_select_0);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_4(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_4 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_required_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_4.setPageContext(_jspx_page_context);
    _jspx_th_f_input_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_4.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_input_4.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_4.setPath("mota");
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
      _jspx_tagPool_f_input_type_required_path_class_nobody.reuse(_jspx_th_f_input_4);
    }
    return false;
  }

  private boolean _jspx_meth_f_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_f_select_1 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_f_select_path_items_itemValue_itemLabel_class_nobody.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_f_select_1.setPageContext(_jspx_page_context);
    _jspx_th_f_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_select_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${npt}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_f_select_1.setPath("maNhomPt");
    _jspx_th_f_select_1.setItemLabel("tenNhomPt");
    _jspx_th_f_select_1.setItemValue("maNhomPt");
    _jspx_th_f_select_1.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_f_select_1 = new int[] { 0 };
    try {
      int _jspx_eval_f_select_1 = _jspx_th_f_select_1.doStartTag();
      if (_jspx_th_f_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_select_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_select_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_select_1.doFinally();
      _jspx_tagPool_f_select_path_items_itemValue_itemLabel_class_nobody.reuse(_jspx_th_f_select_1);
    }
    return false;
  }

  private boolean _jspx_meth_f_select_2(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_f_select_2 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_f_select_path_items_itemValue_itemLabel_class_nobody.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_f_select_2.setPageContext(_jspx_page_context);
    _jspx_th_f_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_select_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${th}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_f_select_2.setPath("maTinh");
    _jspx_th_f_select_2.setItemLabel("tenTinh");
    _jspx_th_f_select_2.setItemValue("maTinh");
    _jspx_th_f_select_2.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_f_select_2 = new int[] { 0 };
    try {
      int _jspx_eval_f_select_2 = _jspx_th_f_select_2.doStartTag();
      if (_jspx_th_f_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_select_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_select_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_select_2.doFinally();
      _jspx_tagPool_f_select_path_items_itemValue_itemLabel_class_nobody.reuse(_jspx_th_f_select_2);
    }
    return false;
  }

  private boolean _jspx_meth_f_select_3(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_f_select_3 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_f_select_path_items_itemValue_itemLabel_class_nobody.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_f_select_3.setPageContext(_jspx_page_context);
    _jspx_th_f_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_select_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${kh}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_f_select_3.setPath("maKh");
    _jspx_th_f_select_3.setItemLabel("soDienThoai");
    _jspx_th_f_select_3.setItemValue("maKh");
    _jspx_th_f_select_3.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_f_select_3 = new int[] { 0 };
    try {
      int _jspx_eval_f_select_3 = _jspx_th_f_select_3.doStartTag();
      if (_jspx_th_f_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_select_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_select_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_select_3.doFinally();
      _jspx_tagPool_f_select_path_items_itemValue_itemLabel_class_nobody.reuse(_jspx_th_f_select_3);
    }
    return false;
  }

  private boolean _jspx_meth_f_select_4(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:select
    org.springframework.web.servlet.tags.form.SelectTag _jspx_th_f_select_4 = (org.springframework.web.servlet.tags.form.SelectTag) _jspx_tagPool_f_select_path_items_itemValue_itemLabel_class_nobody.get(org.springframework.web.servlet.tags.form.SelectTag.class);
    _jspx_th_f_select_4.setPageContext(_jspx_page_context);
    _jspx_th_f_select_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_select_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${kh}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_f_select_4.setPath("maKh");
    _jspx_th_f_select_4.setItemLabel("tenKh");
    _jspx_th_f_select_4.setItemValue("maKh");
    _jspx_th_f_select_4.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_f_select_4 = new int[] { 0 };
    try {
      int _jspx_eval_f_select_4 = _jspx_th_f_select_4.doStartTag();
      if (_jspx_th_f_select_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_f_select_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_f_select_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_f_select_4.doFinally();
      _jspx_tagPool_f_select_path_items_itemValue_itemLabel_class_nobody.reuse(_jspx_th_f_select_4);
    }
    return false;
  }

  private boolean _jspx_meth_f_input_5(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_f_input_5 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_f_input_type_required_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_f_input_5.setPageContext(_jspx_page_context);
    _jspx_th_f_input_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_input_5.setDynamicAttribute(null, "type", new String("text"));
    _jspx_th_f_input_5.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_f_input_5.setPath("trangThai");
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
      _jspx_tagPool_f_input_type_required_path_class_nobody.reuse(_jspx_th_f_input_5);
    }
    return false;
  }

  private boolean _jspx_meth_f_button_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_f_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:button
    org.springframework.web.servlet.tags.form.ButtonTag _jspx_th_f_button_0 = (org.springframework.web.servlet.tags.form.ButtonTag) _jspx_tagPool_f_button_type_class.get(org.springframework.web.servlet.tags.form.ButtonTag.class);
    _jspx_th_f_button_0.setPageContext(_jspx_page_context);
    _jspx_th_f_button_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_form_0);
    _jspx_th_f_button_0.setDynamicAttribute(null, "type", new String("submit"));
    _jspx_th_f_button_0.setDynamicAttribute(null, "class", new String("btn btn-primary"));
    int[] _jspx_push_body_count_f_button_0 = new int[] { 0 };
    try {
      int _jspx_eval_f_button_0 = _jspx_th_f_button_0.doStartTag();
      if (_jspx_eval_f_button_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("Đăng Tin");
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
      _jspx_tagPool_f_button_type_class.reuse(_jspx_th_f_button_0);
    }
    return false;
  }
}
