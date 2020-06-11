import java.util.HashMap;
import java.util.Map;

public class CatalogueTester{
    public static void main(String[] args) {
        Parts ak47 = new Parts(2700, "Ak-47");
        Parts usp = new Parts(200, "USP");
        Parts mp5 = new Parts(1500, "MP5");


        Map riffle = new HashMap();

        Catalogue guns = new Catalogue("GUNS", riffle);

        guns.addToCatalogue(mp5);
        guns.addToCatalogue(usp);
        guns.addToCatalogue(ak47);


        System.out.println(guns);


        guns.returnNumber(200);

    }
}