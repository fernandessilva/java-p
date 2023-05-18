package exercicios;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
//        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//        começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Scanner sc = new Scanner(System.in);
        int inicio, termino;
        inicio = sc.nextInt();
        termino = sc.nextInt();
        int duracao;
        if (inicio < termino){
            duracao = termino - inicio;
        }else {
            duracao = 24 - inicio + termino;
        }
        System.out.println("O jogo durou " + duracao + " hora(s)");
        sc.close();



    }
}
