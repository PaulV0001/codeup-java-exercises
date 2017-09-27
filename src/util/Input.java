package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public static void main(String[] args) {
//        Input input = new Input();
//        System.out.println(input.getString("Type in a message..."));
//        System.out.println(input.yesNo("Is it raining today?"));
//        System.out.println(input.getInt(1, 10));
//        System.out.println(input.getDouble(1, 10));

    }

    public Input() {
        this.scanner = new Scanner(System.in);
    }

//    public int getInt() {
//        if (this.scanner.hasNextInt()) {
//            return this.scanner.nextInt();
//        } else {
//            System.out.println();
//            scanner.nextLine();
//            return getInt();
//        }
//
//    }

  public String getString(String ask) {
      System.out.println(ask);
      String answer = scanner.nextLine();
      return answer;
  }

  public boolean yesNo(String yesOrNo) {
      System.out.println(yesOrNo);
      yesOrNo = this.scanner.nextLine();

      if (yesOrNo.equals("y") || (yesOrNo.equals("yes"))) {
          System.out.println("I thought so");
          return true;

      } else {
          return false;
      }

  }

    public int getInt(int min, int max){

        System.out.println("Give me an Integer between " + min + " and  " + max);
        int input = Integer.parseInt(scanner.nextLine());

        if(input < min || input > max){
            System.out.println("Outside of the limit");
            getInt(min, max);
        }else{
            System.out.println("Valid input");
            return input;
        }

        return 0;
    }

    public double getDouble(double min, double max) {

        System.out.println("Give me an Integer between " + min + " and  " + max);
        int input = Integer.parseInt(scanner.nextLine());

        if(input < min || input > max){
            System.out.println("Outside of the limit");
            getDouble(min, max);
        }else{
            System.out.println("Valid input");
            return input;
        }

        return 0;

    }




}
