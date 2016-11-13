package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hello_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/jsp/hello.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("ctxPath");
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_c_005fset_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_c_005fset_005f0.doInitBody();
        }
        do {
          out.print(request.getContextPath() );
          int evalDoAfterBody = _jspx_th_c_005fset_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005fset_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar.reuse(_jspx_th_c_005fset_005f0);
      out.write("\r\n");
      out.write("<!DOCTYPE>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/scripts/lib/css/jquery.slideunlock.css\"/>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/scripts/lib/js/jquery.js\"></script> \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/scripts/lib/js/jquery.slideunlock.js\"></script> \r\n");
      out.write("\t<title>hello</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form id=\"su01\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/save\">\r\n");
      out.write("\t\t<input type=\"text\" id=\"time\" name=\"time\" placeholder=\"xxx\"><br><br>\r\n");
      out.write("\t\t<input type=\"button\" value=\"start！\" id=\"start\" onClick=\"startTimer()\"><br><br>\r\n");
      out.write("\t\t<div class=\"slideunlock-wrapper\">\r\n");
      out.write("  \t\t\t\t<input type=\"hidden\" value=\"\" class=\"slideunlock-lockable\"/>\r\n");
      out.write("  \t\t\t\t<div class=\"slideunlock-slider\"> \r\n");
      out.write("  \t\t\t\t\t<span class=\"slideunlock-label\"></span> \r\n");
      out.write("  \t\t\t\t\t<span class=\"slideunlock-lable-tip\">Slide to unlock!</span> \r\n");
      out.write("  \t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<!--  \r\n");
      out.write("\t\t<button id=\"reset-btn\" class=\"btn btn-primary\">Reset</button>\r\n");
      out.write("\t\t-->\r\n");
      out.write("\t\t<!--  <p class=\"warn\"></p> -->\r\n");
      out.write("\t\t<input type=\"button\" value=\"click me!\">&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t<input type=\"button\" value=\"click me!\">&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t<input type=\"button\" value=\"click me!\"><br><br>\r\n");
      out.write("\t\t<input type=\"button\" value=\"stop！\" id=\"end\" onClick=\"stopTimer()\"><br><br>\r\n");
      out.write("\t\t<input type=\"button\" value=\"restart\" onClick=\"clearAll()\">\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar myVar;\r\n");
      out.write("\tvar count = 0;\r\n");
      out.write("\tfunction startTimer() {\r\n");
      out.write("\t\t/*setInterval() 间隔指定的毫秒数不停地执行指定的代码*/\r\n");
      out.write("\t\tmyVar = setInterval(function() {\r\n");
      out.write("\t\t\tmyTimer()\r\n");
      out.write("\t\t}, 1000);\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction myTimer()/* 定义一个得到本地时间的函数*/\r\n");
      out.write("\t{\r\n");
      out.write("\t\tcount++;\r\n");
      out.write("\t\tdocument.getElementById(\"time\").value = count;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction clearAll() {/* clearInterval() 方法用于停止 setInterval() 方法执行的函数代码*/\r\n");
      out.write("\t\tclearInterval(myVar);\r\n");
      out.write("\t\tcount=0;\r\n");
      out.write("\t\tdocument.getElementById(\"time\").value = \"xxx\";\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction stopTimer() {\r\n");
      out.write("\t\tdocument.getElementById(\"su01\").submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(function () {\r\n");
      out.write("        var slider = new SliderUnlock(\".slideunlock-slider\", {}, function(){\r\n");
      out.write("            <!--alert('success');-->\r\n");
      out.write("        }, function(){\r\n");
      out.write("            <!--$(\".warn\").text(\"index:\" + slider.index + \"， max:\" + slider.max + \",lableIndex:\" + slider.lableIndex + \",value:\" + $(\".slideunlock-lockable\").val() + \" date:\" + new Date().getUTCDate());\r\n");
      out.write("        \t-->\r\n");
      out.write("        });\r\n");
      out.write("        slider.init();\r\n");
      out.write("        $(\"#reset-btn\").on('click', function(){\r\n");
      out.write("            slider.reset();\r\n");
      out.write("        });\r\n");
      out.write("    })\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
