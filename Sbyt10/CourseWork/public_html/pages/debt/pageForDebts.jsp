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
        <af:panelPage title="Change This">
          <f:facet name="menu1">
            <af:menuTabs>
              <af:commandMenuItem text="Home" action="GlobalHome"/>
              <af:commandMenuItem text="Contracter" action="GlobalContracter"
                                  disabled="true"/>
              <af:commandMenuItem action="GlobalEconomist" text="Economist"
                                  disabled="true"/>
              <af:commandMenuItem text="Counter" action="GlobalCounter"
                                  disabled="true"/>
              <af:commandMenuItem text="Specialist in working with debt"
                                  action="GlobalDebt" selected="true"/>
              <af:commandMenuItem text="Analyst" action="GlobalAnalyst"
                                  disabled="true"/>
              <af:commandMenuItem text="Admin" action="GlobalAdmin"
                                  disabled="true"/>
            </af:menuTabs>
          </f:facet>
          <f:facet name="menuGlobal">
            <af:menuButtons>
              <af:commandMenuItem text="Logout" icon="images/logout.png"
                                  action="GlobalLogout"/>
              <af:commandMenuItem text="Help" icon="images/help.gif" useWindow="true"
                                  action="dialog:GlobalHelp"/>
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
        </af:panelPage>
      </h:form>
    </afh:body>
    <f:loadBundle basename="Messages" var="msg"/>
  </afh:html>
</f:view>