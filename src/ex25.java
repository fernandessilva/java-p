import java.util.Scanner;

public class ex25 {
    //    Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//    começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//    exemplo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;

        for (i = 1; i <= n; i++) {
            double square = Math.pow(i, 2);
            double cube = Math.pow(i, 3);
            System.out.printf("%d %.0f %.0f%n", i, square, cube);
        }


        sc.close();
    }
}
