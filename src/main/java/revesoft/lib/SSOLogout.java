package revesoft.lib;

import revesoft.lib.Interfaces.ISSOLogout;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SSOLogout implements ISSOLogout {
    public SSOLogout() {
    }

    @Override
    public String getRedirectUrl(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();

        return "login.jsp";
    }
}
