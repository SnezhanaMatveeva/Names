import java.util.Scanner;

public class Name {
    static String maxLengthName = null;
    static String name;

    public static void lengthName() {
        if (name.length() > maxLengthName.length()) {
            maxLengthName = name;
            System.out.println("Longest name: " + name);

        } else if (name.length() < maxLengthName.length()) {
            System.out.println("Longest name: " + maxLengthName);
            System.out.println("Not enough letters: " + (maxLengthName.length() - name.length()));

        } else if (name.length() == maxLengthName.length()) {
            System.out.println("These names are the same length");
        }
    }

    public static void names() {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a name with a capital letter");
            String input = scanner.nextLine();
            if (Character.isLowerCase(input.charAt(0))) {
                System.out.println("A name must be capitalized");
                continue;
            }

            if ("end".equalsIgnoreCase(input)) {
                System.out.println("Program completed");
                break;
            }

            if (maxLengthName == null) {
                maxLengthName = input;
                System.out.println("This is the first name entered");
            } else if (maxLengthName != null) {
                name = input;
                lengthName();
            }
        }
    }
}




