
import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _publicHome extends com.orionserver.http.OrionHttpJspPage {


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
    _publicHome page = this;
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
                          oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag __jsp_taghandler_6=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelPageTag");
                          __jsp_taghandler_6.setParent(__jsp_taghandler_5);
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
                                        oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag __jsp_taghandler_9=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag text selected action");
                                        __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                                        __jsp_taghandler_9.setText("Home");
                                        __jsp_taghandler_9.setSelected("true");
                                        __jsp_taghandler_9.setAction("GlobalHome");
                                        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                                        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,8);
                                      }
                                      out.write(__oracle_jsp_text[15]);
                                    }
                                    if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,7);
                                  }
                                  out.write(__oracle_jsp_text[16]);
                                } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,6);
                            }
                            out.write(__oracle_jsp_text[17]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_10=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_10.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_10.setName("menuGlobal");
                              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[18]);
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuButtonsTag __jsp_taghandler_11=(oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuButtonsTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuButtonsTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreMenuButtonsTag");
                                    __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                                    __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                    {
                                      out.write(__oracle_jsp_text[19]);
                                      {
                                        oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag __jsp_taghandler_12=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandMenuItemTag text icon useWindow action");
                                        __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                                        __jsp_taghandler_12.setText("Help");
                                        __jsp_taghandler_12.setIcon("images/help.gif");
                                        __jsp_taghandler_12.setUseWindow("true");
                                        __jsp_taghandler_12.setAction("dialog:GlobalHelp");
                                        __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                                        if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                          return;
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,8);
                                      }
                                      out.write(__oracle_jsp_text[20]);
                                    }
                                    if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,7);
                                  }
                                  out.write(__oracle_jsp_text[21]);
                                } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,6);
                            }
                            out.write(__oracle_jsp_text[22]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_13=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_13.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_13.setName("branding");
                              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[23]);
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.output.CoreObjectImageTag __jsp_taghandler_14=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectImageTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectImageTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectImageTag source");
                                    __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                                    __jsp_taghandler_14.setSource("/images/logosbyt1.jpg");
                                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,7);
                                  }
                                  out.write(__oracle_jsp_text[24]);
                                } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,6);
                            }
                            out.write(__oracle_jsp_text[25]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_15=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_15.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_15.setName("appCopyright");
                              __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[26]);
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag __jsp_taghandler_16=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputFormattedTag value");
                                    __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                                    __jsp_taghandler_16.setValue("outputFormatted1");
                                    __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                                    if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,7);
                                  }
                                  out.write(__oracle_jsp_text[27]);
                                } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,6);
                            }
                            out.write(__oracle_jsp_text[28]);
                            {
                              javax.faces.webapp.FacetTag __jsp_taghandler_17=(javax.faces.webapp.FacetTag)OracleJspRuntime.getTagHandler(pageContext,javax.faces.webapp.FacetTag.class,"javax.faces.webapp.FacetTag name");
                              __jsp_taghandler_17.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_17.setName("messages");
                              __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[29]);
                                  {
                                    oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag __jsp_taghandler_18=(oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreMessagesTag");
                                    __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                                    __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                                    if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,7);
                                  }
                                  out.write(__oracle_jsp_text[30]);
                                } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,6);
                            }
                            out.write(__oracle_jsp_text[31]);
                            {
                              oracle.adfinternal.view.faces.taglib.core.layout.CorePanelGroupTag __jsp_taghandler_19=(oracle.adfinternal.view.faces.taglib.core.layout.CorePanelGroupTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.layout.CorePanelGroupTag.class,"oracle.adfinternal.view.faces.taglib.core.layout.CorePanelGroupTag layout styleClass");
                              __jsp_taghandler_19.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_19.setLayout("vertical");
                              __jsp_taghandler_19.setStyleClass("homePageText");
                              __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                out.write(__oracle_jsp_text[32]);
                                {
                                  oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_20=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag value");
                                  __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                                  __jsp_taghandler_20.setValue("outputText1");
                                  __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                                  if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,7);
                                }
                                out.write(__oracle_jsp_text[33]);
                                {
                                  oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_21=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag value");
                                  __jsp_taghandler_21.setParent(__jsp_taghandler_19);
                                  __jsp_taghandler_21.setValue("outputText2");
                                  __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                                  if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,7);
                                }
                                out.write(__oracle_jsp_text[34]);
                                {
                                  oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag __jsp_taghandler_22=(oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreOutputTextTag value");
                                  __jsp_taghandler_22.setParent(__jsp_taghandler_19);
                                  __jsp_taghandler_22.setValue("outputText3");
                                  __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                                  if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,7);
                                }
                                out.write(__oracle_jsp_text[35]);
                              }
                              if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,6);
                            }
                            out.write(__oracle_jsp_text[36]);
                            {
                              oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_23=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag width height");
                              __jsp_taghandler_23.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_23.setWidth("10");
                              __jsp_taghandler_23.setHeight("10");
                              __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                              if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,6);
                            }
                            out.write(__oracle_jsp_text[37]);
                            {
                              oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag __jsp_taghandler_24=(oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag.class,"oracle.adfinternal.view.faces.taglib.core.nav.CoreCommandButtonTag text action");
                              __jsp_taghandler_24.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_24.setText("Login");
                              __jsp_taghandler_24.setAction("GlobalHome");
                              __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                              if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,6);
                            }
                            out.write(__oracle_jsp_text[38]);
                            {
                              oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag __jsp_taghandler_25=(oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag)OracleJspRuntime.getTagHandler(pageContext,oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag.class,"oracle.adfinternal.view.faces.taglib.core.output.CoreObjectSpacerTag width height");
                              __jsp_taghandler_25.setParent(__jsp_taghandler_6);
                              __jsp_taghandler_25.setWidth("10");
                              __jsp_taghandler_25.setHeight("10");
                              __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                              if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,6);
                            }
                            out.write(__oracle_jsp_text[39]);
                          }
                          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,5);
                        }
                        out.write(__oracle_jsp_text[40]);
                      }
                      if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,4);
                    }
                    out.write(__oracle_jsp_text[41]);
                  }
                  if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                }
                out.write(__oracle_jsp_text[42]);
                {
                  com.sun.faces.taglib.jsf_core.LoadBundleTag __jsp_taghandler_26=(com.sun.faces.taglib.jsf_core.LoadBundleTag)OracleJspRuntime.getTagHandler(pageContext,com.sun.faces.taglib.jsf_core.LoadBundleTag.class,"com.sun.faces.taglib.jsf_core.LoadBundleTag basename var");
                  __jsp_taghandler_26.setParent(__jsp_taghandler_2);
                  __jsp_taghandler_26.setBasename("Messages");
                  __jsp_taghandler_26.setVar("msg");
                  __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                  if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,3);
                }
                out.write(__oracle_jsp_text[43]);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
            out.write(__oracle_jsp_text[44]);
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
  private static final char __oracle_jsp_text[][]=new char[45][];
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
    "\n      <meta http-equiv=\"Content-Type\"\n            content=\"text/html; charset=windows-1252\"/>\n      <link type=\"text/css\" rel=\"stylesheet\" href=\"css/Sbyt.css\"/>\n    ".toCharArray();
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
    "\n            ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n              ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n          ".toCharArray();
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
    "\n            ".toCharArray();
    __oracle_jsp_text[34] = 
    "\n            ".toCharArray();
    __oracle_jsp_text[35] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[36] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[37] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[38] = 
    "\n          ".toCharArray();
    __oracle_jsp_text[39] = 
    "\n        ".toCharArray();
    __oracle_jsp_text[40] = 
    "\n      ".toCharArray();
    __oracle_jsp_text[41] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[42] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[43] = 
    "\n  ".toCharArray();
    __oracle_jsp_text[44] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}