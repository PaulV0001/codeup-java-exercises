package grades;
import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();

        students.put("PaulV0001", new Student("Paul"));
        students.get("PaulV0001").addGrade(90);
        students.get("PaulV0001").addGrade(95);
        students.get("PaulV0001").addGrade(100);

        students.put("MariUSAA", new Student("Mari"));
        students.get("MariUSAA").addGrade(85);
        students.get("MariUSAA").addGrade(87);
        students.get("MariUSAA").addGrade(95);

        students.put("CarloLyft", new Student("Carlo"));
        students.get("CarloLyft").addGrade(70);
        students.get("CarloLyft").addGrade(80);
        students.get("CarloLyft").addGrade(85);

        students.put("DeepEddie", new Student("Edward"));
        students.get("DeepEddie").addGrade(90);
        students.get("DeepEddie").addGrade(89);
        students.get("DeepEddie").addGrade(90);

        System.out.println("Welcome");
        System.out.println("Here are the github usernames of our students:");

        String proceeds;
        do {



        for (String key : students.keySet()) {
            System.out.println("|" + key + "|");
        }


        String userInput = input.getString("\n" + "What student would you like to see more information on?");
        if (students.containsKey(userInput)) {
            System.out.println("Students name " + students.get(userInput).getName());
            System.out.println("Students GPA is " + students.get(userInput).getGradeAverage());
        } else {
            System.out.println("Sorry, no student found with the gihub username.");
        }

        proceeds = input.getString("Would you like to continue?");

    } while (proceeds.equalsIgnoreCase("y") || (proceeds.equalsIgnoreCase("yes")));
        System.out.println("Goodbye, and have a wonderful day!");



    }
}
