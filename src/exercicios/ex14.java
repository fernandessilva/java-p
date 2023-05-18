package exercicios;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
//        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//                Se o ponto estiver na origem, escreva a mensagem “Origem”.
//        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de x");
        double x = sc.nextDouble();
        System.out.println("Digite o valor de y");
        double y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Ponto na origem");
        } else if (x == 0) {
            System.out.println("ponto sobre o eixo y");
        } else if (y == 0) {
            System.out.println("Ponto sobre o eixo x");
        } else if (x > 0 && y > 0) {
            System.out.println("ponto no quadrante 1");
        } else if (x < 0 && y > 0) {
            System.out.println("ponto no quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("ponto no quadrante 3");
        } else {
            System.out.println("ponto no quadrante 4");
        }


        sc.close();
    }
}
