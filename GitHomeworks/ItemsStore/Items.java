import java.math.BigDecimal;
import java.util.Comparator;
import java.util.LinkedList;

public class Items {

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



}
