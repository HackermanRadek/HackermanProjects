import java.util.Scanner;

public class InputCheck {

    public static void main(String[] args) {

        String text1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please, input another text:");
            text1 = scanner.nextLine();

        } while (!text1.equalsIgnoreCase("exit"));
        }

    }


