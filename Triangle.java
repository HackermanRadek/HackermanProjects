import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        System.out.println("Input first side lenght:");

        Scanner scanner = new Scanner(System.in);

        int firstLenght = scanner.nextInt();


        System.out.println("Input second side lenght:");

        int secondLenght = scanner.nextInt();

        System.out.println("Input third side lenght:");

        int thirdLenght = scanner.nextInt();

        if(firstLenght + secondLenght < thirdLenght | firstLenght + thirdLenght < secondLenght
                | secondLenght + thirdLenght < firstLenght){
            System.out.println("You cannot build a triangle");
        }else{
            System.out.println("You can build a triangle");
        }







        }

    }

