package revesoft.controller;

import revesoft.lib.Interfaces.ISSOAppLogin;
import revesoft.lib.SSOAppLogin;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/applogin")
public class AppLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            ISSOAppLogin issoAppLogin = new SSOAppLogin();
            String url = issoAppLogin.getLandingUrl(request);
            System.out.println("Back from IDP!! Do as you want!!!!");
//            response.sendRedirect(url);
            response.sendRedirect("https://103.156.52.135/prp_sso/ssologout");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
