public class BeerTester {
    public static void main(String[] args) {
        Beer beer1 = new Beer("Sommer", "smakowy", 4, 10);
        Beer beer2 = new Beer("Kustosz", "Biedronkowy", 7, 8);
        Beer beer3 = new Beer("Lech", "Free", 0, 0);
        Beer beer4 = new Beer("Desperados", "Beer tequilla", 8, 10);


        beer1.equals(beer2);
        beer1.equals(beer1);
        beer3.equals(beer4);
        beer3.hashCode();






    }
}
