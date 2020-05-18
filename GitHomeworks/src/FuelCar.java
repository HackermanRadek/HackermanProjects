public class FuelCar extends Carr implements Tankable {
    public FuelCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void tank() {
        System.out.println( getManufacturer() + getModel() + " has been tanked");
    }
}
