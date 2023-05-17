import util.Calculate;

import java.util.Locale;
import java.util.Scanner;

public class Exemple3 {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculate.circumference(radius);
        double v = Calculate.volume(radius);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Pi Value: %.2f", Calculate.PI);

        sc.close();
    }
}
