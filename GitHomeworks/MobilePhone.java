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


            this.memory=this.memory-weightOfApplication;

        if (this.memory<=0){


            System.out.println("You cannot install application " + nameOfApplication + ". There is not enough memory.");
        }else{

            System.out.println("Application " + nameOfApplication + " has been installed on Sony Xperia ");
            System.out.println("Free memory: " + this.memory);
        }

    } public void use(String nameOfApplication, int hours){

        System.out.println(this.remainBattery);

        int i = 100*hours;
        this.remainBattery=this.remainBattery-i;
        int k = (i-this.remainBattery)/100;


        if (this.remainBattery<=0){
            int x = hours-k;

            System.out.println("Application " + nameOfApplication + " has been used for " + x + " hours.");
            System.out.println("Phone has been discharged.");
        }   else {

            System.out.println("Application " + nameOfApplication + " has been used for " + hours + " hours.");
            System.out.println("Remain battery " + this.remainBattery + " mAh");
        }





    }   public void charge(){

    }




}