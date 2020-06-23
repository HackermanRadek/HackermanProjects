import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class CatalogueTester{
    public static void main(String[] args) {
        Parts ak47 = new Parts(2700, "Ak-47");
        Parts usp = new Parts(200, "USP");
        Parts mp5 = new Parts(1500, "MP5");

        HashMap guns = new HashMap();

        Catalogue catalogue = new Catalogue(guns);
        catalogue.addPart(ak47);
        catalogue.addPart(usp);
        catalogue.addPart(mp5);

        System.out.println(catalogue);

        catalogue.getByNumber(1500);

    }
}