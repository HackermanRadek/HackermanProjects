public class LaptopTester {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i9", 4.8, 8);
        HardDrive hardDrive = new HardDrive("Twardzioch", "HDD", 1000);
        Laptop laptop = new Laptop("MSI Gaming", processor, hardDrive,
                16, 1.5, 16);
    }
}
