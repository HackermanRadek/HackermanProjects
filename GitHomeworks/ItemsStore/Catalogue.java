import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Catalogue{
    private Parts parts;
    private String name;
    private Map map;
    public Catalogue(String name, Map map){

        this.name = name;
        this.map = map;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "name='" + name + '\'' +
                ", map=" + map +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalogue catalogue = (Catalogue) o;
        return Objects.equals(name, catalogue.name) &&
                Objects.equals(map, catalogue.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, map);
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public void addToCatalogue(Parts parts){

          map.putIfAbsent(parts, map);

    }

    public void returnNumber(Integer x ){

        if (x==parts.getNumber()){

            System.out.println("You got a part with a number of: " + parts.getNumber());

        }

    }




}