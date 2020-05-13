import java.util.ArrayList;

public class CarTester {

    private static Object Carr;

    public static void main(String[] args) {
        HybridCar hybridCar1 = new HybridCar("Honda", " Civic");
        hybridCar1.charge();

        FuelCar fuelCar1 = new FuelCar("BMW", " E36");
        fuelCar1.tank();


        ElectricCar electricCar1 = new ElectricCar("Tesla", " #1");
        electricCar1.charge();


        FuelCar fuelCar2 = new FuelCar("Ford", " Mustang");
        fuelCar2.tank();

        FuelCar fuelCar3 = new FuelCar("Dodge", " Challanger");
        fuelCar3.tank();

        System.out.println(electricCar1);


       ArrayList carList = new ArrayList();
       carList.add(electricCar1);
       carList.add(fuelCar1);
       carList.add(fuelCar2);
       carList.add(fuelCar3);
       carList.add(hybridCar1);
        System.out.println(carList);

        if (Carr instanceof Chargable){
            ((Chargable) Carr).charge();
        }

        if (Carr instanceof Tankable){
            ((Tankable) Carr).tank();
        }





    }


}
