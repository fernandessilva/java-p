import java.util.Locale;
import java.util.Scanner;

public class ex21 {
//    Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//    de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//    conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//    peso 5.
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, n = sc.nextInt();

        double media;
        double x, y, z;

        for (i = 0; i < n; i++) {
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();

            media = (x * 2.0 + y * 3.0 + z * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);

        }
        sc.close();

    }
}
