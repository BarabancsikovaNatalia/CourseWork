package Sbyt.view.backing;

import coursework.view.SbytBackingBean;

import java.io.IOException;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends SbytBackingBean {
    public Logout() {
    }

    public String logoutButton_action()throws IOException {
    ExternalContext ectx = FacesContext.getCurrentInstance().getExternalContext();
    HttpServletResponse response = (HttpServletResponse)ectx.getResponse();
    HttpSession session = (HttpSession)ectx.getSession(false);
    session.invalidate();
    response.sendRedirect("../home.jsp");
        return null;
    }
}
