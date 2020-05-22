import java.util.ArrayList;

public class transportTester {



    public static void main(String[] args)  {


        Airplane airplane = new Airplane();

        Motorbike motorbike = new Motorbike();

        Bus bus = new Bus();

        Bicycle bicycle = new Bicycle();

        Train train = new Train();

        Tram tram = new Tram();



    }

    public static boolean isItPublic(Transport transport){

        if (transport instanceof publicTransport){
            System.out.println("Thats public transport");
        } else {
            System.out.println("Thats not public transport");
        }

        return false;

    }



    }

