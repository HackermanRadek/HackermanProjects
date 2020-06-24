import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class BoxTester {

    public static void main(String[] args) {

        Fantasy witcher = new Fantasy("The Wither");
        Toy ball = new Toy("Ball");
        Food pizza = new Food("Pizza");
        Book sniper = new Book("Sniper");

        LinkedList<Item> items = new LinkedList();
        items.add(witcher);
        items.add(ball);
        items.add(pizza);
        items.add(sniper);


        Box<Item> box = new Box();
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

        Shelf<Box> shelf = new Shelf();
        shelf.addBoxes(bookBox);
        shelf.addBoxes(fantasyBox);
        shelf.addBoxes(toyBox);
        shelf.addBoxes(foodBox);
        System.out.println(shelf);

        Shelf<Box<Toy>> toyShelf = new Shelf<>();
        toyShelf.addBoxes(toyBox);
        System.out.println(toyShelf);


        Shelf<Box<Food>>foodShelf = new Shelf<>();
        foodShelf.addBoxes(foodBox);
        System.out.println(foodShelf);


        Shelf<Box<Fantasy>> fantasyShelf  = new Shelf<>();
        fantasyShelf.addBoxes(fantasyBox);
        System.out.println(fantasyShelf);



        Shelf<Box<Book>> bookShelf = new Shelf<>();
            bookShelf.addBoxes(bookBox);


    }
}
