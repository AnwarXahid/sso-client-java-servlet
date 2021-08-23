package revesoft.lib.Interfaces;

import javax.servlet.http.HttpServletRequest;

public interface ISSOAppLogin {
    String getLandingUrl(HttpServletRequest request) throws Exception;
}
