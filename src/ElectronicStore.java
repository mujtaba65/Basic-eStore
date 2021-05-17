import java.util.Scanner;

public class ElectronicStore {
    private final int MAX_PRODUCTS = 10;
    private String name;
    private double revenue;
    private Product[] products;


    public ElectronicStore(String name) {
        this.name = name;
        products = new Product[MAX_PRODUCTS];
        revenue = 0;
    }
    public void printStock(){
        for(int i = 0; i < MAX_PRODUCTS ; i++){
            if(products[i] != null) {
                System.out.println(i + "." + products[i]);


            }

        }


    }


    public String getName(){
        return name;
    }

    public boolean addProduct(Product p){
        for(int i = 0 ; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = p;
                return true;

            }
        }
        return false;
    }


    public void sellProducts(){
        int amount1;
        int index1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the product you want: "); // Input for product
        index1 = in.nextInt();
        System.out.println("Enter the amount you want: "); // Input for amount
        amount1 = in.nextInt();
        if(index1 > 0 && index1 <= MAX_PRODUCTS) {
            revenue += products[index1].sellUnits(amount1);

        }else{
            System.out.println("INVALID INPUT");

        }

    }


   public void sellProducts(int item, int amount){
       if (item < 10 && item >= 0 && amount >= 0){
           if(!(products[item] == null)){
               revenue += products[item].sellUnits(amount);
           }
       }
   }

    public double getRevenue(){
        return revenue;
    }


}
