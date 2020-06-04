import java.util.*;

public class CatalogueTester {

    public static void main(String[] args) {

        CatalogueParts usp = new CatalogueParts(1,"pistol", "USP");
        CatalogueParts mp5 = new CatalogueParts(17, "PM", "mp5");
        CatalogueParts awp = new CatalogueParts(9, "Sniper riffle", "AWP");
        CatalogueParts ak47 = new CatalogueParts(4, "russian riffle", "AK-47");
        CatalogueParts nova = new CatalogueParts(2, "shotgun", "Nova");
        CatalogueParts m4a4 = new CatalogueParts(10, "best riffle", "M4A4");


       Map<Integer,CatalogueParts> guns = new HashMap<>();

       guns.put(1, usp);
        guns.put(10, awp);
        guns.put(12, ak47);
        guns.put(7, m4a4);
        guns.put(10, mp5);
        guns.put(99, nova);


        System.out.println(guns);


        System.out.println(guns.get(99));
        System.out.println(guns.get(10));
    }}