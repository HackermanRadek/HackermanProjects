import java.util.LinkedList;

public class Shelf <T>  {

public Shelf(){

}

LinkedList<T> shelf = new LinkedList<>();

    @Override
    public String toString() {
        return "Shelf{" +
                "shelf:" + shelf +
                '}';
    }

    public void addBoxes(T box){
    if (!shelf.contains(box)) {
        shelf.add(box);
    }

}

}
