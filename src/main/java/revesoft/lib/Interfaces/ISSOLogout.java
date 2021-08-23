package revesoft.lib.Interfaces;

import javax.servlet.http.HttpServletRequest;

public interface ISSOLogout {
    String getRedirectUrl(HttpServletRequest request);
}
