 class Car extends Engine  {

      private String carName;
      private double fuelTankCapacity;
      private double remainingFuelAmount;

      private Engine engine;


      public Car(String carName, Engine diesel, double fuelTankCapacity, String name, int horsePower, int capacity) {
           super(name, horsePower, capacity);

           this.carName=carName;
           this.engine=diesel;
           this.fuelTankCapacity=fuelTankCapacity;
           this.remainingFuelAmount=fuelTankCapacity;
      }

      @Override
      public void startEngine() {
           super.startEngine();
      }

      @Override
      public void stopEngine() {
           super.stopEngine();
      }

      public void tank () {

           this.remainingFuelAmount = fuelTankCapacity;

           System.out.println(carName + " has been tanked up.");
           System.out.println("Remaining fuel amount: " + this.remainingFuelAmount + " L");

      }
      public void drive ( int speed, double distance){


           this.remainingFuelAmount = this.remainingFuelAmount - (distance / 5);

           double distanceToEnd = (distance + (5 * this.remainingFuelAmount));


           if (engine.isStarted() && speed <= engine.getMaxSpeed() && this.remainingFuelAmount < 0 && distanceToEnd != 0) {


                System.out.println(carName + " has been driven with a speed of " + speed + " km/h for a distance of " +
                        +distanceToEnd + " km.");


           } else if (speed > engine.getMaxSpeed()) {

                System.out.println("You can drive only with max speed");

                this.remainingFuelAmount = this.remainingFuelAmount + (distance / 5);

           } else if (distanceToEnd == 0) {
                System.out.println("You must tank the car first!");
           } else if (isStarted==false) {
                System.out.println("Start engine first");

                this.remainingFuelAmount = this.remainingFuelAmount = this.remainingFuelAmount + (distance / 5);
           } else {
                System.out.println(carName + " has been driven with a speed of " + speed + " km/h for a distance of "
                        + distance + " km.");

           }

           if (this.remainingFuelAmount <= 0) {

                this.remainingFuelAmount = 0;


                System.out.println("Tank is empty.");
           } else {
                System.out.println("Remaining fuel amount: " + this.remainingFuelAmount + " L.");
           }
      }
 }
