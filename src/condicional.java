import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hora;
        System.out.println("Quantas horas?");
        hora = sc.nextDouble();

        if (hora < 12.00) {
            System.out.println("Boa dia!");
        } else if (hora < 18.00) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        sc.close();
    }
}
