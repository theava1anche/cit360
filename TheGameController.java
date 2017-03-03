package ApplicationControllerPattern;

import java.util.HashMap;

/**
 * Created by Alexander Bloomfield on 3/2/2017.
 */
public class TheGameController {
    private HashMap<String,HandlerController> WhoWillHandleTheData = new HashMap();
    public void handleRequest(String command, HashMap<String,Object> data){
        mapCommand("Cool Runnings", new CoolRunnings());
        mapCommand("Criminal Minds", new CriminalMinds());
        mapCommand("House M.D.", new HouseMD());
        mapCommand("Star Wars", new StarWars());
        mapCommand("Bones", new Bones());
        mapCommand("Ocean’s Eleven", new OceanEleven());
        HandlerController aCommandHandler = WhoWillHandleTheData.get(command);  if (aCommandHandler != null){
            aCommandHandler.FigureStuffOut(data);
        }
    }
    public void mapCommand(String aCommand, HandlerController acHandler){
        WhoWillHandleTheData.put(aCommand,acHandler);
    }
}
