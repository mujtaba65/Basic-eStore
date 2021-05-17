public class ToasterOven extends Product{
    private int wattage;
    private String color;
    private String brand;
    private int width;
    private boolean convection;


    public ToasterOven(double price, int quantity, int iwattage, String icolor, String ibrand, int iwidth, boolean iconvection){
        super(price, quantity);
        wattage = iwattage;
        color = icolor;
        brand = ibrand;
        width = iwidth;
        convection = iconvection;
    }





    public String toString(){
        if (convection == true){
            return String.format("%d inch %s Toaster with convection (%s, %d watts) (%.1f dollars each, %d in stock, %d sold)", width, brand, color, wattage, price, stockQuantity, soldQuantity);

        }else{
            return String.format("%d inch %s Toaster (%s, %d watts) (%.1f dollars each, %d in stock, %d sold)", width, brand, color, wattage, price, stockQuantity, soldQuantity);
        }

    }


}
