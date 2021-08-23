package revesoft.lib.Interfaces;

import javax.servlet.http.HttpServletRequest;

public interface IApiAccessToken {
    String getApiAccessToken(HttpServletRequest request);
}
