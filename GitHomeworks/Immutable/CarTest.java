import java.util.LinkedList;

public class CarTest {

    public static void main(String[] args) {
        Engine engine = new Engine("Diesel", 200, 100);
        Wheel wheel = new Wheel(50, 70);
        Wheel wheel2 = new Wheel(50, 70);
        Wheel wheel3 = new Wheel(50, 70);
        Wheel wheel4 = new Wheel(50, 70);

        LinkedList<Wheel> wheels = new LinkedList<>();
        wheels.add(wheel);
        wheels.add(wheel2);
        wheels.add(wheel3);
        wheels.add(wheel4);

        Car car = new Car("Ford", "Mustang", engine , wheels);

        System.out.println(car);


    }

}
