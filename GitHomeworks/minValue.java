public class minValue {
    public static void main(String[] args) {

            int [] numbers =new int[0];
        int minNumber = numbers [0];
            for (int currentNumber: numbers){
                if (currentNumber < minNumber){
                    minNumber=currentNumber;
                }
            }
        System.out.println(minNumber);
    }
}
