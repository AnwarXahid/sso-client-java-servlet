package revesoft.lib.Interfaces;

import org.json.simple.JSONArray;

import javax.servlet.http.HttpServletRequest;

public interface IWidgetList {
    JSONArray getWidgetList(HttpServletRequest request);
}
