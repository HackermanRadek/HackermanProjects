import java.util.LinkedList;

public class Shelf {

private Box box;

    public Shelf(Box box){

        this.box=box;


    }

    @Override
    public String toString() {
        return "Shelf: " + box;
    }
}
