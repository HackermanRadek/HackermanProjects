public class Laptop implements Cloneable {

    private String name;
    private Processor processor;
    private HardDrive hardDrive;
    private int displaySize;
    private double weight;
    private int RAMAmount;


    public Laptop(String name, Processor processor1, HardDrive hardDrive1, int displaySize,
                  double weight, int RAMAmount){
        this.name=name;
        this.processor=processor1;
        this.hardDrive=hardDrive1;
        this.displaySize=displaySize;
        this.weight=weight;
        this.RAMAmount=RAMAmount;
    }

    @Override
    protected Laptop clone() throws CloneNotSupportedException {
        Laptop clone = (Laptop) super.clone();

        return clone;
    }


}
