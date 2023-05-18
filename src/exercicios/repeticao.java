package exercicios;

import java.util.Scanner;

public class repeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Digite um valor de 0 até 100");
//        int x = sc.nextInt();
//        int soma = 0;
//        while (x <= 100) {
//            x = x + 1;
//
//        }
//        System.out.println(x);

        int N = sc.nextInt();
        int soma = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);
        sc.close();


    }


}

