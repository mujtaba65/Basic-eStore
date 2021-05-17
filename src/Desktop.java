public class Desktop extends Product{
    private double cpuSpeed;
    private int ram;
    private boolean ssd;
    private int storage;
    private String profile;


    public Desktop(double price, int quantity, double icpuSpeed, int iram, boolean issd, int istorage,  String iprofile){
        super(price, quantity);
        cpuSpeed = icpuSpeed;
        ram = iram;
        storage = istorage;
        ssd = issd;
        profile = iprofile;

    }



    public String toString(){
        if (ssd){
            return String.format("%s Desktop PC with %.2f ghz CPU, %d GB RAM, %d GB SSD drive. (%.1f dollars each, %d in stock, %d sold)", profile, cpuSpeed, ram, storage, price, stockQuantity, soldQuantity);

        }else{
            return String.format("%s Desktop PC with %.2f ghz CPU, %d GB RAM, %d GB HDD drive. (%.1f dollars each, %d in stock, %d sold)", profile, cpuSpeed, ram, storage, price, stockQuantity, soldQuantity);
        }
    }
}
