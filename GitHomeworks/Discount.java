import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats the item price?:");
        int price = scanner.nextInt();
        System.out.println("Whats the customer age?:");
        int age = scanner.nextInt();
        if(age <6){
            System.out.println("The price is:" + price*0.20);

        } else if (age >=6 && age<=18){
            System.out.format( "The price is:" + price*0.75);
        } else if (age > 65){
            System.out.println("The price is: " + price*0.70);
        } else{
            System.out.println("The price is:" + price);
        }
    }
}
