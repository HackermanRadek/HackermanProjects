public class Items implements Comparable<Items> {

    private String name;
    private int price;

    public Items(String name, int price){
        this.name=name;
        this.price=price;
    }




    @Override
    public String toString() {
        return "name: " + name + " price: " + price;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Items items1) {

        int result = Integer.compare(this.price, items1.price);

        return result;
    }
        public String compareName(Items items1){
        return items1.getName();
        }

}
