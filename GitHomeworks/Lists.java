import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {

        System.currentTimeMillis();

        List<Integer> numbers = new ArrayList<>();


        numbers.add(10);
        numbers.add(11);
        numbers.add(21);
        numbers.add(7);

        System.out.println(numbers);



        for (int i = 0; i <100_000 ; i++) {


            numbers.add(0,17);



        }

        System.currentTimeMillis();

        System.out.println(System.currentTimeMillis());


        System.out.println("==========================================================================");




        System.currentTimeMillis();

        List<Integer> numbers2 = new LinkedList<>();

        numbers2.add(99);
        numbers2.add(102);
        numbers2.add(420);
        numbers2.add(999);

        System.out.println(numbers2);


        for (int i = 0; i <100_000 ; i++) {

            numbers2.add(0,69);

        }

        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());

    }

}
