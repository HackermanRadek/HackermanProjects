import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {

        System.out.println("What the light?:");

        Scanner scanner = new Scanner(System.in);

        String colour = scanner.nextLine();
        String colour1 = "green";
        String colour2 = "red";
        String colour3 = "yellow";

        if(colour.equalsIgnoreCase("green")){
            System.out.println("GO!");
        }else if ( colour.equalsIgnoreCase(( "red" )) || colour.equalsIgnoreCase("yellow")){
            System.out.println("STOP!");
        }else if (colour.equalsIgnoreCase("red + yellow")) {
            System.out.println("Get ready to go");
        }
    }
}
