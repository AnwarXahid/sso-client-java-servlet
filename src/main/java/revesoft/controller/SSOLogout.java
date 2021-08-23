package revesoft.controller;

import sso.AppLogoutRequest;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ssologout")
public class SSOLogout extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getSession().invalidate();
            AppLogoutRequest appLogoutRequest = new AppLogoutRequest();
            response.sendRedirect(appLogoutRequest.buildLogoutRequest());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
