package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, n;
        n = sc.nextInt();
        double divisao;
        for (i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Locale.setDefault(Locale.US);

            if (b == 0) {
                System.out.println("Divisão impossível");
            } else {
                divisao = (double) a / b;
                System.out.printf("%.1f%n", divisao);
            }

        }
        sc.close();
    }

}
