    import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        System.out.println("Is it raining now?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("leje fest")) {
            System.out.println("Do not forget umbrella");
        }

        else if (answer.equalsIgnoreCase("no nie pada chwilowo")) {
            System.out.println("Leave umbrella at home");
        }


    }
    }

