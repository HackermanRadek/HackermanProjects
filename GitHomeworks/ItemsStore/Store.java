import java.awt.*;
import java.util.*;
import java.util.List;

public class Store implements Comparable<Items> {

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
    public void addItems(Items items){

        if (!storeItems .contains(items)) {
            storeItems.add(items);
        }
    }




    public Collection<Items> getAllItems() {
        return new LinkedList<>(items);
    }




    @Override
    public int compareTo(Items items) {

        return 0;
    }
}








