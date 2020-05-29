import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        List<Integer> numbers = new ArrayList<>();


        numbers.add(10);
        numbers.add(11);
        numbers.add(21);
        numbers.add(7);

        System.out.println(numbers);


        for (int i = 0; i < 100_000; i++) {


            numbers.add(0, 17);


        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);


        System.out.println("==========================================================================");


        long startTimeV2 = System.currentTimeMillis();

        List<Integer> numbers2 = new LinkedList<>();

        numbers2.add(99);
        numbers2.add(102);
        numbers2.add(420);
        numbers2.add(999);

        System.out.println(numbers2);


        for (int i = 0; i < 100_000; i++) {

            numbers2.add(0, 69);

        }

        long endTimeV2 = System.currentTimeMillis();
        System.out.println(endTimeV2 - startTimeV2);


        System.out.println("===================================================================");


        long startV3 = System.currentTimeMillis();


        for (int i = 0; i < 100_000; i++) {


            numbers.get(i);

        }
        long endV3 = System.currentTimeMillis();

        System.out.println(endV3 - startV3);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        long startV4 = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {

            numbers2.get(i);

        }
        long endV4 = System.currentTimeMillis();

        System.out.println(endV4 - startV4);

    }
}