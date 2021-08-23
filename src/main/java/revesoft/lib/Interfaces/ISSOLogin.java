package revesoft.lib.Interfaces;

import javax.servlet.http.HttpServletRequest;

public interface ISSOLogin {
    String getRedirectUrl(HttpServletRequest request) throws Exception;
}
