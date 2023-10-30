package homework1.task1;

public class SoutExample {
    public static void main(String[] args) {
        if (args.length >= 2) {
            String name = args[0];
            String age = args[1];
            System.out.println("Hello, " + name + "! You are " + age + " years old.");
        } else {
            System.out.println("Please provide both your name and age.");
        }
    }
}
