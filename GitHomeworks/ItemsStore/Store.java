import java.awt.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Store {

    public static void main(String[] args) {


        Items item1 = new Items("AK-47", 2700);
        Items item2 = new Items("M4A1-S", 2900);
        Items item3 = new Items("USP", 200);
        Items item4 = new Items("AWP", 4750);
        Items item5 = new Items("Desert Eagle", 700);
        Items item6 = new Items("MP7", 1700);


        LinkedList<Items> item = new LinkedList<Items>();

        item.add(item1);
        item.add(item2);
        item.add(item3);
        item.add(item4);
        item.add(item5);
        item.add(item6);
        

        System.out.println(item);


    }

}
