import java.util.LinkedList;
import java.util.Map;

public class Catalogue  {

    public static void main(String[] args) {



        CatalogueParts cat1 = new CatalogueParts(1, "radeczek", "bestia");
        CatalogueParts cat2 = new CatalogueParts(3, "najk", "Wiesław");
        CatalogueParts cat3 = new CatalogueParts(2, "adik", "adaś");
        CatalogueParts cat4 = new CatalogueParts(5, "umbero", "pjoter");
        CatalogueParts cat5 = new CatalogueParts(4, "ribok", " kolanko");


        LinkedList <CatalogueParts> catalogue = new LinkedList();

            catalogue.add(cat1);
            catalogue.add(cat2);
            catalogue.add(cat3);
            catalogue.add(cat4);
            catalogue.add(cat5);

        System.out.println(catalogue.get(4));

    }


}
