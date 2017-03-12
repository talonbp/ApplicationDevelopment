import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Talon on 3/4/2017.
 */
public class TreeSetDemo {

    public static void main(String[] args) {



    // Create a tree set
    TreeSet ClassList = new TreeSet();
    TreeSet PY = new TreeSet();
    Scanner reader = new Scanner(System.in);
    String Name;

    // Add elements to the tree set
        PY.add("Pitchforth, Talon");
        PY.add("Allabastar, Ryan");
        PY.add("Kid, Willy");

        System.out.println("Last year's class: " + PY);

        PY.remove("Pitchforth, Talon");

        ClassList.addAll(PY);
        PY.clear();
        System.out.println("Student's from last year's class in this year's class: " + ClassList);

        ClassList.add("Johnson, Bill");
        ClassList.add("Aaronson, Reyes");
        ClassList.add("Darnell, David");
        ClassList.add("Darnell, David");
        System.out.println("Type the name of the person you are looking for in the following format: Lastname, Firstname.");
    Name = reader.nextLine();

        if (ClassList.contains(Name)) {
        System.out.println("Specified student is in this class.");
    } else {
        System.out.println("Specified student is not in this class.");
    }

        System.out.println("This year's list after all additions: " + ClassList);
}
}