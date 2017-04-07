import org.quickconnectfamily.json.*;
/**
 * Created by Talon on 3/27/2017.
 */
import java.net.HttpURLConnection;

import java.net.URL;

import java.util.HashMap;

import java.util.Scanner;



public class JSONEchoClient {

    public static void main(String[] args){

        JSONEchoClient theClient = new JSONEchoClient();

        theClient.go();

    }



    private void go() {

        while(true){

            try {

                Scanner systemInScanner = new Scanner(System.in);

                System.out.printf("Enter the number you wish to multiply by 5.\n");

               Integer messageForServer = systemInScanner.nextInt();



                URL url = new URL("http://localhost:8080/coolio");

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setDoOutput(true);//allows POST

                JSONOutputStream outToServer = new JSONOutputStream(connection.getOutputStream());



                HashMap<String, Object> request = new HashMap<>();

                request.put("command", "Hope for answers");

                request.put("message", messageForServer);



                outToServer.writeObject(request);



                JSONInputStream inFromServer = new JSONInputStream(connection.getInputStream());

                HashMap<String, Object> response = (HashMap<String, Object>) inFromServer.readObject();

                if (response.get("command").equals("Done")) {

                    System.out.println("Sent request: " + request + "and  got response  " + response);

                } else {

                    System.out.println("Oops. got " + response);

                }

            }

            catch (Exception e){

                e.printStackTrace();

            }

        }



    }

}
