 class Car {

     private String name;
    private double fuelTankCapacity;
    private double remainingFuelAmount;
    private boolean isStarted;
    private Engine diesel;


     public Car(String name, double fuelTankCapacity, Engine diesel) {

         this.name=name;
         this.fuelTankCapacity=fuelTankCapacity;
         this.remainingFuelAmount=fuelTankCapacity;
         this.diesel=diesel;


     }
     public void startEngine() {

        if (isStarted) {

            System.out.println("VW engine is already started");
        } else {
            System.out.println("VW engine - engine start");
        }


         isStarted = true;




     }

     public void stopEngine(){

         if (isStarted==false){
             System.out.println("VW engine is already stopped");
         }else {
             System.out.println("VW engine - engine stop");
         }

         isStarted=false;

     }



     public void tank(){

         this.remainingFuelAmount=fuelTankCapacity;

         System.out.println("VW Golf has been tanked up.");
         System.out.println("Remaining fuel amount: " + this.remainingFuelAmount + " L");

     }

    public void drive (int speed, double distance) {


        this.remainingFuelAmount = this.remainingFuelAmount - (distance/5);

        double distanceToEnd=( distance +  (5*this.remainingFuelAmount));


        if (isStarted && speed<= diesel.getMaxSpeed() && this.remainingFuelAmount<0 && distanceToEnd !=0 ) {



            System.out.println("VW Golf has been driven with a speed of " + speed + " km/h for a distance of " +
                    + distanceToEnd + " km.");


        }else if (speed>diesel.getMaxSpeed()) {

             System.out.println("You can drive only with max speed");

             this.remainingFuelAmount=this.remainingFuelAmount+(distance/5);

        } else if (distanceToEnd==0){
            System.out.println("You must tank the car first!");
        }





        else if (isStarted==false){
            System.out.println("Start engine first");

            this.remainingFuelAmount=this.remainingFuelAmount=this.remainingFuelAmount+(distance/5);
        }



        else {
            System.out.println("VW Golf has been driven with a speed of " + speed + " km/h for a distance of "
                    + distance + " km.");

        }

        if (this.remainingFuelAmount<=0){

            this.remainingFuelAmount=0;


            System.out.println( "Tank is empty." );
        }else {
            System.out.println("Remaining fuel amount: " + this.remainingFuelAmount + " L.");
        }

    }
}
