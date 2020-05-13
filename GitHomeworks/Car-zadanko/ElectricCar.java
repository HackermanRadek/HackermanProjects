public class ElectricCar extends Carr implements Chargable {
    public ElectricCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void charge() {
        System.out.println( getManufacturer() + getModel() +  " has been charged");

    }
}
