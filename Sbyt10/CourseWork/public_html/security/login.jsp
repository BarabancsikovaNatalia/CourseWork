<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=windows-1252"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <title>login</title>
    <link href="/Sbyt/css/jdeveloper.css" rel="stylesheet" media="screen"/>
  </head>
  <body><form action="j_security_check" method="post">
      <table cellspacing="3" cellpadding="2" border="0" width="100%">
        <tr>
          <td colspan="2">
            <img height="158" width="158" src="../images/logosbyt1.jpg"
                 alt="Sbyt Logo" align="top"/>
            <hr/>
          </td>
        </tr>
        <tr>
          <td colspan="2">&nbsp;Sign to the Billing System</td>
        </tr>
        <tr>
          <td colspan="2">
            <c:choose>
              <c:when test="${sessionScope.attemptsAtLogin == null}">
                <c:set value="0" var="attemptsAtLogin" scope="session"/>
              </c:when>
              <c:otherwise>
                <p>
                  <span style="background-color:rgb(255,0,0);">
                    <font color="#ff0000">
                      <font color="#ffffff">
                        <font color="#000000">
                          <span style="background-color:rgb(255,255,255);">
                            <strong>Error: </strong>
                            Invalid Username or Password
                          </span>
                        </font>
                      </font>
                    </font>
                  </span>
                </p>
                <c:set scope="session" var="attemptsAtLogin"
                       value="${sessionScope.attemptsAtLogin+1}"/>
              </c:otherwise>
            </c:choose>
          </td>
        </tr>
        <tr>
          <td width="15%" align="right">* Username</td>
          <td>
            <input type="text" name="j_username"/>
          </td>
        </tr>
        <tr>
          <td align="right" width="15%">* Password</td>
          <td>
            <input type="password" name="j_password"/>
          </td>
        </tr>
        <tr>
          <td align="right" height="31">
            <input type="submit" name="submit" value="Login"/>
          </td>
          <td align="right" height="31">&nbsp;</td>
        </tr>
        <tr>
          <td colspan="2">
            <hr/>
          </td>
        </tr>
      </table>
    </form></body>
</html>