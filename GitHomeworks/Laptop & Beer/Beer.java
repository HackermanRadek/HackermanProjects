public class Beer  implements  Cloneable {

    private String name;
    private String type;
    private int alcoholAmount;
    private int volume;


    public Beer(String name, String type, int alcoholAmount, int volume) {
        this.name = name;
        this.type = type;
        this.alcoholAmount = alcoholAmount;
        this.volume = volume;
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

    public void setAlcoholAmount(int alcoholAmount) {
        this.alcoholAmount = alcoholAmount;
    }

    public int getAlcoholAmount() {
        return alcoholAmount;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "name: " + name + " type: " + type
                + " alcohol amount: " + alcoholAmount +
                " volume: " + volume ;
    }

    @Override
    public boolean equals(Object another) {
        if (another == null) {
            return false;
        }
        if (this == another) {
            return true;
        }

        if (!(another instanceof Beer)) {
            return false;
        }
        Beer anotherBeer = (Beer) another;
        if (this.alcoholAmount != anotherBeer.alcoholAmount) {
            return false;
        }
        if (this.type != anotherBeer.type) {
            return false;
        } if (this.volume != anotherBeer.volume){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode(){
        int minutyDoZgonu = (volume+alcoholAmount)*10;

        return minutyDoZgonu;

    }



}