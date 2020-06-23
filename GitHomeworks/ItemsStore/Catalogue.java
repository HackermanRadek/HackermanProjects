import java.util.HashMap;
import java.util.Objects;

public class Catalogue{

    private HashMap map;

    public Catalogue(HashMap map) {
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

    public HashMap getMap() {
        return map;
    }

    public void setMap(HashMap map) {
        this.map = map;
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

    public void addPart(Parts part){

        map.put(part.getNumber(), part);

    }

   public void getByNumber(Integer someNumber){
        if (map.containsKey(someNumber)){
            System.out.println("This is part: " + someNumber);
        } else {
            System.out.println("No such part");
        }

    }

}

