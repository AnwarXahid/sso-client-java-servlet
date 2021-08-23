package revesoft.lib;

import revesoft.lib.Interfaces.ISSOAppLogin;
import revesoft.lib.Interfaces.IUserInformationRequest;
import sso.AppLoginResponse;
import sso.SSOPropertyReader;
import sso.SSOResponseDTO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

// Controller applogin
public class SSOAppLogin implements ISSOAppLogin {

    public SSOAppLogin() {
    }

    @Override
    public String getLandingUrl(HttpServletRequest request) throws Exception {
        String token = request.getParameter(LibConstants.TOKEN);
        AppLoginResponse loginResponse = new AppLoginResponse();

        if (request.getSession() != null) {
            String nonce = (String) request.getSession().getAttribute(LibConstants.NONCE);
            loginResponse.setSessionNonce(nonce);
            try {
                SSOResponseDTO ssoResponseDTO = loginResponse.parseResponse(token);
                request.getSession().setAttribute(LibConstants.SSO_DESIGNATION, ssoResponseDTO.getOfficeUnitOrgId());

                IUserInformationRequest iUserInformationRequest = new UserInformationRequest();
                UserInformationDTO userInformationDTO = iUserInformationRequest.getUserInfoModel(request, ssoResponseDTO);

                request.getSession().setAttribute("name", userInformationDTO.getName_bng());
                request.getSession().setAttribute("designation", ssoResponseDTO.getDesignation());
                request.getSession().setAttribute("officeName", ssoResponseDTO.getOfficeNameBng());

                return ssoResponseDTO.getLandingPageUrl();
            } catch (Exception ex) {
                return SSOPropertyReader.getInstance().getLoginPageUri();
            }
        }
        return SSOPropertyReader.getInstance().getLoginPageUri();
    }
}
