package revesoft.lib;

import okhttp3.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import revesoft.lib.Interfaces.IApiAccessToken;
import sso.SSOPropertyReader;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class ApiAccessToken implements IApiAccessToken {

    private final OkHttpClient okHttpClient = new OkHttpClient();

    ApiAccessToken() {
    }

    @Override
    public String getApiAccessToken(HttpServletRequest request) {
        try {
            String secret = SSOPropertyReader.getInstance().getSecret();
            RequestBody formBody = new FormBody.Builder().build();

            Request request0 = new Request.Builder()
                    .url(LibConstants.CREATE_TOKEN_URL)
                    .addHeader("Content-type", "application/json")
                    .addHeader("Authorization", "Secret " + secret)
                    .post(formBody)
                    .build();

            try (Response response = okHttpClient.newCall(request0).execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("Unexpected code " + response);
                }

                ResponseBody responseBody = response.body();
                if (responseBody != null) {
                    JSONParser parser = new JSONParser();
                    JSONObject json = (JSONObject) parser.parse(responseBody.string());

                    return (String) json.get("token");
                }
                return null;
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
