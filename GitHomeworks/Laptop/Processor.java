public class Processor {

    private String name;
    private double frequency;
    private int numberOfCores;



    public Processor(String name, double frequency, int numberOfCores){
        this.name=name;
        this.frequency=frequency;
        this.numberOfCores=numberOfCores;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }
}
