package INICIANTE;
import java.util.Scanner;

public class Ex1005 {
    public static void main(String[]args){
        double num1;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextDouble();
        double num2;
        num2 = scanner.nextDouble();
        double media = (num1 * 3.5 + num2 * 7.5) / 11;
        System.out.printf("MEDIA = %.5f\n", media);
    }
}