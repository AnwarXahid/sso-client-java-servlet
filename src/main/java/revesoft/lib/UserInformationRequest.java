package revesoft.lib;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.simple.parser.ParseException;
import revesoft.lib.Interfaces.IUserInformationRequest;
import sso.SSOResponseDTO;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class UserInformationRequest implements IUserInformationRequest {
    private final OkHttpClient okHttpClient = new OkHttpClient();

    public UserInformationRequest() {
    }

    @Override
    public UserInformationDTO getUserInfoModel(HttpServletRequest request, SSOResponseDTO ssoResponseDTO) {
        ApiAccessToken apiAccessToken = new ApiAccessToken();
        String accessToken = apiAccessToken.getApiAccessToken(request);
        return this.get(ssoResponseDTO.getUsername(), accessToken);
    }

    private UserInformationDTO get(String userId, String accessToken) {
        try {
            String widgetUrl = String.format(LibConstants.EMPLOYEE_DETAILS_URL, userId);

            Request request0 = new Request.Builder()
                    .url(widgetUrl)
                    .addHeader("Content-type", "application/json")
                    .addHeader("Authorization", "Bearer " + accessToken)
                    .build();

            try (Response response = okHttpClient.newCall(request0).execute()) {
                if (response.isSuccessful()) {
                    ResponseBody responseBody = response.body();
                    if (responseBody != null) {
                        return this.parseData(responseBody.string());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private UserInformationDTO parseData(String data) throws ParseException {
        return UserInformationDTO.parseJson(data);
    }
}
