import java.util.Scanner;

public class Product {
    public void AddProduct() {
        String datetime = "12/12/2020 12:12:20 AM";
        String [] values = datetime.split(" ");
        for (String s : values) {
            System.out.println(s);
        } 

        Scanner input = new Scanner (System.in);
        System.out.println("Enter the Product id");
        String id = input.next();
        System.out.println("Enter the Product name");
        String name = input.next();
        System.out.println("Enter the Product price");
        int price = input.nextInt();

        System.out.println("Product details:"+ id + "," + name + "," + price);
        
    }
    
    
}
