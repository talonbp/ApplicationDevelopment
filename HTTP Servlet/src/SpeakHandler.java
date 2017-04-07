import org.quickconnectfamily.json.*;
/**
 * Created by Talon on 3/27/2017.
 */

import java.util.HashMap;

public class SpeakHandler implements Handler {

    @Override

    public void handleIt(HashMap<String, Integer> dataMap) {

        try{

            Integer Old;

            JSONOutputStream outToClient = (JSONOutputStream)dataMap.remove("toClient");

            System.out.println("Just got:" + dataMap + " from client");

            dataMap.put("command", "Done");

            outToClient.writeObject(dataMap);

            System.out.println("just sent "+dataMap);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}