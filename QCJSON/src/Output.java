import org.quickconnect.json.JSONException;
import org.quickconnect.json.JSONOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

/**
 * Created by Talon on 4/4/2017.
 */
public class Output implements Serializable {
    private String FirstName;
    private String LastName;
    private Integer AllTimeRanking;
    private Integer Age;
    private String Height;
    private Integer Weight;
    private Double ShootingPercentage;
    private Double ReboundsPerGame;
    private Double PointsPerGame;
    private Double AssistsPerGame;




    public Output(String FirstName, String LastName, Integer AllTimeRanking, Integer Age, String Height, Integer Weight, Double ShootingPercentage, Double ReboundsPerGame, Double PointsPerGame, Double AssistsPerGame) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.AllTimeRanking = AllTimeRanking;
        this.Age= Age;
        this.Height=Height;
        this.Weight= Weight;
        this.ShootingPercentage=ShootingPercentage;
        this.ReboundsPerGame=ReboundsPerGame;
        this.PointsPerGame=ReboundsPerGame;
        this.AssistsPerGame=AssistsPerGame;
    }

    public static void LebronJSON(){
        Output theObject1 = new Output("Lebron","James",2,32,"Six Feet Eight Inches",250,50.1,7.3,27.1, 7.0);

        try{
            //create a new file stream
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Talon\\IdeaProjects\\QCJSON\\src\\Output.txt");
            //use the output stream object as the parameter for the json output stream
            JSONOutputStream theStream = new JSONOutputStream(outputStream);
            //use the json object to write the string to the file
            theStream.writeObject(theObject1);

        } catch(IOException e){
            e.printStackTrace();
        } catch (JSONException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        LebronJSON();
    }
}