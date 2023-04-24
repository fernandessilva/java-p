import java.util.Locale;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Qual o valor da sua renda?");
        double income = sc.nextDouble();

        double taxes;
        if (income <= 2000) {
            taxes = 0.0;

        } else if (income <= 3000) {
            taxes = (income - 2000.0) * 0.08;

        } else if (income <= 4500) {
            taxes = (income - 3000.0) * 0.18 + 1000.0 * 0.08;

        } else {
            taxes = (income - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        if (taxes == 0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$: %.2f%n", taxes);
        }

        sc.close();
    }
}
