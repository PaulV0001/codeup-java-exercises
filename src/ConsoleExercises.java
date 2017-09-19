import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a integer:");
        int intNumber = scan.nextInt();
        System.out.println(intNumber);

        System.out.println("Give me 3 names:");
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        String word3 = scan.nextLine();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        scan.nextLine(); // This is the extra \n (enter)


        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        System.out.println(sentence);

        System.out.println("Enter the width of the classroom:");
        double width = scan.nextDouble();
        System.out.println("Enter the length of the classroom:");
        double length = scan.nextDouble();
        double area = length * width;
        double perimeter = 2 * length + 2 * width;
        System.out.println("The area of the classroom is " + area);
        System.out.println("The perimeter of the classroom is " + perimeter);



    }
}
