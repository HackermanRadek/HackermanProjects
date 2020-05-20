public class LaptopClone {

    public static void main(String[] args) throws CloneNotSupportedException {
        Processor superProcessor = new Processor("Intel Core i9", 4.8, 8);

        HardDrive superHardDrive = new HardDrive("Twardzioch", "HDD", 1000);

        Laptop superLaptop = new Laptop("MSI Gaming", superProcessor, superHardDrive,
                16, 1.5, 16);



        Laptop clone = superLaptop.clone();
        System.out.println(superLaptop.clone());

    }
}
