import java.util.Scanner;

public class ex24 {
//    Ler um número inteiro N e calcular todos os seus divisores.


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i, x = sc.nextInt();

        for (i = 1; i <=x; i ++){
            if(x % i == 0){
                System.out.println(i);
            }
        }
sc.close();
    }
}
