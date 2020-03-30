
public class AverageValue {
    public static void main(String[] args) {


        double value = 0;

        for (int i = 0; i < args.length; i++) {

            value = value + Integer.parseInt(args[i]);

        }

        System.out.println("The average value  is: " + value/args.length);

    }
}

