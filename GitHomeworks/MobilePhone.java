public class MobilePhone {

    private String brand;
    private String model;
    private int batteryCapacity;
    private int remainBattery;
    private int memory;
    private int freeMemory;



    public MobilePhone(String brand, String model, int batteryCapacity, int memory ) {
        this.brand = brand;
        this.model = model;
        this.memory=memory;
        this.freeMemory=memory;
        this.batteryCapacity=batteryCapacity;
        this.remainBattery=batteryCapacity;


    }


    public void install (String nameOfApplication, int weightOfApplication){



            this.freeMemory=this.freeMemory-weightOfApplication;

        if (this.freeMemory<0){


            System.out.println("You cannot install application " + nameOfApplication + ". There is not enough memory.");
        }else{

            System.out.println("Application " + nameOfApplication + " has been installed on Sony Xperia ");
            System.out.println("Free memory: " + this.freeMemory);
        }

    } public void use(String nameOfApplication, int hours) {



        int decreaseBatteryBy100MAH = hours * 100;



        this.remainBattery = this.remainBattery - decreaseBatteryBy100MAH;

        int hoursLeftTo0 = ((decreaseBatteryBy100MAH + this.remainBattery) / 100);








        if (this.remainBattery < 0  && hoursLeftTo0 != 0) {


            System.out.println("Application " + nameOfApplication + " has been used for " + hoursLeftTo0 + " hours.");

            this.remainBattery = 0;

            System.out.println("Phone has been discharged.");

        }else if (hoursLeftTo0==0){

            System.out.println("You can`t run application " + nameOfApplication + ".Phone is discharged.");

        }else {
            System.out.println("Application " + nameOfApplication + " has been used for " + hours + "hours");
            System.out.println("Remain battery: " + this.remainBattery + "mAh");
        }



    }

    public void charge(){

        this.remainBattery=batteryCapacity;

        System.out.println("Phone has been charged. Remain battery " + this.remainBattery + " mAh");

    }




}