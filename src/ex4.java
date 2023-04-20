import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
//        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//        decimais.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int emp, hoursWorked;
        double salaryHour, salaryEmp;
        emp = sc.nextInt();
        hoursWorked = sc.nextInt();
        salaryHour = sc.nextDouble();
        salaryEmp = salaryHour * hoursWorked;

        System.out.println("Employee number: " + emp);
        System.out.printf("Salary: U$%.2f%n", salaryEmp);
    }

}
