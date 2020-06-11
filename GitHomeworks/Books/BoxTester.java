import java.util.LinkedList;

public class BoxTester {

    public static void main(String[] args) {

        Fantasy witcher = new Fantasy("The Wither");
        Toy ball = new Toy("Ball");
        Food pizza = new Food("Pizza");
        Book sniper = new Book("Sniper");

        LinkedList items = new LinkedList();
        items.add(witcher);
        items.add(ball);
        items.add(pizza);
        items.add(sniper);


        Box box = new Box();
        box.addItems(witcher);
        box.addItems(ball);
        box.addItems(pizza);
        box.addItems(sniper);


        System.out.println(box);


        Box<Toy> toyBox = new Box<>();
        toyBox.addItems(ball);
        System.out.println(toyBox);

        Box<Book> bookBox = new Box<>();
        bookBox.addItems(sniper);
        bookBox.addItems(witcher);
        System.out.println(bookBox);

        Box<Food> foodBox = new Box<>();
        foodBox.addItems(pizza);
        System.out.println(foodBox);

        Box<Fantasy> fantasyBox = new Box<>();
        fantasyBox.addItems(witcher);
        System.out.println(fantasyBox);



            Shelf toyShelf = new Shelf(toyBox);
        System.out.println(toyShelf);


        Shelf bookShelf = new Shelf(bookBox);
        System.out.println(bookShelf);


        Shelf generalShelf = new Shelf(box);
        System.out.println(generalShelf);


    }


}
