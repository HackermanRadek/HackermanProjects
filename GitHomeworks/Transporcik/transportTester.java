import java.util.ArrayList;

public class transportTester {


    public static void main(String[] args) {


        Airplane airplane = new Airplane();

        Motorbike motorbike = new Motorbike();

        Bus bus = new Bus();

        Bicycle bicycle = new Bicycle();

        Train train = new Train();

        Tram tram = new Tram();

        transportTester.fly(motorbike);
        transportTester.fly(airplane);
        transportTester.fly(bicycle);
        transportTester.fly(tram);
    }

    public static void fly(Transport transport) {

        transport.go();

    if (transport instanceof Airplane) {
        System.out.println("It is flying far far away");

    }else if (transport instanceof Motorbike){
        System.out.println("Probably flying over steering wheel");


    }else {
        System.out.println("Its not flying far far away");
    }

    }






}
