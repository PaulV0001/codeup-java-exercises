package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString("Type in a message..."));
        System.out.println(input.yesNo("Is it raining today?"));

    }

    public Input() {
        this.scanner = new Scanner(System.in);
    }

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




}
