package INICIANTE;
import java.util.Scanner;
public class Ex1008 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double valor = sc.nextDouble();
        double SALARY = horas * valor;
        System.out.printf("NUMBER = %d%n", numero);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);
    }
    
}
