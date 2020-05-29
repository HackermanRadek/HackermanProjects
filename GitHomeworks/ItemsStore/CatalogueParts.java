public class CatalogueParts {

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



    }



