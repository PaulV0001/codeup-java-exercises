import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Ask Bob anything");

        String answer = user.nextLine();

        if (answer.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else if (answer.endsWith("?")) {
            System.out.println("Sure.");
        } else if (answer.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else {
            System.out.println("Whatever");
        }
        }
    }
