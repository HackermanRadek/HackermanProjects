public class Engine {

private boolean isStarted;
    private String name;
    private int horsePower;
    private int capacity;

    private int maxSpeed;

    public Engine(String name, int horsePower, int capacity) {

        this.name=name;
        this.horsePower=horsePower;
        this.capacity=capacity;
        this.maxSpeed=2*this.horsePower;
    }





  public  void startEngine(){



        if (isStarted){
            System.out.println("Engine is already started");
        }else {
            System.out.println("Engine start");
        }

        isStarted=true;

    }
   public void stopEngine(){
        if (!isStarted){
            System.out.println("Engine is already stopped");
        }else {
            System.out.println("Engine stop");
        }
        isStarted=false;


    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void isStarted(boolean started) {
        isStarted = started;
    }

    public boolean isStarted() {
        return isStarted;
    }






}










