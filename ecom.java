class product{
    private int productid;
    private String productName;
    private double price ;

    product(int id, String name, double price){
        this.productid=id;
        this.productName= name;
this.price=price;

    }
    public void display(){
        System.out.println("product id  :   "+productid);
        System.out.println("product name :  "+productName);
        System.out.println("product price:  "+price);

    }
}
public class ecom{
    public static void main(String[]args){
product product1= new product (1,"mbl", 12000);
product product2= new product(2, "charger", 2000);
product product3= new product(3, "laptop", 2000);
product1.display();
product2.display();
product3.display();
    }

    
}