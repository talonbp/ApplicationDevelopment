import java.io.FileInputStream;
import java.io.IOException;

import org.quickconnect.json.JSONException;
import org.quickconnect.json.JSONInputStream;

/**
 * Created by Talon on 4/4/2017.
 */
public class Input {    public static void GetJsonFile() {
    try {
        FileInputStream inputStream1 = new FileInputStream("C:\\Users\\Talon\\IdeaProjects\\QCJSON\\src\\Output.txt");
        JSONInputStream jsonInput1 = new JSONInputStream(inputStream1);
        System.out.println(jsonInput1.readObject());
    } catch (IOException e) {
        e.printStackTrace();
    } catch (JSONException e) {
        e.printStackTrace();
    }
}

    public static void main(String args[]){
        System.out.println("This is going to be a simple json file with Lebron James' career statistics in it that this program is going to turn into a comma dilimited file to put into excel:");
        GetJsonFile();
    }
}
