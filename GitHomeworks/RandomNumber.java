import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public static void main(String[] args) {



        int[] randoms = new int[10];

        for ( int i =0; i < randoms.length; i++ ){


            randoms [i]= ThreadLocalRandom.current().nextInt(100);



        }

        System.out.println(Arrays.toString(randoms));

    }
}

