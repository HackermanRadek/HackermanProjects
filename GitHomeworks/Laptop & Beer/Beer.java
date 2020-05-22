public class Beer {

    private String name;
    private String type;
    private int alcoholAmount;
    private int volume;



    public Beer (String name, String type, int alcoholAmount, int volume){
        this.name=name;
        this.type=type;
        this.alcoholAmount=alcoholAmount;
        this.volume=volume;
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
        public String toString(){
        return name;
        }

        @Override
    public boolean equals(Object another) {
            if (another == null) {
                return false;
            }
            if (this==another){

                System.out.println("takie same piwka");
                return true;
            }
            System.out.println("inne piwka");
            return false;
        }

}
