package exercicios;

import java.util.Scanner;

public class funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        int higher = max(number1, number2, number3);

        showResult(higher);

        sc.close();

    }

    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher: " + value);
    }

}