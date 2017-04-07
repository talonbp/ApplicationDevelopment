package JUNIT;


import java.util.ArrayList;

/**
 * Created by Talon on 4/6/2017.
 */
public class TestHelper {
    int value1 = 0;
    int value2;
    String words1 = "good";
    String nothing = null;
    String[] list = new String[3];
    String[] list2 = new String[3];
    String moreNothing = null;
    private ArrayList numList = new ArrayList<>();

    public TestHelper(){}
    // Going to test math for number 1 and mather number 2
    public  int math(int number){
        return number + value1;
    }
    public int math2(int number){
        return  number + value2;
    }
    public boolean good(String words){
        if (words == words1){
            return true;
        }else {return false;}
    }




    public void tryException() {
    }
}
