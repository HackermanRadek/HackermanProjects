import java.util.Map;
import java.util.Objects;

public class Catalogue{

    private Map<Integer,Parts> map;
    private Parts test;

    public Catalogue(Map<Integer, Parts> map, Parts test){

        this.map=map;

        this.test=test;

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

    public Map<Integer, Parts> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Parts> map) {
        this.map = map;
    }


    public void addPart(Parts parts){

        for (int i = 0; i < 100; i++) {
            if (!map.containsValue(parts)){
                map.putIfAbsent(i+1, parts);

            }
        }
    }

    public void getByPartNumber(Integer someNumber){

       if (someNumber.equals(test.getNumber())){
           System.out.println(test.getName() +" -- "+ test.getNumber());
       }
    }

}

