package exercicios;

import java.util.Scanner;

public class ex19 {
    public static void main (String[] args){
//        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//        X, se for o caso.
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int i;
        for (i = 1; i <= X; i = i + 2) {
            System.out.println(i);
        }
sc.close();

    }
}
