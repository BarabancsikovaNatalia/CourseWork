package _security;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _login extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _login page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[4]);
            {
              org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.attemptsAtLogin == null}",java.lang.Boolean.class, __ojsp_varRes,null)));
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[5]);
                  {
                    org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
                    __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_3.setVar("attemptsAtLogin");
                    __jsp_taghandler_3.setValue("0");
                    __jsp_taghandler_3.setScope("session");
                    __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                    if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
                  }
                  out.write(__oracle_jsp_text[6]);
                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
            out.write(__oracle_jsp_text[7]);
            {
              org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[8]);
                  {
                    org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value scope");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                    __jsp_taghandler_5.setVar("attemptsAtLogin");
                    __jsp_taghandler_5.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope.attemptsAtLogin+1}",java.lang.Object.class, __ojsp_varRes,null));
                    __jsp_taghandler_5.setScope("session");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
                  }
                  out.write(__oracle_jsp_text[9]);
                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
            }
            out.write(__oracle_jsp_text[10]);
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[11]);

    }
    catch (Throwable e) {
      if (!(e instanceof javax.servlet.jsp.SkipPageException)){
        try {
          if (out != null) out.clear();
        }
        catch (Exception clearException) {
        }
        pageContext.handlePageException(e);
      }
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext, true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final char __oracle_jsp_text[][]=new char[12][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n<html>\n  <head>\n    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\"/>\n    <title>login</title>\n    <link href=\"/Sbyt/css/jdeveloper.css\" rel=\"stylesheet\" media=\"screen\"/>\n  </head>\n  <body><form action=\"j_security_check\" method=\"post\">\n      <table cellspacing=\"3\" cellpadding=\"2\" border=\"0\" width=\"100%\">\n        <tr>\n          <td colspan=\"2\">\n            <img height=\"158\" width=\"158\" src=\"../images/logosbyt1.jpg\"\n                 alt=\"Sbyt Logo\" align=\"top\"/>\n            <hr/>\n          </td>\n        </tr>\n        <tr>\n          <td colspan=\"2\">&nbsp;Sign to the Billing System</td>\n        </tr>\n        <tr>\n          <td colspan=\"2\">\n            ".toCharArray();
    __oracle_jsp_text[4] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[5] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[6] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n                <p>\n                  <span style=\"background-color:rgb(255,0,0);\">\n                    <font color=\"#ff0000\">\n                      <font color=\"#ffffff\">\n                        <font color=\"#000000\">\n                          <span style=\"background-color:rgb(255,255,255);\">\n                            <strong>Error: </strong>\n                            Invalid Username or Password\n                          </span>\n                        </font>\n                      </font>\n                    </font>\n                  </span>\n                </p>\n                ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n          </td>\n        </tr>\n        <tr>\n          <td width=\"15%\" align=\"right\">* Username</td>\n          <td>\n            <input type=\"text\" name=\"j_username\"/>\n          </td>\n        </tr>\n        <tr>\n          <td align=\"right\" width=\"15%\">* Password</td>\n          <td>\n            <input type=\"password\" name=\"j_password\"/>\n          </td>\n        </tr>\n        <tr>\n          <td align=\"right\" height=\"31\">\n            <input type=\"submit\" name=\"submit\" value=\"Login\"/>\n          </td>\n          <td align=\"right\" height=\"31\">&nbsp;</td>\n        </tr>\n        <tr>\n          <td colspan=\"2\">\n            <hr/>\n          </td>\n        </tr>\n      </table>\n    </form></body>\n</html>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
