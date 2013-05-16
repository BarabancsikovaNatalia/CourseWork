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
    </afh:head>
    <afh:body>
      <h:form>
        <af:panelPage title="Logout Confirmation">
          <f:facet name="branding">
            <af:objectImage source="/images/logosbyt1.jpg"/>
          </f:facet>
          <f:facet name="appCopyright">
            <af:outputFormatted value="outputFormatted1"/>
          </f:facet>
          <f:facet name="messages">
            <af:messages/>
          </f:facet>
          <f:facet name="menuGlobal">
            <af:menuButtons>
              <af:commandMenuItem text="Cancel" action="GlobalHome"
                                  immediate="true"/>
            </af:menuButtons>
          </f:facet>
          <af:panelHorizontal halign="center">
            <af:outputText value="Are you sure you want to log out?"/>
          </af:panelHorizontal>
          <af:objectSpacer width="10" height="10"/>
          <af:panelHorizontal halign="center">
            <af:panelButtonBar>
              <af:commandButton text="Yes"
                                action="#{backing_logout.logoutButton_action}"/>
              <af:commandButton text="No" action="GlobalHome"/>
            </af:panelButtonBar>
          </af:panelHorizontal>
          <af:objectSpacer width="10" height="10"/>
        </af:panelPage>
      </h:form>
    </afh:body>
    <f:loadBundle basename="Messages" var="msg"/>
  </afh:html>
</f:view>
<%-- 
  oracle-jdev-comment:preferred-managed-bean-name:backing_logout
--%>