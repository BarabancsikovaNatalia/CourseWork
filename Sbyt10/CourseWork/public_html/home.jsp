<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://xmlns.oracle.com/adf/faces" prefix="af"%>
<%@ taglib uri="http://xmlns.oracle.com/adf/faces/html" prefix="afh"%>
<f:view>
  <afh:html>
    <afh:head title="Chelyabinsk Power Sales Company">
      <meta http-equiv="Content-Type"
            content="text/html; charset=windows-1252"/>
      <link type="text/css" rel="stylesheet" href="css/Sbyt.css"/>
    </afh:head>
    <afh:body>
      <h:form>
        <af:panelPage>
          <f:facet name="menu1">
            <af:menuTabs>
              <af:commandMenuItem text="Home" action="GlobalHome"
                                  selected="true"/>
            </af:menuTabs>
          </f:facet>
          <f:facet name="menuGlobal">
            <af:menuButtons>
              <af:commandMenuItem text="Help" icon="images/help.gif"
                                  action="dialog:GlobalHelp" useWindow="true"/>
            </af:menuButtons>
          </f:facet>
          <f:facet name="branding">
            <af:objectImage source="/images/logosbyt1.jpg"/>
          </f:facet>
          <f:facet name="appCopyright">
            <af:outputFormatted value="outputFormatted1"/>
          </f:facet>
          <f:facet name="messages">
            <af:messages/>
          </f:facet>
          <af:objectSpacer width="10" height="10"/>
          <af:commandButton text="Login" action="GlobalHome"/>
        </af:panelPage>
      </h:form>
    </afh:body>
    <f:loadBundle basename="Messages" var="msg"/>
  </afh:html>
</f:view>