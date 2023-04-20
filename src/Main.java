import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double pi = 3.1415965359;
        System.out.printf("%.2f%n", pi);
        System.out.printf("%.4f%n", pi);
        System.out.println(pi);
        System.out.println("O valor de pi é: " + pi + "!");
        System.out.printf("O valor de pi é: %.2f!%n", pi);

        String name = "Lucas";
        int age = 27;
        double income1 = 1500.00;
        double income2 = 1390.00;
        double totalIncome = income1 + income2;

        System.out.printf("%s tem %d anos e ganha %.2f reais%n", name, age, totalIncome);

//                Exemplo input com Scanner
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
        x = sc.nextLine();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.printf("My name is %s%n.", x);
        System.out.printf("I'm %d years old, ", y);
        System.out.printf("and I'm %.2fm tall.%n", z);

        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double price = sc.nextDouble();

        double areaSqr = width * height;
        double terrainPrice = areaSqr * price;
        System.out.printf("Area = %.2f%n", areaSqr);
        System.out.printf("Preço = $%.2f reais%n", terrainPrice);
        Locale.setDefault(Locale.US);


    }
}

