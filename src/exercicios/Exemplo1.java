package exercicios;

import entities.Circle;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Circle x = new Circle();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.printf("Circumference: %.2f%n", x.calculateCircunference(radius));
        System.out.printf("Volume: %.2f%n", x.calculateVolume(radius));
        System.out.printf("Pi Value: %.2f", x.PI);


        sc.close();
    }
}