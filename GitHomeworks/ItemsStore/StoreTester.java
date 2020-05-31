import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class StoreTester {
    public static void main(String[] args) {

        Items ak47 = new Items("AK-47", 2700);
        Items m4a1s= new Items("M4A1-S", 2900);
        Items usp = new Items("USP", 200);
        Items awp = new Items("AWP", 4750);
        Items desert_eagle = new Items("Desert eagle", 700);
        Items famas = new Items("Famas",2200);
        Items mp7 = new Items("MP7", 1700);


        LinkedList<Items>storeItems =new LinkedList<Items>();
                storeItems.add(ak47);
                storeItems.add(m4a1s);
                storeItems.add(usp);
                storeItems.add(awp);
                storeItems.add(famas);
                storeItems.add(desert_eagle);
                storeItems.add(mp7);


        Store cod = new Store("Call of duty", storeItems);
        cod.addItems(ak47);
        cod.addItems(m4a1s);
        cod.addItems(mp7);
        cod.addItems(famas);
        cod.addItems(desert_eagle);
        cod.addItems(usp);
        cod.addItems(awp);

        System.out.println(cod);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        storeItems.sort(Comparator.naturalOrder());

        System.out.println(cod);

        System.out.println("=================================================");

        storeItems.sort(Comparator.reverseOrder());

        System.out.println(cod);

        System.out.println("***************************************************");

        
    }
}
