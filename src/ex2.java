import java.util.Locale;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double radius = sc.nextDouble();
        double area = Math.pow(radius, 2) * pi;

        System.out.printf("A = %.4f%n", area);

        sc.close();
    }
}
