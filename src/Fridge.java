public class Fridge extends Product{
    private int wattage;
    private String color;
    private String brand;
    private double cubicFeet;
    private boolean hasFreezer;

    public Fridge(double price, int quantity, int wattage, String color, String brand, double cubicFeet, boolean freezer){
        super(price, quantity);
        this.wattage = wattage;
        this.color = color;
        this.brand = brand;
        this.cubicFeet = cubicFeet;
        hasFreezer = freezer;

    }


    public String toString(){
        if (hasFreezer == true){
            return String.format("%.2f cu. ft. %s Fridge with Freezer (%s, %d watts) (%.1f dollars each, %d in stock, %d sold)", cubicFeet, brand, color, wattage, price, stockQuantity, soldQuantity);

        }else{
            return String.format("%.2f cu. ft. %s Fridge (%s, %d watts) (%.1f dollars each, %d in stock, %d sold)", cubicFeet, brand, color, wattage, price, stockQuantity, soldQuantity);
        }

    }
}
