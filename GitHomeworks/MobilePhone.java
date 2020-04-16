public class MobilePhone {

    private String brand;
    private String model;
    private int batteryCapacity;
    private int remainBattery;
    private int memory;
    private int freeMemory;
    private boolean discharged;

    public MobilePhone(String brand, String model, int batteryCapacity, int memory) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.memory = memory;

    }


    public void install(String nameOfApplication, int weightOfApplication) {

        this.freeMemory=this.memory;
        this.memory=memory-weightOfApplication;

        if (this.memory <= 0) {

            this.freeMemory = 0;

            System.out.println("You cant install " + nameOfApplication + ". There is not enough memory. ");

        } else {
            System.out.println("Application " + nameOfApplication + " has been installed on Sony Xperia L1 ");
            System.out.println("Free memory: " + this.memory);
        }




    }


    public void use(String nameOfApplication, int hours) {


        int i = 100 * hours;


        this.remainBattery = this.batteryCapacity;

        this.batteryCapacity = batteryCapacity - i;



        if (this.batteryCapacity <= 0) {

                this.batteryCapacity=0;

            int x = hours - ((i - remainBattery) / 100);

            System.out.println("Application " + nameOfApplication + " has been used for " + x + " hours");


            System.out.println("Phone has been discharged");



        } else {
            System.out.println("Application " + nameOfApplication + " has been used for " + hours + " hours");

            System.out.println("Remain battery: " + this.batteryCapacity + " mAh");

        }


    }
    public void charge() {
        


        System.out.println("Sony Xperia L1 has been charged");


    }
}

