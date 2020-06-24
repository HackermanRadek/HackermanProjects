
import java.util.LinkedList;

public class Shelf <Box>  {

    public Shelf(){

    }

    LinkedList<Box> shelf = new LinkedList<>();

    @Override
    public String toString() {
        return "Shelf{" +
                "shelf:" + shelf +
                '}';
    }

    public void addBoxes(Box box){
        if (!shelf.contains(box)) {
            shelf.add(box);
        
        }



    }

}