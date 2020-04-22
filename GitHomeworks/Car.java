 class Car {
    private String name;
    private int fuelTankCapacity;
    private int remainingFuelAmount;
    private boolean started = true;
    private boolean stopped = true;


     public Car(String name, Engine diesel, int fuelTankCapacity){

        this.name=name;
        this.fuelTankCapacity=fuelTankCapacity;
        this.remainingFuelAmount=fuelTankCapacity;
        this.started=true;
        this.stopped=true;




    }



    public void tank(int fuelTankCapacity){ ;



        this.remainingFuelAmount = fuelTankCapacity;

    }  

    public void drive(int speed, int kilometers) {

        stopped=false;

        System.out.println("VW Golf has been driven for " + kilometers + " km with speed " + speed + "km/h");

    }

    public void startEngine(){

        if (started) {
            System.out.println("VW engine - engine start");
        }else {
            System.out.println("VW engine is already started");
        }

        started=false;

        }



   public void stopEngine(){

       if (stopped) {
           System.out.println("VW engine - engine Stop");
       }else {
           System.out.println("VW engine is already stopped");
       }

       stopped=false;

   };




}
