import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        String dia;
//
//
//        if (x == 1) {
//            dia = "domingo";
//        } else if (x == 2) {
//            dia = "segunda";
//        } else if (x == 3) {
//            dia = "terca";
//        } else if (x == 4) {
//            dia = "quarta";
//        } else if (x == 5) {
//            dia = "quinta";
//        } else if (x == 6) {
//            dia = "sexta";
//        } else if (x == 7) {
//            dia = "sabado";
//        } else {
//            dia = "valor invalido";
//        }
//        System.out.println("Dia da semana: " + dia);
//        sc.close();
//        Fazer um programa para ler um valor inteiro de 1 a 7 representando um
//        dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
//                Escrever na tela o dia da semana correspondente,

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;
        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }

}