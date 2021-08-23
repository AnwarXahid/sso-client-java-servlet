package revesoft.lib;

import revesoft.lib.Interfaces.ISSOLogin;
import sso.AppLoginRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

// Controller /login
public class SSOLogin implements ISSOLogin {

    public SSOLogin() {
    }

    @Override
    public String getRedirectUrl(HttpServletRequest request) throws Exception {
        AppLoginRequest appLoginRequest = new AppLoginRequest();
        String authRequest = appLoginRequest.buildAuthnRequest();

        HttpSession oldSession = request.getSession();
        if (oldSession != null) {
            oldSession.invalidate();
        }

        HttpSession newSession = request.getSession(true);
        newSession.setAttribute(LibConstants.NONCE, appLoginRequest.getNonce());

        return authRequest;
    }
}
