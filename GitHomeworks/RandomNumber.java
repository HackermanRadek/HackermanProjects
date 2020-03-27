import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public static void main(String[] args) {

        int[] randoms = new int[10];


        randoms[0] = ThreadLocalRandom.current().nextInt(100);
        randoms[1] = ThreadLocalRandom.current().nextInt(100);
        randoms[2] = ThreadLocalRandom.current().nextInt(100);
        randoms[3] = ThreadLocalRandom.current().nextInt(100);
        randoms[4] = ThreadLocalRandom.current().nextInt(100);
        randoms[5] = ThreadLocalRandom.current().nextInt(100);
        randoms[6] = ThreadLocalRandom.current().nextInt(100);
        randoms[7] = ThreadLocalRandom.current().nextInt(100);
        randoms[8] = ThreadLocalRandom.current().nextInt(100);
        randoms[9] = ThreadLocalRandom.current().nextInt(100);

        System.out.println(Arrays.toString(randoms));
            }

        }

