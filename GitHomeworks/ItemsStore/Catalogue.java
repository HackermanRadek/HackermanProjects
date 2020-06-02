import java.util.LinkedList;
import java.util.Objects;

public class Catalogue {

private LinkedList<CatalogueParts> parts;


        public Catalogue(LinkedList<CatalogueParts> parts1){

            this.parts=parts1;
        }

    public LinkedList<CatalogueParts> getParts() {
        return parts;
    }

    public void setParts(LinkedList<CatalogueParts> parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "parts=" + parts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalogue catalogue = (Catalogue) o;
        return Objects.equals(parts, catalogue.parts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parts);
    }

    LinkedList<CatalogueParts> catParts = new LinkedList<CatalogueParts>();
    public void addParts(CatalogueParts parts1) {

        if (!catParts.contains(parts1)) {
            catParts.add(parts1);
        }

    }



    }








