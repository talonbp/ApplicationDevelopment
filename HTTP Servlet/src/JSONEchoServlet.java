import org.quickconnectfamily.json.*;
/**
 * Created by Talon on 3/27/2017.
 */



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;


@WebServlet(name = "JSONEchoService", urlPatterns = {"/coolio"})

public class JSONEchoServlet extends HttpServlet {

    private ApplicationController theAppController = new ApplicationController();



    public void init(){

        theAppController.mapCommand("Speak", new SpeakHandler());

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        try {

            JSONInputStream inFromClient = new JSONInputStream(request.getInputStream());

            JSONOutputStream outToClient = new JSONOutputStream(response.getOutputStream());



            HashMap<String, Object> dataMap = (HashMap) inFromClient.readObject();

            dataMap.put("toClient", outToClient);



            String aCommand = (String) dataMap.get("command");

            theAppController.handleRequest(aCommand, dataMap);



        } catch (Exception e) {

            e.printStackTrace();

        }

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request,response);

    }

}
