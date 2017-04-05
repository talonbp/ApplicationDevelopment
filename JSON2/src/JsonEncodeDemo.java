/**
 * Created by Talon on 2/25/2017.
 */

import org.json.simple.JSONObject;

import java.util.DoubleSummaryStatistics;

public class JsonEncodeDemo {
    public static void main(String[] args){
        JSONObject TalonSchedule = new JSONObject();

        TalonSchedule.put("To-do list for", "Talon Pitchforth");
        TalonSchedule.put("First", "Workout");
        TalonSchedule.put("Second", "Scripture Study");
        TalonSchedule.put("Third", "Read Wall Street Journal");
        TalonSchedule.put("Fourth", "Work");
        TalonSchedule.put("Fifth", "Go to sleep");
        System.out.println(TalonSchedule);

        JSONObject KellieSchedule = new JSONObject();
        KellieSchedule.put("To-do list for", "Kellie Pitchforth");
        KellieSchedule.put("First", "Wake up");
        KellieSchedule.put("Second", "Eat Breakfast");
        KellieSchedule.put("Third", "Start cleaning, prep crock pot");
        KellieSchedule.put("Fourth", "Get Excited to see Brad");

        System.out.println(KellieSchedule);

        JSONObject JamieSchedule = new JSONObject();

        JamieSchedule.put("To-do list for", "Jamie Pitchforth");
        JamieSchedule.put("First", "Feed Addie");
        JamieSchedule.put("Second", new Integer(2));
        JamieSchedule.put("Third", "Prep kids for bed with Matthew");
        JamieSchedule.put("Fourth", "Listen for hungry baby");

        System.out.println(JamieSchedule);

        JSONObject TylerSchedule = new JSONObject();

        TylerSchedule.put("To-do list for", "Tyler Pitchforth");
        TylerSchedule.put("First", "Head into hospital");
        TylerSchedule.put("Second", "Think about texting family");
        TylerSchedule.put("Third", "Fail to take break");
        TylerSchedule.put("Fourth", "Lunch Time!");

        System.out.println(TylerSchedule);

        JSONObject JeremySchedule = new JSONObject();

        JeremySchedule.put("To-do list for", "Jeremy Pitchforth");
        JeremySchedule.put("First", "Snuggle the girls");
        JeremySchedule.put("Second", "Head into work");
        JeremySchedule.put("Third", new Double(110.21));
        JeremySchedule.put("Fourth", "Time for bed");

        System.out.println(JeremySchedule);

        JSONObject MomSchedule = new JSONObject();

        MomSchedule.put("To-do list for", "Momma Pitchforth");
        MomSchedule.put("First", "Wakey Wakey");
        MomSchedule.put("Second", "Breakfast with dad");
        MomSchedule.put("Third", "Head into work in Denver");
        MomSchedule.put("Fourth", "Think about the kids");

        System.out.println(MomSchedule);

        JSONObject DadSchedule = new JSONObject();

        DadSchedule.put("To-do list for", "Jim Pitchforth");
        DadSchedule.put("Does dog have food?", new Boolean(Boolean.TRUE));
        DadSchedule.put("Run the following distance in miles", new Integer(2));
        DadSchedule.put("How old am I in years", new Double(60.5));
        DadSchedule.put("Fall asleep before Mom", "Done.");

        System.out.println(DadSchedule);






    }
}


