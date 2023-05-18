package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
//        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int prod1, quant1, prod2, quant2;
        double prodPrice1, prodPrice2, totalAll;

        prod1 = sc.nextInt();
        quant1 = sc.nextInt();
        prodPrice1 = sc.nextDouble();
        prod2 = sc.nextInt();
        quant2 = sc.nextInt();
        prodPrice2 = sc.nextDouble();

        totalAll = quant1 * prodPrice1 + quant2 * prodPrice2;

        System.out.printf("Valor a pagar: R$%.2f%n", totalAll);


    }
}
