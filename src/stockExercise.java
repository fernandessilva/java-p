import java.util.Locale;
import java.util.Scanner;
import entities.Product;
import entities.Triangle;

public class stockExercise {

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        Product product;
        product = new Product();
        System.out.print("Name: ");
        product.name = sc.next();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        product.totalValueInStock();
        System.out.print("Product data: " + product.name);
        System.out.printf(", $ %.2f, ",  product.price);
        System.out.print(product.quantity  + " units, ");
        System.out.printf("Total: $ %.2f%n", product.totalValueInStock());

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);


    }

}