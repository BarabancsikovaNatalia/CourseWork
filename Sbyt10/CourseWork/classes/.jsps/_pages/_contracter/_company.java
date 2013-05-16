package _pages._contracter;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _company extends com.orionserver.http.OrionHttpJspPage {


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
    _company page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      {
        com.sun.faces.taglib.jsf_core.ViewTag __jsp_taghandler_1=(com.sun.faces.taglib.jsf_core.ViewTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.ViewTag.class,"com.sun.faces.taglib.jsf_core.ViewTag");
        __jsp_taghandler_1.setParent(null);
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_1,__jsp_tag_starteval,out);
          do {
            out.write(__oracle_jsp_text[6]);
            {
              oracle.adfinternal.view.faces.taglib.html.HtmlHtmlTag __jsp_taghandler_2=(oracle.adfinternal.view.faces.taglib.html.HtmlHtmlTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.html.HtmlHtmlTag.class,"oracle.adfinternal.view.faces.taglib.html.HtmlHtmlTag");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                out.write(__oracle_jsp_text[7]);
                {
                  oracle.adfinternal.view.faces.taglib.html.HtmlHeadTag __jsp_taghandler_3=(oracle.adfinternal.view.faces.taglib.html.HtmlHeadTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.html.HtmlHeadTag.class,"oracle.adfinternal.view.faces.taglib.html.HtmlHeadTag title");
                  __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_3.setTitle("Chelyabinsk Power Sales Company");
                  __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    out.write(__oracle_jsp_text[8]);
                  }
                  if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
                }
                out.write(__oracle_jsp_text[9]);
                {
                  oracle.adfinternal.view.faces.taglib.html.HtmlBodyTag __jsp_taghandler_4=(oracle.adfinternal.view.faces.taglib.html.HtmlBodyTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.html.HtmlBodyTag.class,"oracle.adfinternal.view.faces.taglib.html.HtmlBodyTag");
                  __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                  __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    out.write(__oracle_jsp_text[10]);
                    {
                      com.sun.faces.taglib.html_basic.FormTag __jsp_taghandler_5=(com.sun.faces.taglib.html_basic.FormTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.html_basic.FormTag.class,"com.sun.faces.taglib.html_basic.FormTag");
                      __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                      __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        out.write(__oracle_jsp_text[11]);
                        {
                          oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag __jsp_taghandler_6=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag title");
                          __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                          __jsp_taghandler_6.setTitle("Enter or delete data about Contracticing Parties (company)");
                          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                          {
                            out.write(__oracle_jsp_text[12]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_7=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_7.setName("menu1");
                              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[13]);
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuTabsTag __jsp_taghandler_8=(oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuTabsTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuTabsTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuTabsTag");
                                    __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                                    __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                    {
                                      out.write(__oracle_jsp_text[14]);
                                      {
                                        oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag __jsp_taghandler_9=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag text action");
                                        __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                                        __jsp_taghandler_9.setText("Home");
                                        __jsp_taghandler_9.setAction("GlobalHome");
                                        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                                        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,8);
                                      }
                                      out.write(__oracle_jsp_text[15]);
                                      {
                                        oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag __jsp_taghandler_10=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag text action");
                                        __jsp_taghandler_10.setParent(__jsp_taghandler_8);
                                        __jsp_taghandler_10.setText("My Profile");
                                        __jsp_taghandler_10.setAction("GlobalProfile");
                                        __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                                        if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,8);
                                      }
                                      out.write(__oracle_jsp_text[16]);
                                      {
                                        oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag __jsp_taghandler_11=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag text selected action");
                                        __jsp_taghandler_11.setParent(__jsp_taghandler_8);
                                        __jsp_taghandler_11.setText("References");
                                        __jsp_taghandler_11.setSelected("false");
                                        __jsp_taghandler_11.setAction("GlobalRef");
                                        __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                                        if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,8);
                                      }
                                      out.write(__oracle_jsp_text[17]);
                                    }
                                    if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,7);
                                  }
                                  out.write(__oracle_jsp_text[18]);
                                } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,6);
                            }
                            out.write(__oracle_jsp_text[19]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_12=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_12.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_12.setName("menuGlobal");
                              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[20]);
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuButtonsTag __jsp_taghandler_13=(oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuButtonsTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuButtonsTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuButtonsTag");
                                    __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                                    __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                    {
                                      out.write(__oracle_jsp_text[21]);
                                      {
                                        oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag __jsp_taghandler_14=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag text icon action");
                                        __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                                        __jsp_taghandler_14.setText("Logout");
                                        __jsp_taghandler_14.setIcon("images/logout.png");
                                        __jsp_taghandler_14.setAction("GlobalLogout");
                                        __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                                        if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,8);
                                      }
                                      out.write(__oracle_jsp_text[22]);
                                      {
                                        oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag __jsp_taghandler_15=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag text icon useWindow action");
                                        __jsp_taghandler_15.setParent(__jsp_taghandler_13);
                                        __jsp_taghandler_15.setText("Help");
                                        __jsp_taghandler_15.setIcon("images/help.gif");
                                        __jsp_taghandler_15.setUseWindow("true");
                                        __jsp_taghandler_15.setAction("dialog:GlobalHelp");
                                        __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                                        if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,8);
                                      }
                                      out.write(__oracle_jsp_text[23]);
                                    }
                                    if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,7);
                                  }
                                  out.write(__oracle_jsp_text[24]);
                                } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,6);
                            }
                            out.write(__oracle_jsp_text[25]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_16=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_16.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_16.setName("branding");
                              __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[26]);
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.output.CoreObjectImageTag __jsp_taghandler_17=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectImageTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectImageTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectImageTag source");
                                    __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                                    __jsp_taghandler_17.setSource("/images/logosbyt1.jpg");
                                    __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                                    if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,7);
                                  }
                                  out.write(__oracle_jsp_text[27]);
                                } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,6);
                            }
                            out.write(__oracle_jsp_text[28]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_18=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_18.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_18.setName("appCopyright");
                              __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[29]);
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag __jsp_taghandler_19=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag value");
                                    __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                                    __jsp_taghandler_19.setValue("outputFormatted1");
                                    __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                                    if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,7);
                                  }
                                  out.write(__oracle_jsp_text[30]);
                                } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,6);
                            }
                            out.write(__oracle_jsp_text[31]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_20=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_20.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_20.setName("messages");
                              __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[32]);
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag __jsp_taghandler_21=(oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag");
                                    __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                                    __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                                    if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,7);
                                  }
                                  out.write(__oracle_jsp_text[33]);
                                } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,6);
                            }
                            out.write(__oracle_jsp_text[34]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_22=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_22.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_22.setName("menu2");
                              __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[35]);
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuBarTag __jsp_taghandler_23=(oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuBarTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuBarTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuBarTag");
                                    __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                                    __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                    {
                                      out.write(__oracle_jsp_text[36]);
                                      {
                                        oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag __jsp_taghandler_24=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag text action");
                                        __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                                        __jsp_taghandler_24.setText("Contracting Parties (person)");
                                        __jsp_taghandler_24.setAction("person1");
                                        __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                                        if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,8);
                                      }
                                      out.write(__oracle_jsp_text[37]);
                                      {
                                        oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag __jsp_taghandler_25=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag text selected action");
                                        __jsp_taghandler_25.setParent(__jsp_taghandler_23);
                                        __jsp_taghandler_25.setText("Contracting Parties (company)");
                                        __jsp_taghandler_25.setSelected("true");
                                        __jsp_taghandler_25.setAction("company");
                                        __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                                        if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,8);
                                      }
                                      out.write(__oracle_jsp_text[38]);
                                      {
                                        oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag __jsp_taghandler_26=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag text action");
                                        __jsp_taghandler_26.setParent(__jsp_taghandler_23);
                                        __jsp_taghandler_26.setText("Contracts");
                                        __jsp_taghandler_26.setAction("contract1");
                                        __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                                        if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,8);
                                      }
                                      out.write(__oracle_jsp_text[39]);
                                    }
                                    if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,7);
                                  }
                                  out.write(__oracle_jsp_text[40]);
                                } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,6);
                            }
                            out.write(__oracle_jsp_text[41]);
                          }
                          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,5);
                        }
                        out.write(__oracle_jsp_text[42]);
                      }
                      if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,4);
                    }
                    out.write(__oracle_jsp_text[43]);
                  }
                  if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                }
                out.write(__oracle_jsp_text[44]);
                {
                  com.sun.faces.taglib.jsf_core.LoadBundleTag __jsp_taghandler_27=(com.sun.faces.taglib.jsf_core.LoadBundleTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.LoadBundleTag.class,"com.sun.faces.taglib.jsf_core.LoadBundleTag basename var");
                  __jsp_taghandler_27.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_27.setBasename("Messages");
                  __jsp_taghandler_27.setVar("msg");
                  __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                  if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,3);
                }
                out.write(__oracle_jsp_text[45]);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
            out.write(__oracle_jsp_text[46]);
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }

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
  private static final char __oracle_jsp_text[][]=new char[47][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n\"http://www.w3.org/TR/html4/loose.dtd\">\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n      <meta http-equiv=\"Content-Type\"\n            content=\"text/html; charset=windows-1252\"/>\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[23] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[25] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[26] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[27] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[28] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[29] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[30] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[31] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[32] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[33] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[34] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[35] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[36] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[37] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[38] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[39] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[40] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[41] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[42] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[43] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[44] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[45] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[46] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
