public class sumOfNumbers {
    public static void main(String[] args) {


        int integerNumber = Integer.parseInt("123" );
        integerNumber = Integer.parseInt(args[0]);

        for (int i=0; i< args.length; i++){

            String sum;
            sum = sum  + args[i];

            System.out.println("Sum is :" + sum);
        }





    }
}
