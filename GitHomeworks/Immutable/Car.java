import java.util.LinkedList;
import java.util.Objects;

public final class Car {
    private final String manufacturer;
    private final String model;
    private final Engine engine;
    private final LinkedList<Wheel> wheel;

    public Car(String manufacturer, String model, Engine engine, LinkedList<Wheel> wheel) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
        this.wheel = wheel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public LinkedList<Wheel> getWheel() {
        return wheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(manufacturer, car.manufacturer) &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(wheel, car.wheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, engine, wheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer:'" + manufacturer + '\'' +
                ", model:'" + model + '\'' +
                ", engine:" + engine +
                ", wheel:" + wheel +
                '}';
    }
}
