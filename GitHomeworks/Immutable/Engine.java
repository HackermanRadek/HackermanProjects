public class Engine {

    private String type;
    private int horsePower;
    private int volume;

    public Engine(String type, int horsePower, int volume) {
        this.type=type;
        this.horsePower=horsePower;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                ", volume=" + volume +
                '}';
    }
}
