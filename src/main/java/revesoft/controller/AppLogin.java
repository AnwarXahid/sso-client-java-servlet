package revesoft.controller;

import revesoft.lib.Interfaces.ISSOAppLogin;
import revesoft.lib.SSOAppLogin;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

@WebServlet("/applogin")
public class AppLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            ISSOAppLogin issoAppLogin = new SSOAppLogin();
            String url = issoAppLogin.getLandingUrl(request);
            System.out.println("Back from IDP!! Do as you want!!!!");

            Enumeration<String> headerNames = request.getHeaderNames();
            while(headerNames.hasMoreElements()) {
                String headerName = headerNames.nextElement();
                System.out.println("Header Name - " + headerName + ", Value - " + request.getHeader(headerName));
            }

            Enumeration<String> params = request.getParameterNames();
            while(params.hasMoreElements()){
                String paramName = params.nextElement();
                System.out.println("Parameter Name - "+paramName+", Value - "+request.getParameter(paramName));
            }

            System.out.println("Back from IDP!! Do as you want!!!!");

            System.out.println("Request body data: " + request.getParameter("token") + " %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% "  + request.getParameter("csrf_token"));
//            response.sendRedirect(url);
            response.sendRedirect("https://103.156.52.135/prp_sso/ssologout");
//            response.sendRedirect("http://localhost:8080/prp_sso/ssologout");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
