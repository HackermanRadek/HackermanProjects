import java.math.BigDecimal;
import java.util.Comparator;
import java.util.LinkedList;

public class Items implements Comparable<Items> {

    private String name;
    private int price;

    public Items(String name, int price){
        this.name=name;
        this.price=price;
    }




    @Override
    public String toString() {
        return "name: " + name + " price: " + price;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Items items) {

        int result = Integer.compare(this.price, items.price);
        if (result == 0) {
            result = items.name.compareTo(this.name);
        }
        return result;
    }
}
