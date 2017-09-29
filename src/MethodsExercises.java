import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        rollDice(getInteger(1, 10, scan), scan);

//        factorial(getInteger(1, 10));

//        getInteger(1, 10);

       int sumResult = add(2, 3);
        subtraction(5, 4);
        multiply(3, 4);
        divide(6, 2);
        modulus(3, 1);


    }
    public static int add(int x, int y) {
        return (x + y);
    }

    public static void subtraction(int a, int b) {
        System.out.println(a - b);
    }
    public static void multiply(int c, int d) {
        System.out.println(c * d);
    }
    public static void divide(int e, int f) {
        System.out.println(e / f);
    }
    public static void modulus(int i, int j) {
        System.out.println(i % j);
    }
    public static int getInteger(int min, int max) {

        System.out.print("Enter a number between " + min + " and " + max);
        int input = scan.nextInt();
        scan.nextLine();

        if (input < min || input > max) {
           System.out.println("Outside of the limit");
           getInteger(min, max);
        } else {
            System.out.println("Valid input");
            return input;

        }
        return 0;


        }

        public static void factorial(int number) {
            int acum = 1;
            String details = "";
            for (int i = 1; i <= number; i++) {
                details += (i == 1) ? i : " x " + i;
                System.out.println(i +"! = " + details + " = " + ( acum *= i ) );
            }
    }

    public static void rollDice(int sides, Scanner input) {
        System.out.println("Type roll to start");
        String usersInput = input.nextLine();

        if (usersInput.trim().equalsIgnoreCase("roll")){
            int dice1 = 1 + (int)(Math.random() * ((sides -1) +1));
            int dice2 = 1 + (int)(Math.random() * ((sides -1) +1));

            System.out.println(dice1 + " " + dice2);

        }

        while (true) {

        }
    }


    }


