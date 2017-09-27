import util.Input;
public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter your name:");
        String name = input.getString("What is your name");

        System.out.println("Hello " + name);
    }
}
