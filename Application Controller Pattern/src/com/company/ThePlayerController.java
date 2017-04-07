package com.company;
import java.util.HashMap;
/**
 * Created by Talon on 4/5/2017.
 */
public class ThePlayerController {
    private HashMap<String,HandlerController> WhoWillHandleTheData = new HashMap();
    public void handleRequest(String command, HashMap<String,Object> data){
        mapCommand("Lebron James", new LebronJames());
        mapCommand("Ray Allen", new RayAllen());
        mapCommand("Pistol Pete", new PistolPete());
        mapCommand("Kobe Bryant", new KobeBryant());
        mapCommand("John Stockton", new JohnStockton());
        mapCommand("Michael Jordan", new MichaelJordan());
        HandlerController aCommandHandler = WhoWillHandleTheData.get(command);  if (aCommandHandler != null){
            aCommandHandler.FigureStuffOut(data);
        }
    }
    public void mapCommand(String aCommand, HandlerController acHandler){
        WhoWillHandleTheData.put(aCommand,acHandler);
    }
}

