package MVC;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;

/**
 * Web controller for the Beat model. You will need to import additional library: servlet-api.jar to make it work.
 */
public class DJViewServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        BeatModel model = new BeatModel();
        model.initialize();
        getServletContext().setAttribute("beatModel", model);
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // get the model from the servlet context
        BeatModel model = (BeatModel)getServletContext().getAttribute("beatModel");

        // get the http parameters/commands and call relevant methods of the model
        String bpm = req.getParameter("bpm");
        if(bpm == null){
            bpm = model.getBpm() + "";
        }

        String set = req.getParameter("set");
        if(set != null){
            int bpmValue = 90;
            bpmValue = Integer.parseInt(bpm);
            model.setBpm(bpmValue);
        }

        String decrease = req.getParameter("decrease");
        if(decrease != null){
            model.setBpm(model.getBpm() - 1);
        }

        String increase = req.getParameter("increase");
        if(increase != null){
            model.setBpm(model.getBpm() + 1);
        }

        String on = req.getParameter("on");
        if(on != null){
            model.on();
        }

        String off = req.getParameter("off");
        if(off != null){
            model.off();
        }

        // adding Beat model bean to the request
        req.setAttribute("beatModel", model);

        // passing actual model to the JSP
        RequestDispatcher dispatcher = req.getRequestDispatcher("/DJView.jsp");
        dispatcher.forward(req, resp);
    }
}
