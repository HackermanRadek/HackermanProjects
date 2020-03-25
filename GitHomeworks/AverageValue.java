import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        System.out.println("Please enter your numbers:");

        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        int n =10;
        int [] a = new int [n];

        int sum = 0;



        for (int i=0; i < args.length; i++){

            sum = sum + a[i];

            if (args.length == n){
                break;
            }


            System.out.println("Average value = " + sum/args.length);

        }



    }
}



