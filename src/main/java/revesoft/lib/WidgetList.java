package revesoft.lib;

import okhttp3.*;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import revesoft.lib.Interfaces.IWidgetList;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class WidgetList implements IWidgetList {
    private final OkHttpClient okHttpClient = new OkHttpClient();

    public WidgetList() {
    }

    @Override
    public JSONArray getWidgetList(HttpServletRequest request) {
        ApiAccessToken apiAccessToken = new ApiAccessToken();
        String accessToken = apiAccessToken.getApiAccessToken(request);
        String designation = this.getDesignation(request);

        return this.get(accessToken, designation);
    }

    private JSONArray get(String accessToken, String designation) {
        try {
            String widgetUrl = String.format(LibConstants.WIDGET_URL, designation);

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

    private String getDesignation(HttpServletRequest request) {
        return Long.toString((Long) request.getSession().getAttribute(LibConstants.SSO_DESIGNATION));
    }

    private JSONArray parseData(String data) throws ParseException {
        return (JSONArray) new JSONParser().parse(data);
    }
}
