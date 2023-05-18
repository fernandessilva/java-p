package application;

import entities.Product2;

import java.util.Locale;
import java.util.Scanner;

public class StockProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product2 product;


        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();


        Product2 product2 = new Product2(name, price, quantity);


        System.out.print("Product data: " + product2 + "\n");
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product2.addProducts(quantity);
        System.out.println("Updated data: " + product2);
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product2.removeProducts(quantity);
        System.out.print("Updated data: " + product2);

    }
}
