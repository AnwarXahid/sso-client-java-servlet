package revesoft.lib.Interfaces;

import revesoft.lib.UserInformationDTO;
import sso.SSOResponseDTO;

import javax.servlet.http.HttpServletRequest;

public interface IUserInformationRequest {
    UserInformationDTO getUserInfoModel(HttpServletRequest request, SSOResponseDTO ssoResponseDTO);
}
