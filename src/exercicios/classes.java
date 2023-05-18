package exercicios;

import java.util.Locale;
import java.util.Scanner;
public class classes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle 1");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double areaTriangle1 = calculateArea(a, b, c);

        System.out.println("Enter the measures of triangle 2");
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        double areaTriangle2 = calculateArea(d, e, f);

        System.out.printf("Triangle 1 area: %.4f%n", areaTriangle1);
        System.out.printf("Triangle 1 area: %.4f%n", areaTriangle2);

        double higher = max(areaTriangle1, areaTriangle2);
        if (areaTriangle1 > areaTriangle2) {
            System.out.println("The larger triangle is the Triangle 1");
        } else {
            System.out.println("The larger triangle is the Triangle 2");
        }
        showResult(higher);
        sc.close();
    }
    public static double calculateArea(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }
    public static double max(double t1, double t2) {
        double aux;
        if (t1 > t2) {
            aux = t1;
        } else {
            aux = t2;
        }
        return aux;
    }
    public static void showResult(double value) {
        System.out.println("Larger area: " + value);
    }
}