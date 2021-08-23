package revesoft.controller;

import revesoft.lib.Interfaces.ISSOLogout;
import revesoft.lib.SSOLogout;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        ISSOLogout issoLogout = new SSOLogout();
        try {
            response.sendRedirect(issoLogout.getRedirectUrl(request));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
