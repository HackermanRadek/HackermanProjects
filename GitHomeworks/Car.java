 class Car {

     private String name;
    private int fuelTankCapacity;
    private int remainingFuelAmount;
    private boolean isStarted;
    private Engine diesel;


     public Car(String name, int fuelTankCapacity, Engine diesel) {

         this.name=name;
         this.fuelTankCapacity=fuelTankCapacity;
         this.remainingFuelAmount=fuelTankCapacity;
         this.isStarted = false;
     }

     public void startEngine() {

         System.out.println("VW engine - engine start");

         if (isStarted = true){
             System.out.println("VW engine is already started");
         }


     }

     public void stopEngine(){


         System.out.println("VW engine - engine stop");

        if (isStarted=false){
            System.out.println("VW engine is already stopped");
        }

     }


     public void tank(){

         this.remainingFuelAmount=fuelTankCapacity;

         System.out.println("VW Golf has been tanked up");

     }

    public void drive (int speed, double distance){

         if (speed>diesel.getMaxSpeed()){
             System.out.println("You can drive only with maximum speed");
         } else {
             System.out.println("VW Golf has been driven with a speed of " + speed + " km/h for a distance of "
             + distance + " km");
         }



    }




 }



