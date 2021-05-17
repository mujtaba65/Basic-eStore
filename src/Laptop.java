public class Laptop extends Product{
    private double cpuSpeed;
    private int ram;
    private boolean ssd;
    private int storage;
    private double screenSize;

    public Laptop(double price, int quantity, double CPU, int RAM, boolean StorageType, int Storage, double ScreenSize){
        super(price, quantity);
        cpuSpeed = CPU;
        ram = RAM;
        storage = Storage;
        ssd = StorageType;
        screenSize = ScreenSize;

    }

    public String toString(){
        if (ssd) {
            return String.format(" %.1f inch Laptop PC with %.2f ghz CPU, %dGB RAM, %d GB SSD drive. (%.1f dollars each, %d in stock, %d sold)", screenSize, cpuSpeed, ram, storage, price, stockQuantity, soldQuantity);

        }else{
            return String.format(" %.1f inch Laptop PC with %.2f ghz CPU, %dGB RAM, %d GB HDD drive. (%.1f dollars each, %d in stock, %d sold)", screenSize, cpuSpeed, ram, storage, price, stockQuantity, soldQuantity);
        }
    }
}
