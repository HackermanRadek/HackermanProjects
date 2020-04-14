public class MobilePhone {

    private String brand;
    private String model;
    private int batteryCapacity;
    private int memory;
    private int weightOfApplication;


    public MobilePhone(String brand, String model, int batteryCapacity, int memory) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;
        this.weightOfApplication = weightOfApplication;
    }


    public void install(String nameOfApplication, int weightOfApplication) {


        System.out.println("Weight of application: " + nameOfApplication + ": " + weightOfApplication);

        this.memory = memory - weightOfApplication;

        if (this.memory < 0) {

            this.memory = 0;

            System.out.println("Free memory: " + this.memory);

            System.out.println("You cannot install " + nameOfApplication + " There is not enough memory ");

        } else {
            System.out.println("Application " + nameOfApplication + "has been installed on Sony Xperia L1");
            System.out.println("Free memory " + this.memory);
        }

        if (this.batteryCapacity <= 0) {
            System.out.println("You cannot run " + nameOfApplication + " The phone has been discharged ");
        }

    }


    public void use(String nameOfApplication, int hours) {


        int i = 100 * hours;

        this.batteryCapacity = batteryCapacity - i;

        int a = this.batteryCapacity/100;

        if (this.batteryCapacity<=0) {

            this.batteryCapacity=0;
            System.out.println("Application " + nameOfApplication + " has been used for " + a + " hours");

            System.out.println( "Remain battery capacity: " + this.batteryCapacity + " mAh");


        }else {



            System.out.println("Application " + nameOfApplication + " has been used for " + hours + " hours");
            System.out.println("Remain battery capacity: " + this.batteryCapacity + " mAh");

        }






    }


    public void charge() {

        this.batteryCapacity = 1000;

        System.out.println("Sony Xperia L1 has been charged");

    }

}