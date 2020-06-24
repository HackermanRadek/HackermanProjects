import java.util.HashMap;
import java.util.Objects;

public class Catalogue{

    private HashMap<Integer,Parts> map;

    public Catalogue(HashMap<Integer, Parts> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "map=" + map +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalogue catalogue = (Catalogue) o;
        return Objects.equals(map, catalogue.map);
    }


    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

    public void addPart(Parts part){

        map.put(part.getNumber(), part);

    }

   public Parts getByNumber(Integer someNumber){
        if (map.containsKey(someNumber)){
            System.out.println("This is part: " + someNumber);
        } else {
            System.out.println("No such part");
        }

        return map.get(someNumber);

    }
}

