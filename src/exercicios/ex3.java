package exercicios;

import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
//        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//        de A e B pelo produto de C e D
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int dif = (a*b - c*d);

        System.out.printf("DIFERENÇA = %d", dif);
        sc.close();
    }
}
