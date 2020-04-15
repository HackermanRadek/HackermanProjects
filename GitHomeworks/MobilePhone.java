public class MobilePhone {

    private String brand;
    private String model;
    private int batteryCapacity;
    private int remainBattery;
    private int memory;
    private int freeMemory;


    public MobilePhone(String brand, String model, int batteryCapacity, int memory) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.remainBattery = remainBattery;
        this.memory = memory;
        this.freeMemory = freeMemory;
    }


    public void install(String nameOfApplication, int weightOfApplication) {

        this.memory = memory - weightOfApplication;

        this.freeMemory = this.memory;


        if (this.freeMemory <= 0) {

            this.freeMemory = 0;

            System.out.println("You cant install " + nameOfApplication + ". There is not enough memory. ");

        } else {
            System.out.println("Application " + nameOfApplication + " has been installed on Sony Xperia L1 ");
            System.out.println("Free memory: " + this.freeMemory);
        }

        if (this.batteryCapacity <= 0) {
            System.out.println("You cannot run " + nameOfApplication + " The phone has been discharged ");
        }

    }


    public void use(String nameOfApplication, int hours) {


        int i = 100 * hours;

        this.batteryCapacity = batteryCapacity - i;

        this.remainBattery = this.batteryCapacity;


          if (this.remainBattery<=0){


              int x = hours -(( i+this.remainBattery)/100);

              System.out.println("Application " + nameOfApplication + " has been used for " + x + "hours");

              this.remainBattery=0;

          }else{
              System.out.println("Application " + nameOfApplication + " has been used for " + hours + " hours");
          }
    }


    public void charge() {

        this.remainBattery = 1000;

        System.out.println("Sony Xperia L1 has been charged");

    }
}

