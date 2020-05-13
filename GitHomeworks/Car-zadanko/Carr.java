public class Carr {

    private String manufacturer;
    private String model;




    public Carr(String manufacturer, String model){
        this.manufacturer=manufacturer;
        this.model=model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
