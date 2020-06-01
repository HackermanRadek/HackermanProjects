import java.awt.*;
import java.util.*;
import java.util.List;

public class Store  {

    private String name;
    private LinkedList<Items> items;

    public Store(String name, LinkedList<Items> items1){
        this.name=name;
        this.items=items1;
    }

    @Override
    public String toString() {
        return "Store{" +
                "items=" + items +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(items, store.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }


    LinkedList<Items> storeItems = new LinkedList<Items>();
    public void addItems(Items items1) {

        if (!storeItems.contains(items1)) {
            storeItems.add(items1);
        }



    }

    public void fromHighest(){

        storeItems.sort(Comparator.reverseOrder());

        System.out.println(storeItems);

    }

    public void fromLowest(){
        storeItems.sort(Comparator.naturalOrder());

        System.out.println(storeItems);


    }   public void fromA() {

        storeItems.sort(Comparator.comparing(Items::toString));

        System.out.println(storeItems);

    }

    public void fromZ(){

        storeItems.sort(Comparator.comparing(Items::toString).reversed());

        System.out.println(storeItems);

    }



}








