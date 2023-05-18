package exercicios;

import util.Calculate;
import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ex28 {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price?: ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought?: ");
        double dollars = sc.nextDouble();
        double result = CurrencyConverter.priceToPay(dollarPrice, dollars);
        System.out.printf("Amount to be paid in reais = %.2f", result);

        sc.close();
    }
}
