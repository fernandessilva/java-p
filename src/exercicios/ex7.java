package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
//        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//        mostre:
//        a) a área do triângulo retângulo que tem A por base e C por altura.
//        b) a área do círculo de raio C. (pi = 3.14159)
//        c) a área do trapézio que tem A e B por bases e C por altura.
//        d) a área do quadrado que tem lado B.
//        e) a área do retângulo que tem lados A e B.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C, triangle, circle, trapeze, square, rectangle, pi = 3.14159;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        triangle = A * C * 0.5;
        circle = pi * Math.pow(C, 2) ;
        trapeze = (A + B) * C * 0.5;
        square = B * B;
        rectangle = A * B;

        System.out.printf("TRIÂNGULO: %.3f%n", triangle);
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPÉZIO: %.3f%n", trapeze);
        System.out.printf("QUADRADO: %.3f%n", square);
        System.out.printf("RETANGULO: %.3f%n", rectangle);

    }
}
