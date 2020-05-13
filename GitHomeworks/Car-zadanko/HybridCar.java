public class HybridCar extends Carr implements Tankable, Chargable {
    public HybridCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void charge() {
        System.out.println(getManufacturer()  +  getModel() + " has been charged");
    }

    @Override
    public void tank() {
        System.out.println(getManufacturer()  +  getModel() + " has been tanked");

    }
}
