import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//
//        while (i < 15) {
//            i++;
//        System.out.println(i);
//
//        Scanner scan = new Scanner(System.in);

//        int nextNumber = 100;
//        do {
//            System.out.println(nextNumber);
//            nextNumber -= 5;
//
//        } while (nextNumber >= -10);

        for (int nextNumber = 100; nextNumber >= -10; nextNumber -=5) {
            System.out.println(nextNumber);

        }



//        int nextInt = 2;
//        do {
//            System.out.println(nextInt);
//            nextInt *= 2;
//
//        } while (nextInt <= 1000000);


//        for (int nextInt = 2; nextInt <= 1000000; nextInt *= 2) {
//            System.out.println(nextInt);
//        }


        for (int nextFizz = 1; nextFizz <= 100; nextFizz++) {
            if (nextFizz % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (nextFizz % 3 == 0) {
                System.out.println("Fizz");
            } else if (nextFizz % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(String.valueOf(nextFizz));
            }
        }

        System.out.println("Welcome to the Squares and Cubes table");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        do
        {
            // Get input from the user
            System.out.print("What would you like to go up to? ");
            int integer = sc.nextInt();

            // Create a header
            String header = "Number  " + "Squared " + "Cubed   " + "\n"
                    +   "======  " + "======= " + "=====   ";
            System.out.println(header);

            int square = 0;
            int cube = 0;

            String row = "";
            for (int i = 1; i <= integer; i++)
            {

                square = i * i;
                cube = i * i * i;

                row = i + "       " + square + "       " + cube;
                System.out.println(row);
            }

            // See if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();

        }
        while (!choice.equalsIgnoreCase("n"));
    }


        }


