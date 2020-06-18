import java.util.Objects;

public class Parts {

    private String name;
    private Integer number;


    public Parts(Integer number, String name){

        this.number=number;
        this.name=name;

    }


    @Override
    public String toString() {
        return "Parts{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parts parts = (Parts) o;
        return Objects.equals(name, parts.name) &&
                Objects.equals(number, parts.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    }



