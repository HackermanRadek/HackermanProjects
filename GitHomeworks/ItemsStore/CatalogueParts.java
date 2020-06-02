public class CatalogueParts implements Comparable <CatalogueParts> {

    private int partNumber;
    private String brand;
    private String name;


    public CatalogueParts(int partNumber, String brand, String name) {

        this.brand = brand;
        this.name = name;
        this.partNumber = partNumber;
    }


        @Override
        public String toString() {
            return "name: " + name + " brand: " + brand
                    + " part Number: " + partNumber;

        }


    @Override
    public int compareTo(CatalogueParts catalogueParts) {
        int result = Integer.compare(this.partNumber, partNumber);

        return result;


    }


}



