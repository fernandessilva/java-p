import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Locale.setDefault(Locale.US);
//        double pi = 3.1415965359;
//        System.out.printf("%.2f%n" ,pi);
//        System.out.printf("%.4f%n" ,pi);
//        System.out.println(pi);
//        System.out.println("O valor de pi é: " + pi + "!");
//        System.out.printf("O valor de pi é: %.2f!%n", pi);
//
//        String name = "Lucas";
//        int age = 27;
//        double income1 = 1500.00;
//                double income2 = 1390.00;
//                double totalIncome = income1 + income2;
//
//                System.out.printf("%s tem %d anos e ganha %.2f reais%n", name, age, totalIncome);


        //        Products: Computer, which price is $ 2100,00
//        Office desk, with price is $ 650,00
//        Record: 30 years old, code 5290 and gender: F
//        Measure with eight decimal places: 53,23456700
//        Rounded (three decimal places): 53,235
//        Us decimal point: 53.235

//        String product1 = "Computer";
//        String product2 = "Office Desk";
//
//        int age = 30;
//        int code = 5290;
//        char gender = 'F';
//
//        double price1 = 2100.0;
//        double price2 = 650.50;
//
//        double measure = 53.234567;
//
//        System.out.println("Products:");
//        System.out.printf("%s, which price is $%.2f%n", product1, price1);
//        System.out.printf("%s, which price is $%.2f%n", product2, price2);
//
//        System.out.println("Record:");
//        System.out.printf("%d years old, code %d and gender: %s%n", age, code, gender);
//
//        System.out.printf("Measure: %.8f%n", measure);
//        Locale.setDefault(Locale.US);
//        System.out.printf("Rounded: %.3f%n", measure);Locale.setDefault(Locale.US);

//        String x;
//        int y;
//        double z;
//        x = sc.nextLine();
//        y = sc.nextInt();
//        z = sc.nextDouble();
//        System.out.printf("My name is %s%n.", x);
//        System.out.printf("I'm %d years old, ", y);
//        System.out.printf("and I'm %.2fm tall.%n", z);

//        double width = sc.nextDouble();
//        double height = sc.nextDouble();
//        double price = sc.nextDouble();
//
//        double areaSqr = width * height ;
//        double terrainPrice = areaSqr * price;
//        System.out.printf("Area = %.2f%n", areaSqr);
//        System.out.printf("Preço = $%.2f reais%n",terrainPrice);
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();
    int soma;
    soma = x + y;

    System.out.println("Soma = "+ soma);

        sc.close();
    }
}

