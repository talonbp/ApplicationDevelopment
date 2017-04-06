/**
 * Created by Talon on 3/27/2017.
 */
import java.util.HashMap;


public class ApplicationController {

    private HashMap<String,Handler> handlerMap = new HashMap();



    public void handleRequest(String command, HashMap<String,Object> data){

        Handler aCommandHandler = handlerMap.get(command);

        if (aCommandHandler != null){

            aCommandHandler.handleIt(data);

        }

    }



    public void mapCommand(String aCommand, Handler acHandler){

        handlerMap.put(aCommand,acHandler);

    }

}