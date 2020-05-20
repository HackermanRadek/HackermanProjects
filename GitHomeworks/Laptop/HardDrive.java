public class HardDrive {
    private String name;
    private String type;
    private int capacity;


    public HardDrive(String name, String type, int capacity){
        this.name=name;
        this.type=type;
        this.capacity=capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
