public abstract class Product{
/*All of them are protected beacause all  3 variables are needed
in child classes(laptops, desktop, fridge, toaster oven), if they
were private we won't be able to access these variables inside those classes.
 */
    protected double price;
    protected int stockQuantity;
    protected int soldQuantity;

    public Product(double price, int quantity){
        this.price = price;
        this.stockQuantity = quantity;

    }

    public double sellUnits(int amount){
        if(stockQuantity >= amount){
            soldQuantity += amount;
            stockQuantity -= amount;


            return amount * price;
        }else{
            return 0.0;
        }

    }


}
