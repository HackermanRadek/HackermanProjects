import java.util.LinkedList;
import java.util.Objects;

public class Box<T> {



    public Box(){



    }

    LinkedList<T> boxes = new LinkedList<T>();

    public void addItems(T item){

        if (!boxes.contains(item)) {
            boxes.add(item);
        }

    }





    public LinkedList<T> getItems(){

        return boxes;

    }

    @Override
    public String toString() {
        return "Box{" +
                "boxes=" + boxes +
                '}';
    }
}
