public class Swap {
    public static void main(String[] args) {
        int[] numbers = new int[2];
        numbers [0] = 21;
        numbers [1] = 10;
        System.out.println( numbers [0]);
        System.out.println(numbers [1]);

        System.out.println("=====================");
        int sth = numbers [0];

        numbers [0] = numbers [1];
        numbers [1] = sth;
        System.out.println(numbers [0]);
        System.out.println(sth);
    }
}
