/******************************************************************************
De la cruz, Juvy Anncel
BSIT3-1

*******************************************************************************/
import java.util.ArrayList;
import java.util.Scanner;

class Product{
    private String name;
    private double price;
    
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
}

        
class InventoryManagementSystem{
    private ArrayList <Product> products;
    
    public InventoryManagementSystem(){
        products = new ArrayList <Product>();
    }
    
    public void addProduct(String name, double price){
        Product item = new Product(name, price);
        products.add(item);
        System.out.println("The product has been added successfully! (" +item.getName()+ " - " +item.getPrice()+ " PHP)");
    }
    
    public void displayProducts(){
        if(products.isEmpty()){
            System.out.println("No products are available..");
            return;
        }
        System.out.println("\nInventory:");
        int count = 1;                               // to add numbering in the list
        for(Product item: products){
            System.out.println(count + ") " +item.getName()+ " - " +item.getPrice() +" PHP");
            count++;
        }
    }
}


public class InventoryManagementApp{
    public static void main(String [] args){
        InventoryManagementSystem manageSystem = new InventoryManagementSystem();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("--------------------------------------------");
        System.out.println("Welcome to the Inventory Management System!");
        System.out.println("by: Juvy Anncel De la Cruz");
        System.out.println("--------------------------------------------");
        
        while(true){
            System.out.println("\nMenu: \n[1] Add a Product \n[2] Display Products \n[3] Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();        // to clear leftover newline character before reading the actual user input
            
            switch(choice){
                case 1:
                    System.out.print("\nProduct Name: ");
                    String name = scan.nextLine();
                    
                    System.out.print("Price: ");
                    double price = scan.nextDouble();
                    scan.nextLine();
                    
                    manageSystem.addProduct(name, price);
                    break;
                    
                case 2:
                    manageSystem.displayProducts();
                    break;
                
                case 3:
                    System.out.println("Goodbye, have a nice day!");
                    scan.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice.. please try again!");
            }
        }
        
    }
}

