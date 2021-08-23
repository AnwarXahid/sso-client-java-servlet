package revesoft.controller;

import org.json.simple.JSONArray;
import revesoft.lib.Interfaces.IWidgetList;
import revesoft.lib.WidgetList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Widget")
public class Widget extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/json;charset=UTF-8");
        IWidgetList iWidgetList = new WidgetList();
        JSONArray widgets = iWidgetList.getWidgetList(request);

        PrintWriter out = response.getWriter();
        out.print(widgets);
        out.flush();
    }
}
